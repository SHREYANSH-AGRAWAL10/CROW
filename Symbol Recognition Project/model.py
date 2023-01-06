import numpy as np
import cv2

def recognition():
    img = cv2.imread('newm.png') #read the image
    imgGrey = cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)  #convert the picture to gray scale

    #find the threshhold (source,threshold value,maximum threshold value,type)
    _, thrash = cv2.threshold(imgGrey,240,255,cv2.THRESH_BINARY)

    #find the contours(threshold image,mode,method)
    contours,_ = cv2.findContours(thrash,cv2.RETR_TREE,cv2.CHAIN_APPROX_NONE)

    #iterating over the contours

    for contour in contours:

        #draw the edges
        approx = cv2.approxPolyDP(contour,0.01*cv2.arcLength(contour,True),True)
        cv2.drawContours(img,[approx],0,(0,0,0),5)

        x = approx.ravel()[0]
        y = approx.ravel()[1]

        #name the shapes
        if len(approx) == 3:
            cv2.putText(img,"TRIANGLE",(x,y),cv2.FONT_HERSHEY_COMPLEX,0.5,(0,0,0))

        elif len(approx) == 4:
            #rectangle or square
            x,y,w,h = cv2.boundingRect(approx)
            aspectRatio = float(w)/h
            #print(aspectRatio)
            if aspectRatio>=0.95 and aspectRatio<=1.05:
                cv2.putText(img, "SQUARE", (x, y), cv2.FONT_HERSHEY_COMPLEX, 0.5, (0, 0, 0))
            else:
                cv2.putText(img,"RECTANGLE",(x,y),cv2.FONT_HERSHEY_COMPLEX,0.5,(0,0,0))

        elif len(approx) == 5:
            cv2.putText(img,"PENTAGON",(x,y),cv2.FONT_HERSHEY_COMPLEX,0.5,(0,0,0))

        elif len(approx) == 6:
            cv2.putText(img,"HEXAGON",(x,y),cv2.FONT_HERSHEY_COMPLEX,0.5,(0,0,0))

        elif len(approx) == 7:
            cv2.putText(img,"HEPTAGON",(x,y),cv2.FONT_HERSHEY_COMPLEX,0.5,(0,0,0))

        elif len(approx) == 8:
            cv2.putText(img,"OCTAGON",(x,y),cv2.FONT_HERSHEY_COMPLEX,0.5,(0,0,0))

        elif len(approx) == 9:
            cv2.putText(img,"NANOGON",(x,y),cv2.FONT_HERSHEY_COMPLEX,0.5,(0,0,0))

        elif len(approx) == 10:
            cv2.putText(img,"STAR",(x,y),cv2.FONT_HERSHEY_COMPLEX,0.5,(0,0,0))

        else:
            cv2.putText(img,"CIRCLE",(x,y),cv2.FONT_HERSHEY_COMPLEX,0.5,(0,0,0))

    cv2.imshow("shapes",img)
    cv2.waitKey(0)
    cv2.destroyAllWindo

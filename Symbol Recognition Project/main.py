from tkinter import *
from  PIL import ImageTk,Image

import model
import main

#create the first window
root = Tk()
root.title("srs")   #SYMBOL RECOGNITION SYSTEM as title

#root.geometry("800x500")
#root.resizable(False,False)

#root.config(padx=100, pady=100, bg= '#6fefdb')

canvas = Canvas(root,width=600,height=300)
canvas.grid(columnspan=3)

#logo
logo = Image.open('logo1.jpg')
logo = ImageTk.PhotoImage(logo)
logo_label = Label(image=logo)
logo_label.image = logo
logo_label.grid(column=1,row=0)

#add text
title_label = Label(text='Select a way', fg='white', bg='#20bebe', font="Railway")
title_label.grid(columnspan=3,column=0, row=1)

#button1 for recognition

def fun1():
    model.recognition()

lb = StringVar()
lb1 = Button(root,command=fun1,textvariable=lb,font = "Railway")
lb.set("RECOGNITION")
lb1.grid(column=0,row=2)

#button2 for detection

def fun2():
    main.detection()

rb = StringVar()
rb1 = Button(root,command=fun2,textvariable=rb,font = "Railway")
rb.set("DETECTION")
rb1.grid(column=2,row=2)

root.mainloop()

//largest among 4

package com.company;
import java.util.*;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 4 numbers");

        //store the numbers in an array
        int a[] = new int[4];
        int i;
        for(i=0;i<4;i++){
            a[i] = sc.nextInt();
        }

        //initialize first element as largest
        int largest = a[0];
        
        //compare it with other elements
        for(i=1;i<4;i++){
            if(a[i] > largest)
                largest = a[i];
        }
        System.out.println("largest number is "+largest);
    }
}

//arrange an array in zig-zag fashion

package com.company;
import java.util.*;

import java.util.*;
public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        //create an array
        int arr[] = new int[n];
        int i,temp;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(i=0;i<n-1;i++){

            //for even position
            if(i%2 == 0 && arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

            //for odd position
            else if(i%2 == 1 && arr[i]<arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        //display the array
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

package com.company;
import java.util.*;
public class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i,j,temp;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            if(arr[i]>0){
                for(j=i+1;j<n;j++){
                    if(arr[j]<=0){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

//Armstrong number

package com.company;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        int n=num;

        //count the number of digits
        int count = 0;
        for(int i=0;i<n;i++){
            n=n/10;
            count++;
        }

        n = num;

        int d,sum=0;
        for(int i=0;i<n;i++){
            d=n%10;         //determines the last number
            sum += Math.pow(d,count);
            n=n/10;         //remove the last number
        }

        if(sum == num)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
    }
}

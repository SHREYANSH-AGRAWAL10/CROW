/*1. print a multiplication table of a number n
2. print pattern *
                 **
                 ***
                 ****
*/
package com.company;
import java.util.*;
public class Practice_methods {

    static void multiply(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        multiply(n);
        pattern1(n);
    }
}

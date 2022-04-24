//to check friendly pairs
//  (sum of divisors of num1)/num1 == (sum of divisors of num2)/num2

package com.company;
import java.util.*;
public class Q9 {
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int i,sum1=0,sum2=0;

        //find the sum of the divisors of m
        for(i=0;i<m;i++){
            if(m%i == 0){
                sum1+=i;
            }
        }

        //find the sum of divisors of n
        for(i=0;i<m;i++){
            if(n%i == 0){
                sum2+=i;
            }
        }

        if((sum1/m) == (sum2/n))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

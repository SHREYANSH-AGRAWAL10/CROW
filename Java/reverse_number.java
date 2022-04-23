//reverse a number

package com.company;
import java.util.*;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i,r,d=0;
        for(i=0;i<n;i++){
            r = n%10;
            d = 10*d + r;
            n=n/10;
        }
        System.out.println(d);
    }
}

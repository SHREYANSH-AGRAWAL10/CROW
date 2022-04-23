//odd or even

package com.company;
import java.util.*;
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}

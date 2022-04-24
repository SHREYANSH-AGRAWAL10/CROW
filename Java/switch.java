//WAP(menu driven) to calculate maturity amount

package com.company;
import java.util.*;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            int p,t;
            double r,amt;
            System.out.println("1. Term deposit\n2. Recurring deposit\n0. EXIT");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    p = sc.nextInt();;
                    r = sc.nextDouble();
                    t = sc.nextInt();
                    amt = p * Math.pow((1+r)/100,t);
                    System.out.println(amt);
                    break;

                case 2:
                    p = sc.nextInt();;
                    r = sc.nextDouble();
                    t = sc.nextInt();
                    amt = p*t+p*t*((t+1)/2)*r/100*(1/12);
                    System.out.println(amt);
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }while(ch!=0);
    }
}

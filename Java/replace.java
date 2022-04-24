//replace all 0s with 1

package com.company;
import java.util.*;
public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        String n = sc.nextLine();
        System.out.println(n.replace('0','1'));
    }
}

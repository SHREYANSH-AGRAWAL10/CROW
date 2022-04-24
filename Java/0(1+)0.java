//find the total no. of patters 0(1+)0 in a given string

package com.company;
import java.util.*;
public class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input string");
        String str = sc.nextLine();
        int n = str.length();
        int total=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '0'){
                for(int j=i+1;j<n;j++){
                    if(str.charAt(j) == '0'){
                        total++;
                        i=j;
                        i--;
                        break;
                    }
                }
            }
        }
        System.out.println(total);
    }
}

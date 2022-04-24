////sum of each rows and columns of a matrix

package com.company;
import java.util.*;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the matrix m x n");
        int m = sc.nextInt();
        int n = sc.nextInt();

        //create a matrix and input the elements
        int arr[][] = new int[m][n];
        int i,j;
        System.out.println("enter the elements");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //sum of rows
        int rsum = 0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                rsum += arr[i][j];
            }
            System.out.println("sum of row is "+rsum);
            rsum=0;
        }

        //sum of columns
        int csum=0;
        for(j=0;j<n;j++){
            for(i=0;i<m;i++){
                csum+=arr[i][j];
            }
            System.out.println("sum of column is "+csum);
            csum=0;
    }
    }
}

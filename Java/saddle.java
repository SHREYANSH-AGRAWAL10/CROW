//saddle point coordinates of a matrix

package com.company;
import java.util.*;

import java.util.*;
public class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimensions of the matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int i,j = 0;

        //create a array to store minimum and maximum elements
        int mn[] = new int[m];
        int mx[] = new int[n];

        //enter the matrix
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //find the minimum element of the row
        int min=0;
        for(i=0;i<m;i++){
            min = arr[1][0];
            for(j=0;j<n;j++){
                if(arr[i][j] <min)
                    min = arr[i][j];
            }
            mn[i] = min;
        }

        //finding maximum of the column
        int max=0;
        for(i=0;i<n;i++){
            max = arr[0][i];
            if(arr[j][i] > max){
                max = arr[j][i];
            }
            mx[i] = max;
        }

        int k,l,temp;
        for(k=0;k<m;k++){
            temp = mn[k];
            for(l=0;l<n;l++){
                if(mx[l] == temp){
                    System.out.println(temp);
                    break;
                }
            }
        }
    }
}

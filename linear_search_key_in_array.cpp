/*given an array of non-negative integers, design a linear algo and implement it using a program to 
  Find whether given key element is present in the array or not.
  Also find total no. of comaprisons for each input*/

#include<bits/stdc++.h>
#define MAX 1000
using namespace std;

void check(int a[], int n , int key)
{
          int count,i,flag;
          for(i=0;i<n;i++)
          {
                    count++;
                    if(a[i]==key)
                    {
                              flag = 1;
                              break;
                    }
          }
          if(flag==1)
          {
                    cout<<"Element is present at count "<<count<<endl;
          }
          else
          {
                    cout<<"not present";
          }
}

int main()
{
          int n,i,key,a[MAX];
          cout<<"enter the no. of elements";
          cin>>n;
          cout<<"enter the elements";
          for(i=0;i<n;i++)
          {
                    cin>>a[i];
          }
          cout<<"enter the key";
          cin>>key;
          check(a,n,key);
}

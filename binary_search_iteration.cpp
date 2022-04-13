#include<bits/stdc++.h>
#define MAX 1000
using namespace std;

int binary_search(int a[] , int key , int l , int r)
{         
          if(l<r)
          {
                    int mid = (l+r)/2;
                    if(a[mid] == key)
                    {
                              return mid;
                    }
                    else if(a[mid]<key)
                    {
                              l = mid +1;
                    }
                    else
                    {
                              r = mid -1;
                    }
          }
          else
          {
                    return -1;
          }
}


int main()
{
          int a[MAX] , i , n , key , index;
          cout<<"Enter the size of the array";
          cin>>n;
          cout<<"enter the elements";
          for(i=0;i<n;i++)
          {
                    cin>>a[i];
          }
          cout<<"enter the key";
          cin>>key;
          index = binary_search(a,key,0,n-1);
          if(index == -1)
          {
                    cout<<"not found";
          }
          else
          {
                    cout<<index;
          }
}
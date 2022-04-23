#include <bits/stdc++.h>
#define Max 1000
using namespace std;

int binarysearch(int arr[] , int key , int l , int r)
{
          if(r>=l)
          {
                    int mid = (l+r)/2;

                    if(arr[mid] == key)
                    {
                              return mid;
                    }
                    else if(arr[mid] < key)
                    {
                              return binarysearch(arr , key, mid+1 , r );
                    }
                    else
                    {
                              return binarysearch(arr ,l , mid-1 , key);
                              
                    }
                  
          }
          else
          {
                    return -1;
          }
}
int main()
{
          int arr[Max] , i , n ,key , index;

          cout<<"enter the size of the array";
          cin>>n;

          cout<<"enter the elements in the array";
          for(i=0;i<n;i++)
          {
                    cin>>arr[i];
          }

          cout<<"Enter the key";
          cin>>key;

          index = binarysearch(arr , key , 0 , n-1);        //arguments are array , key to find , first index , last index
          
          if(index == -1)
          {
                    cout<<"key not found";
          }
          else
          {
                    cout<<index;
          }
}

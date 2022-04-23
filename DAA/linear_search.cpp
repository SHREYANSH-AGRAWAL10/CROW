#include<bits/stdc++.h>
#define MAX 1000
using namespace std;

int linear_search(int a[] , int n , int key)
{
          for(int i = 0;i<n;i++)
          {
                    if(a[i] == key)
                    {
                              return i;
                    }
          }
          return -1;
}

int main()
{
          int a[MAX] , n,i,key;
          cout<<"enter the no. of elements";
          cin>>n;
          cout<<"enter the elements";
          for(i=0;i<n;i++)
          {
                    cin>>a[i];
          }
          cout<<"enter the key";
          cin>>key;

          int index = linear_search(a,n,key);
          if(index == -1)
          {
                    cout<<"not found";
          }
          else
          {
                    cout<<index;
          }
}

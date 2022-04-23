#include<bits/stdc++.h>
#define MAX 1000
using namespace std;

void bubble(int arr[] , int n)
{
          int a,b;
          for(a=0;a<n;a++)
          {
                    for(b=0;b < n-a;b++)
                    {
                              if(arr[b] > arr[b+1])
                              {
                                        int temp = arr[b];
                                        arr[b] = arr[b+1];
                                        arr[b+1] = temp;
                              }
                    }
          }
}

int main()
{
          int arr[MAX],i,n,key;
          cout<<"enter the no, of elements";
          cin>>n;
          cout<<"enter the elements";
          for(i=0;i<n;i++)
          {
                    cin>>arr[i];
          }

          bubble(arr,n);

          for(int i=0;i<n;i++)
          {
                    cout<<" "<<arr[i];
          }
}

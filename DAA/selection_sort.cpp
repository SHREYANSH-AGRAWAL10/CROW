#include<bits/stdc++.h>
using namespace std;
#define M 1000

void selection(int arr[],int n)
{
          for(int i=0;i<n-1;i++)
          {
                    int min=i;
                    for(int j=i+1;j<n;j++)
                    {
                              if(arr[j]<arr[min])
                                        min=j;
                    }
                    if(min!=i)
                    {
                              int temp;
                              temp = arr[min];
                              arr[min] = arr[i];
                              arr[i] = temp;
                    }
          }
}

int main()
{
          int arr[M],n;

          cin>>n;
          for(int i=0;i<n;i++)
          {
                    cin>>arr[i];
          }

          selection(arr,n);

          for(int i=0;i<n;i++)
          {
                    cout<<arr[i]<<" ";
          }
}

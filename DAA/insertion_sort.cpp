#include<bits/stdc++.h>
#define MAX 1000
using namespace std;

void insertion(int arr[], int n)
{
          for(int a=1;a<n;a++)
          {
                    int temp = arr[a];
                    int j = a-1;
                    while(j>=0 && arr[j]>temp)
                    {
                              arr[j+1] = arr[j];
                              j--;
                    }
                    arr[j+1] = temp;
          }
}

int main()
{
          int arr[MAX],i,n;
          cout<<"enter the no. of elements";
          cin>>n;
          cout<<"enter the elements";
          for(i=0;i<n;i++)
          {
                    cin>>arr[i];
          }
          insertion(arr,n);
          for(i=0;i<n;i++)
          {
                    cout<<" "<<arr[i];
          }
}

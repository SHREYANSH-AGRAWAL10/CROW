#include<bits/stdc++.h>
using namespace std;

int tower_of_hanoi(int n , char source , char des , char aux)
{
          if(n==0)
          {
                    return n;
          }
          else
          {
                    tower_of_hanoi(n-1 , source , aux , des);
                    cout<<" move disk " << n <<" from rod " <<source << " to rod "<<des <<endl;
                    tower_of_hanoi(n-1,aux,des,source);
          }
}

int main()
{
          int n;
          cout<<"enter the number of disks";
          cin>>n;
          tower_of_hanoi(n , 'A' , 'B' , 'C');
}

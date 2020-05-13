#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int a;
  cin>>a;
  int count=0;
  do{
  	count+=1;
      a/=10;
  }while(a>0);
  cout<<count;
}
#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int o,r=0;
  cin>>o;
  while(o>0){
  	r=r*10+o%10;
    o/=10;
  }
  cout<<r;
	return 0;
}
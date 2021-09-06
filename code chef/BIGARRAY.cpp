#include <iostream>
using namespace std;

int main() {
	// your code goes here
int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	    	long long int sum,N;
	    	cin>>N>>sum;
	    	long long int e=((N*N+N)/2);
	    	long long int diff=e-sum;
	    	if(diff<=N && diff>0)
	    	{
	    	    cout<<diff<<endl;
	    	}
	    	else
	    	{
	    	    cout<<"-1"<<endl;
	    	}
	    	
	}
	
	return 0;
}

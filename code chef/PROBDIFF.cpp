#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
		int test;
		/*input the value of test*/
	cin>>test;
	while(test!=0)
	{
	    int arr[4];
	    for(int i=0;i<4;i++)
	    {
	        cin>>arr[i];
	    }
	    sort(arr,arr+4);
	    if(arr[0]==arr[3])
	    {
	        cout<<'0'<<endl;
	    }
	    else if(arr[0]==arr[2]||arr[1]==arr[3])
	    {
	        cout<<'1'<<endl;
	    }
	    else
	    {
	        cout<<'2'<<endl;
	    }
	    test=test-1;
	    /* value of test getting updated*/
	}
	return 0;
}

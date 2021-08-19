#include <bits/stdc++.h>
using namespace std;
#define ll long long int

int main()
{
	ll t;
	cin>>t;
	while(t--)
	{
	    ll i,j,p,n,k,pos,val;
	    cin>>n>>p>>k;
	    ll y=p%k;
	    ll x=n%k;
	    ll ans=(y)*((n)/k);
	    
	    if((x)>=(y))
	    {
	        ans=ans+y;
	    }
	    else
	    {
	        ans=ans+x;
	    }
	    
	    ans=ans+(p/k)+1;
	    cout<<ans<<endl;
	    
	}
	return 0;
}
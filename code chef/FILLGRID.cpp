#include <bits/stdc++.h>
using namespace std;
int main()
{
    int T;
    cin >> T;
    for(int i=0; i<T; i++)
    {
        int N;
        cin>>N;
        int arr[N][N];
        if (N%2==0)
        {
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    arr[i][j] = -1;
                     cout << arr[i][j] << " ";
                }
                cout<<endl;
            }
           
        }
        else
        {
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (i!=j)
                    {
                        arr[i][j]=1;
                           cout << arr[i][j] << " ";
                    }
                    else if (i==j)
                    {
                        arr[i][j]=-1;
                           cout << arr[i][j] << " ";
                    }    
                }
                  cout<<endl;
                
            }
           
        }

    }
    
}
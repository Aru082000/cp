package arush;
import java.util.*;
import java.lang.*;
import java.io.*;

public class REPEAT {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		int N=s.nextInt();
		int K=s.nextInt();
		int S=s.nextInt();
		int sum=(N*N);
		int x=S-sum;
		for(int j=0;j<N;j++)
		{
		    int k=2*j+1;
		    if(x%k==0)
		    {
		        if((k*(K-1))==x)
		        {
		            System.out.println(k);
		            
		        }
		    }
		}
		
		}
	}

}

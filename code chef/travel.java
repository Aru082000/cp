/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		    int sum=0;
		    int N=s.nextInt();
		    int A=s.nextInt();
		    int B=s.nextInt();
		    String c=s.next();
		    for(int j=0;j<N;j++)
		    {
		        if(c.charAt(j)=='0')
		        {
		            sum+=A;
		        }
		        else
		        {
		            sum+=B;
		        }
		        
		    }
		    System.out.println(sum);
		    
		}
	}
}

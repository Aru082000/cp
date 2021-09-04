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
		    int A=s.nextInt();
		    int B=s.nextInt();
		    int C=s.nextInt();
		    int D=s.nextInt();
		    int E=s.nextInt();
		    if((A+B<=D) && (C<=E))
		    {
		        System.out.println("YES");
		    }
		    else if((A+C<=D) && (B<=E))
		    {
		        System.out.println("YES");
		    }
		    else if((B+C<=D) && (A<=E))
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test>0)
		{
		    int m1=sc.nextInt();
		    int m2=sc.nextInt();
		    int m3=sc.nextInt();
		    int m4=sc.nextInt();
		    int m5=sc.nextInt();
		    int m6=sc.nextInt();
		    int sum1=m1+m2+m3;
		    int sum2=m4+m5+m6;
		    if(sum1>sum2)
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("2");
		    }
		    test--;
		}
		
	}
}

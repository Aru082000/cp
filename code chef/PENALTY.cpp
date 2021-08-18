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
		int t=s.nextInt();
		while(t!=0)
		{
		    int[] arr=new int[10];
		    for(int i=0;i<10;i++)
		    {
		        arr[i]=s.nextInt();
		    }
		   int A=arr[0]+arr[2]+arr[4]+arr[6]+arr[8];
		   int B=arr[1]+arr[3]+arr[5]+arr[7]+arr[9];
		   if(A>B)
		   {
		   System.out.println(1);
		   }
		   else if(A<B)
		   {
		       System.out.println(2);
		   }
		   else
		   {
		    System.out.println(0);   
		   }
		   t--;
		}
	}
}


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
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    String x=s.next();
		       char []arr = x.toCharArray();
        Arrays.sort(arr);
        int f[]=new int[arr.length];
        int m=0;
        for(int j=0;j<arr.length;j++)
        {
            f[j]=1;
            for(int k=j+1;k<arr.length;k++)
            {
                if(arr[j]==arr[k] && arr[j]!=0)
                {
                    f[j]++;
                    arr[k]=0;
                }
            }
        }
        m=f[0];
        for(int y=0;y<arr.length;y++)
        {
            if(m<f[y])
            {
                m=f[y];
            }
        }
        int result=arr.length-m;
        if(result==m)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        
    }
		    
		}
	}


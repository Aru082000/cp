package arush;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SIGNFLIP {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		    int N=s.nextInt();
		    int K=s.nextInt();
		    int sum=0;
		    int[] arr=new int[N];
		    int[] temp=new int[N];
		    int y=0;
		    for(int j=0;j<N;j++)
		    {
		        arr[j]=s.nextInt();
		    }
		    Arrays.sort(arr);
		    for(int k=0;k<K;k++)
		    {
		        if(arr[k]<(-1))
		        {
		            temp[y]=(arr[k]*(-1));
		            y++;
		        }
		    }
		    for(int t=0;t<N;t++)
		    {
		        if(arr[t]>0)
		        {
		            temp[y]=arr[t];
		            y++;
		        }
		    }
		    for(int q=0;q<N;q++)
		    {
		      sum=sum+temp[q];
		      
		    }
		    System.out.println(sum);
		}
	}
}

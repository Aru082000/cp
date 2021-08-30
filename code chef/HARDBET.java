package arush;
import java.util.*;
import java.lang.*;
import java.io.*;

public class HARDBET {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		    int Sa=s.nextInt();
		    int Sb=s.nextInt();
		    int Sc=s.nextInt();
		    if(Sc<Sb && Sc<Sa)
		    {
		        System.out.println("Alice");
		    }
		    else if(Sb<Sa && Sb<Sc)
		    {
		        System.out.println("Bob");
		    }
		    else
		    {
		        System.out.println("Draw");
		    }
		}
	}
}

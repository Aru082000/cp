package arush;

public class MAX_DIFF {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		    int result=0;
		    int N=s.nextInt();
		    int sum=s.nextInt();
		    if(sum<=N)
		    {
		        System.out.println(sum);
		    }
		    else
		    {
		     int diff=sum-N;
		     if(diff>N)
		     {
		      result=diff-N; 
		      System.out.println(result);
		     }
		     else
		     {
		      result=N-diff;
		      System.out.println(result);
		     }
		    }
		    
		}
	}
}

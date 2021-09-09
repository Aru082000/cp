package arush;

public class FACEDIR {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		    int x=s.nextInt();
		    int sec=x%4;
		    if(sec==0)
		    {
		        System.out.println("North");
		    }
		    else if(sec==3)
		    {
		        System.out.println("West");
		    }
		    else if(sec==2)
		    {
		        System.out.println("South");
		    }
		    else if(sec==1){
		        System.out.println("East");
		    }
		}
	}

}

import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int test=s.nextInt();
    
   while(test!=0)
   {
     int n=s.nextInt();
    ArrayList <String> list = new ArrayList<String>();
    String temp=new String();
    String ans=new String();
    temp=s.nextLine();
    list.add(temp);
   
   for(int i=0;i<n;i++)
   {
     if(list.get(i).charAt(i)=='1')
     {
       ans+='0';
     }
     else
     {
       ans+='1';
     }
   }
   System.out.println(ans);
   test--;
   }
  }
}

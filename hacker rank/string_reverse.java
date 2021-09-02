import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l=0;
        int r=A.length()-1;
        if(A.length()-1==0)
        {
            System.out.println("Yes");
            return;
        }
        while(l<r)
        {
            if(A.charAt(l)==A.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                System.out.println("No");
                return;
            }
            
        }
        System.out.println("Yes");
    }
}




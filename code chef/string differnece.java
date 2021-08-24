import java.util.ArrayList;
import java.util.Scanner;

public class StringPrac {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner s = new Scanner(System.in);
    int test = s.nextInt();
    while (test != 0) {
      int n = s.nextInt();
      int t=n;

      ArrayList < String > list = new ArrayList < String > ();

      String ans = "";
      while (n != 0) {
        String temp = new String();
        temp = s.next();
        list.add(temp);
        n--;
      }
      for (int i = 0; i < t; i++) {
        if (list.get(i).charAt(i) == '1') {
          ans += '0';
        } else {
          ans += '1';
        }
      }
      System.out.println(ans);
      test--;

    }
  }

}
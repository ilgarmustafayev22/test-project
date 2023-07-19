package lesson05;

import java.sql.SQLOutput;

public class VariableApp {
    public static void main(String[] args) {
      /*  int a = 6;
        int b = 5;
        int t = a + b;
        int c = a - b;
        int v = a*b;
        int d = a/b;
        a++;
        b--;
        System.out.println(t);
        System.out.println(c);
        System.out.println(v);
        System.out.println(d);
        System.out.println(a==a);
        System.out.println(a!=b);
        System.out.println(a=b);


      int i = 20;
      boolean isEven = (i%2) == 0;
        System.out.println(isEven);

        boolean second = isEven && i >10;
        System.out.println(second);

        boolean third = isEven || (i % 3 == 0);
        System.out.println(third);

        boolean fourth = !isEven && (i>=10);
        System.out.println(fourth);

    */
      int w = 21;
      System.out.println('&');
     String result = w % 2 ==0 ? "EVEN" : "ODD";
      System.out.println(result);
      String result2 = (w - 1) == 0 ? "E": "O";
      System.out.println(result2);

    }
}

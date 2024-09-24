////// ARTHEMATIC EXCEPTION

import java.util.*;
/*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code19.java
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> java demo        
ENTER THE 1ST NUMBER
10
ENTER SECOND NUMBER
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at demo.main(code19.java:16)
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling>  */

class demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

      System.out.println("ENTER THE 1ST NUMBER");
      int num=sc.nextInt();

      System.out.println("ENTER SECOND NUMBER");
      int num2=sc.nextInt();

      System.out.println("DIVISION"+ num/num2);
      System.out.println("END CODE");
    }

}
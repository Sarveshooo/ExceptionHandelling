import java.util.*;////InputMismatchException


/*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code20.java
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> java demo        
START CODE
ENTER 1ST NUMBER TO DIVIDE
sarvesh
Exception in thread "main" java.util.InputMismatchException
        at java.util.Scanner.throwFor(Unknown Source)
        at java.util.Scanner.next(Unknown Source)
        at java.util.Scanner.nextInt(Unknown Source)
        at java.util.Scanner.nextInt(Unknown Source)
        at demo.main(code20.java:21)
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling>  */

class demo{
    public static void main(String[] args) {

        System.out.println("START CODE");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER TO DIVIDE");
        int num=sc.nextInt();

        System.out.println("ENTER THE SECOND NUMBER TO DIVIDE");
        int num2=sc.nextInt();
        

        System.out.println(num/num2);

        System.out.println("END CODE ");


    }
}
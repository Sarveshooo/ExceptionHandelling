////////////// NumberFormatException 
import java.io.*;

/*        NumberFormatException   
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code15.java
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> java demo
ENTER YOUR ROLL NO
Sarvesh
Exception in thread "main" java.lang.NumberFormatException: For input string: "Sarvesh"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at demo.main(code15.java:8) */

class demo
{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER YOUR ROLL NO");
        int roll=Integer.parseInt(br.readLine());
        System.out.println(roll);
        
    }

}
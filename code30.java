import java.io.*;
class demo
{
    void fun()throws IOException,InterruptedException
    {
        System.out.println("IN FUN");
    }
    public static void main(String[] args)throws IOException {
        demo obj=new demo();
        obj.fun();
        
/*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code30.java
code30.java:10: error: unreported exception InterruptedException; must be caught or declared to be thrown
        obj.fun();
               ^
1 error */

    }

}
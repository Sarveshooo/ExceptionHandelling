import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class demo
{
    void fun()throws IOException
    {
        System.out.println("in fun");
    }
    public static void main(String[] args)throws IOException {
        demo obj=new demo();
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String name=br.readLine();
    System.out.println("ENTER YOUR NAME ");
    System.out.println(name);
    }
}/*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code29.java
code29.java:8: error: cannot find symbol
    void fun()throws IOException
                     ^
  symbol:   class IOException
  location: class demo
code29.java:12: error: cannot find symbol
    public static void main(String[] args)throws IOException {
                                                 ^
  symbol:   class IOException
  location: class demo
2 errors */
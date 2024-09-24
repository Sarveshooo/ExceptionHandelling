/// 1st code of 08/07/2024
//////observe the bytecode for this code 

import java.io.*;
import java.util.*;
class demo
{
    public static void main(String[] args)
    {
        System.out.println("START MAIN");
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        int y=0;
        System.out.println("ENTER THE VALUE FOR X AND Y");
        try
        {
            x=Integer.parseInt(br.readLine());
            //br.close();
            y=Integer.parseInt(br.readLine());
            Thread.sleep(5000);
            System.out.println(x/y);
        }
        catch(IOException ioe)
        {
            System.out.println("IO EXCEPTION OCCURED");
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("NUMBER FORMAT EXCEPTION OCCURED");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("ARTHEMATIC EXCEPTION OCCURED");
        }
        catch(InterruptedException ie)
        {
            System.out.println("INTERRUPTTED EXCEPTION OCCURED ");
        }
        try{
            System.out.println("ENTER THE VALUE X AND Y AGAIN CORRECTLY");
            x=Integer.parseInt(br.readLine());
            y=Integer.parseInt(br.readLine());
            System.out.println(x/y);
        }
        catch(Exception ioe)
        {

        }
      System.out.println("END MAIN");
    }
}
/*    159: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     162: ldc           #27                 // String END MAIN
     164: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
     167: return
    Exception table:
       from    to  target type
          38    69    72   Class java/io/IOException
          38    69    85   Class java/lang/NumberFormatException
          38    69    98   Class java/lang/ArithmeticException
          38    69   111   Class java/lang/InterruptedException
         121   154   157   Class java/lang/Exception 
         */
///////// IOException
import java.io.*;

class demo
{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //int n=Integer.parseInt(br.readLine());
        System.out.println("ENTER YOUR MOTHERS NAME");
        String name=br.readLine();
        System.out.println(name);

        br.close();

        System.out.println("ENTER YOUR FATHERS NAME");
        String name2=br.readLine();
        System.out.println(name);
    }
}
/*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code14.java
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> java demo        
ENTER YOUR MOTHERS NAME
Dhanashree 
Dhanashree 
ENTER YOUR FATHERS NAME
Exception in thread "main" java.io.IOException: Stream closed
        at java.io.BufferedReader.ensureOpen(Unknown Source)/////THIS  4LINES THAT YOU SEE ARE THE STACKTRACE LINES
        at java.io.BufferedReader.readLine(Unknown Source)
        at java.io.BufferedReader.readLine(Unknown Source)
        at demo.main(code14.java:15)
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling>  */
//////////FileNotFoundException
import java.io.*;

class demo
{
    public static void main(String[] args) 
    {
        File file=new File("abc.txt");
        FileReader fr=new FileReader(file);

        
    }

}
/*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code18.java
code18.java:8: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        FileReader fr=new FileReader(file);
                      ^
1 error
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> */
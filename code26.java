
import java.io.*;

class demo
{
    void fun()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ENTER VALUE FOR X");
        int x=Integer.parseInt(br.readLine());

        System.out.println("ENTER VALUE FOR Y");
        int y=Integer.parseInt(br.readLine());

        System.out.println(x/y);
    }
    public static void main(String[] args) {
        demo obj=new demo();
        obj.fun();
    }


}
/*code26.java:11: error: unreported exception IOException; must be caught or declared to be thrown
        int x=Integer.parseInt(br.readLine());
                                          ^
code26.java:14: error: unreported exception IOException; must be caught or declared to be thrown
        int y=Integer.parseInt(br.readLine());
                                          ^
2 errors */
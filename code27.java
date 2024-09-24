
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
    public static void main(String[] args)throws IOException {/////STILL ERROR TAKES PLACE 
        demo obj=new demo();
        obj.fun();
    }


}
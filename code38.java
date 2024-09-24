import java.io.*;

class demo
{
    void fun()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        try
        {
            br.close();
        }
        catch(IOException e)
        {

        }
        String str=null;
        try
        {
            str=br.readLine();
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());///////type one of declaration of exception 
            System.out.println(ioe.toString());//////Type Two of  declaration of exception 
            ioe.printStackTrace();///////Type Three of declaration of exception 
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        demo obj=new demo();
        obj.fun();
    }
}
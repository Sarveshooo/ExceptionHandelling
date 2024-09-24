import java.util.*;
class demo
{
    static int x=0;
    static int y=0;

    static void fun()
    {
        System.out.println("START FUN");
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("ENTER VALUE FOR X AND Y");
            x=sc.nextInt();
            y=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("INPUT MISMATCH EXCEPTION");
        }
        try{
            System.out.println(x/y);
        }
        catch(Exception er)
        {
            System.out.println("ARETHAMATIC EXCEPTION");
        }
        try
        {
            System.out.println("ENTER VALUE FOR X AND Y AGAIN");
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x/y);
        }
        catch(Exception ers){

            System.out.println("done");
        }
        System.out.println("END FUN");
        
    }
    public static void main(String[] args)
   {
    System.out.println("START MAIN");
    demo obj=new demo();
    obj.fun();
    System.out.println("END MAIN");
        
    }

}
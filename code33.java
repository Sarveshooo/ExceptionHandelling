import java.util.*;
class demo
{
    static void fun()
    {
        System.out.println("Start Fun");

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER VALUE FOR X");
        int x=sc.nextInt();

        System.out.println("ENTER VALUE FOR Y");
        int y=sc.nextInt();
        
        try{
            System.out.println(x/y);
            System.out.println("NOT COMPILED SUCCESSFULLY");
        }
        catch(Exception e)
        {
            System.out.println("Areee Veday....");
               
        } 
        try
        {
            System.out.println(x/y);
           // System.out.println("GIVE THE INPUT ONCE AGAIN");
        }
        catch(Exception er)
        {
            System.out.println("TU JA GHARI .....");
        }

        System.out.println("end fun");
    }
    public static void main(String[] args) {
        demo obj=new demo();
        obj.fun();
    }

}
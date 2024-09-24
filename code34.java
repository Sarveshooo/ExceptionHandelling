import java.util.*;

class demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=0;
        int y=0;

        try
        {
            System.out.println("ENTER VALUE FOR X AND Y");
            x=sc.nextInt();
            y=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("INPUT MISMATCH EXCEPTION");
        }
        try
        {
            System.out.println(x/y);
        }
        catch(Exception er)
        {
            System.out.println("ARETHAMATIC EXCEPTION AVOIDED");
        }
        try
        {
            System.out.println("ENTER VALUE FOR X AND Y AVOIDING ZERO AT DENOMINATOR AND GIVING STRING AT DONOMINATOR");
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println("ANSWER OF DIVISION" + x/y);
        }
        catch(Exception es)
        {
            System.out.println("FINALLY DONE");
        }
        System.out.println("END MAIN");
    }

}
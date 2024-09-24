import java.util.*;
class demo
{
    static void fun()
    {
        System.out.println("START FUN");

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VALUE FOR X");
        int x=sc.nextInt();

        System.out.println("ENTER VALUE FOR Y");
        int y=sc.nextInt();
    try
    {
        System.out.println(x/y);
        System.out.println("EVERYTHING GOOD RUN CAN INITIATED");
    }
    catch(Exception e)
    {
        System.out.println("AREE VEDAY VALUE NIT ENTER KAR ");
    }
    System.out.println("END FUN");
}
public static void main(String[] args) {
    System.out.println("START MAIN");
    demo obj=new demo();
    obj.fun();
    System.out.println("END MAIN");
}

}
import java.io.*;
class demo
{
    void fun()throws IOException,InterruptedException,ArithmeticException//////works good with runtime exceptions
    {
        System.out.println("IN FUN");
    }
    public static void main(String[] args)throws IOException,InterruptedException {
        demo obj=new demo();
        obj.fun();
    }
}

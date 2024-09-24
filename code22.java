class demo//////////////NULL POINTER EXCEPTION
{
    /*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code22.java
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> java client      
IN FUN
Exception in thread "main" java.lang.NullPointerException
        at client.main(code22.java:21)
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> */
    void fun()
    {
        System.out.println("IN FUN");
    }
    void run()
    {
        System.out.println("IN RUN");
    }
}
class client
{
    public static void main(String[] args) {
        demo obj=new demo();

        obj.fun();

        obj=null;

        obj.run();

    }
}
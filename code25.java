///////////06/07/2024
////////////////////////////ArithmeticException: / by zero

/*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code25.java
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> java demo        
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at demo.fun(code25.java:8)
        at demo.main(code25.java:12) */

class demo
{
    void fun()
    {
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        demo obj=new demo();
        obj.fun();
    }

}
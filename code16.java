////////INTERUPTED EXCEPTION  IT HAPPENS IN MULTI THREADING

class demo
{
    public static void main(String[] args) {
        System.out.println("START CODE");
        Thread.sleep(5000);
        System.out.println("END CODE ");
    }

}
/*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code16.java
code16.java:7: error: unreported exception InterruptedException; must be caught or declared to be thrown
        Thread.sleep(5000);
                    ^
1 error */
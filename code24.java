class demo////////ArrayIndexOutOfBoundsException:
{

    /*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code24.java
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> java demo        
kanha
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at demo.main(code24.java:7)
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> */

public static void main(String[] args) {
    String[] str={"kanha","sarvesh","Dhanoo"};

    System.out.println(str[0]);
    System.out.println(str[3]);
    
}

}
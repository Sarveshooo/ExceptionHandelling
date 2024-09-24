class demo   ////StringIndexOutOfBoundsException
{

    /*PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> javac code23.java
PS C:\Users\sarvesh sakpal\Desktop\JavaSaruCodes\Exception_Handling> java demo
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
        at java.lang.String.charAt(Unknown Source)
        at demo.main(code23.java:6) */
    public static void main(String[] args) {
        String[] str={"kanha","sarvesh","Dhanoo"};

        System.out.println(str[0].charAt(6));
        
    }

}
///javap java.io.BufferedReader

import java.io.*;
class demo
{
    static void fun() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER YOUR NAME");
        String name=br.readLine();
        System.out.println(name);
        br.close();
    }
    public static void main(String[] args)throws IOException {
        demo obj=new demo();
        obj.fun();
    }


}
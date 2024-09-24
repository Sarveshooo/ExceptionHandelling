//05/07/24//
/*    THIS IS AN IOException            COMPILETIME EXCEPTION

 * code12.java:12: error: unreported exception IOException; must be caught or declared to be thrown
        String name=br.readLine();
                               ^
1 error
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
class demo
{
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();
        System.out.println("Enter the name of the person");
        System.out.println(name);
    }

}
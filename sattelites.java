import java.net.*;
import java.io.*;

/**
 * sattelites
 */
public class sattelites {
    public static void main(String[] args) throws Exception{
        URL oracle = new URL("https://celestrak.org/NORAD/elements/gp.php?GROUP=visual&FORMAT=tle");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        // initialize variables
        String name;
        String TLE1;
        String TLE2;
        while ((name = in.readLine()) != null) {
            //reads the TLE1 and TLE2 Line
            TLE1 = in.readLine();
            TLE2 = in.readLine();
            System.out.println(TLE1);

        }
    in.close();
    }
    
}
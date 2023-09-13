import java.net.*;
import java.util.Scanner;
import java.io.*;

/**
 * sattelites
 */
public class sattelites {
    public static void main(String[] args) throws Exception{


        URL oracle = new URL(URL());
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        // initialize variables
        String name;
        String TLE1;
        String TLE2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would You like details on a specific sattelite or all of them? (enter Sattelite catalog number or ALL): ");
        String userSCN = scanner.nextLine();
        
        while ((name = in.readLine()) != null) {
            TLE1 = in.readLine();
            TLE2 = in.readLine();
            if (userSCN.equalsIgnoreCase("ALL")) {
                System.out.println(SCN(TLE1) + " " + Epoch(TLE1) + " " + Inclination(TLE2) + " " + name);
                    
            }
            else if(TLE1.substring(2, 7).equals(userSCN)){
                System.out.println(SCN(TLE1) + " " + Epoch(TLE1) + " " + Inclination(TLE2) + " " + name);
            }
            else{
                System.out.println("It seems the Sattelite catalog number you entered in not In the list! Maybe try ALL");
            }
        }

         in.close();     
            
    }
    
    public static String URL() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Would You like to see data on Last 30 day launches, 100 brightest, or maybe even Active satelites? (enter 30, 100, ALL respectivly): ");
        String userweb = scanner1.nextLine();
        String url = "";
        if (userweb.equals("30")){
            url = "https://celestrak.org/NORAD/elements/gp.php?GROUP=last-30-days&FORMAT=tle";
        }
        else if (userweb.equals("100")){
            url = "https://celestrak.org/NORAD/elements/gp.php?GROUP=visual&FORMAT=tle";
        }
        else if (userweb.equalsIgnoreCase("ALL")){
            url = "https://celestrak.org/NORAD/elements/gp.php?GROUP=active&FORMAT=tle";
        }
        return url;
    }

    public static String SCN(String TLE) {     
        return TLE.substring(2,7);
    }
    public static int Epoch(String TLE) {     
        return Integer.parseInt(TLE.substring(18,20));
    }
    public static double Inclination(String TLE) {     
        return Double.parseDouble(TLE.substring(8,16));
    }
}
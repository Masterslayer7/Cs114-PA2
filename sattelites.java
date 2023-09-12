import java.net.*;
import java.util.Scanner;
import java.io.*;

/**
 * sattelites
 */
public class sattelites {
    public static void main(String[] args) throws Exception{
        URL oracle = new URL("https://celestrak.org/NORAD/elements/gp.php?GROUP=visual&FORMAT=tle");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        // asking user for input 
        Scanner scanner = new Scanner(System.in);
        System.out.println( "What would you like to know? Options:\n" +
                            "Satellite Catalog Number (enter SCN)\n" +
                            "Classification (enter CLASS)\n" +
                            "Last Two digits of Launch year (enter LY)\n" +
                            "Launch number of the year (enter LNOTY)\n" +
                            "Piece of the launch (enter POTL)\n" +
                            "Epoch Year (enter EY)\n" +
                            "Epoch day of the year (enter ED)\n" +
                            "First derivative of mean motion (enter Dy1)\n" +
                            "Second derivative of mean motion (enter Dy2)\n" +
                            "B* the drag term (enter DRAG)\n" +
                            "Ephemeris type (enter ET)\n" +
                            "Element set number (enter ESN)\n" +
                            "Checksum (enter CHECKSUM)\n" +
                            "Inclination (enter INCL)\n" +
                            "Right Ascension of the ascending node (enter RA)\n" +
                            "Eccentricity (enter ECCEN) \n" +
                               "Argument of perigee (enter AOP) \n" +
                            "Mean anomaly (enter MA) \n" + 
                            "Mean Motion (enter MM)\n" +
                            "Revolution number at epoch (enter RNAE)\n");
        String userInput = scanner.nextLine();
        

        // initialize variables
        String name;
        String TLE1;
        String TLE2;
        while ((name = in.readLine()) != null) {
            //reads the TLE1 and TLE2 Line
            TLE1 = in.readLine();
            TLE2 = in.readLine();
            
        switch (userInput.toUpperCase()) {
            case "SCN": SCN();

            default:
                break;
        }
             
            
        }
    in.close();
    }
    public String SCN() {
          
        return null;
        
    }
}
/**
 * Created by Charles Sun on 6/2/2016.
 */
/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

    /** Prompts the user for the name X of a company (a single string), opens
     *  the Web site corresponding to www.X.com, and prints the first five lines
     *  of the Web page in reverse order.
     *  @param arg is not used.
     *  @exception Exception thrown if there are any problems parsing the
     *             user's input or opening the connection.
     */
    public static void main(String[] arg) throws Exception {

        BufferedReader keyboard;
        String inputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the name of a company (without spaces): ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
        URL url = new URL("http://www." + inputLine + ".com/");
        BufferedReader urlReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String[] lines = new String[5];     //only get 5 lines
        for (int i = 0; i < 5; i++) {    //i < 5 doesn't include index 5
            lines[i] = urlReader.readLine();
        }
        //print in the reverse oder. Note that, the index starts at 4 because index 0 is the first index in Java.
        for (int j = 4; j >= 0; j--) {
            System.out.println(lines[j]);
        }

    }
}

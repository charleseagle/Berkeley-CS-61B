import java.io.*;

/**
 * Created by Charles Sun on 6/5/2016.
 */
public class Nuke2 {
    public static void main(String[] arg) throws Exception {
        System.out.print("Please input a string that you like: ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();   //read a string from the screen input.
        String output = input.substring(0,1)+input.substring(2);   //omit the index 1 in the string
        System.out.println(output);
    }
}

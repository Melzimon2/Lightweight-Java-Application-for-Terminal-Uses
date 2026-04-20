/*

* The Main starter for this application
* This is where the run begins
* You can study this code
* Mostly everything is created so it is rarely updated
* lots of imports

* You may see on the how.txt to see how it works
* May you not copy paste this please

* Project started at April 20 2026


* Debugging is used
* Terminal is the best use for this application
* You can also use a installer and run it in a terminal

* Debugging this is the best way to run
* This file contains almost all the things so one error may cause a fatal for the entire language
* You may use your Local Files

* Grab on information is known to be constant throughout

* BY MELZIMON 2026 (MIT LICENSE)
THANK YOU❤️

*/

import java.io.FileWriter;
import java.io.IOException;

public class MainStarter {
    //constant throughout
    public static final String grab_on_starter_message = "Base is starting!";
    public static final String grab_on_warn = "Fatal error may cause changes!";
    public static int grab_on_null = 0;
    public static void activity_main() {
        if (grab_on_null == 0) {
            // Checks if the grab on null is 0
            // if it is 0 it works fine
            // any other number exits the system
            // this is to check if a NullPointerException has happend
            System.out.append("Grab-on-null returned successfully\n");

        } else {
            System.exit(1);
        }

    } 


    protected void grab_case_null() {
        // Gets a protected warn only if null grab is 1
        // and above
        System.err.append("Grab-on-null failed to imply 0" + "Change the grab on null to 0!");
        System.err.append(grab_on_warn);
    }


    public static void logs() {
        // Creates the logs.txt
        // The main source for timeline guidance
        try (FileWriter writer = new FileWriter("logs.txt", true)) {
            writer.write("======= Start Language with Debugger ========\n");
            
        } catch (IOException e) {

        }
        
    }


}
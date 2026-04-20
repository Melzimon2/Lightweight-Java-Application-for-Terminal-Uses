/*

* Base User Input where the user runs commands and
* writes basic logic code
* Now this is the part where it executes
* while loops on the user that they may create
* code and everything

* April 20 2026
👍👍

*/

import java.io.FileWriter;
import java.io.IOException;


public class baseUserInput {
    public static void userInputListener() {
        Object onRenderUser = "Git 1";
        if (onRenderUser.equals(onRenderUser)) {
            try (FileWriter writer = new FileWriter("logs.txt", true)) {
                writer.write("[SYS] UserInput Listener set to bound...\n");

            } catch (IOException e) {

            }      
        }
    }
}
/*

* This is where the Launcher and everything starts
* imports from folder may be used here
* And the devs can access here
* This code may not be copy paste
* Though you can study how i write code

* BY MELZIMON APRIL 20 2026
🔥

*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class launcher {
    public static void main(String[] args) {
        MainStarter.activity_main();       
    }
    public static void builder() {
        /*

        * At this point the builder is where
        * the functions and layer rendering will
        * happen. But also some layers is separated
        * and built on kotlin for easy use
        
        * April 20 2026

         */

        // Layer 1 (Debugger)
        boolean mismatch_exception_v = true;
        if (mismatch_exception_v == true) {
            /*
            *The Launchers debugging system should work
            *Since mistmatch_exception is true
            *Now we should create the instances and debugging files
            *Moslty in launcher debugging Bool exceptions and
            *Illegal state and also null exception happens
            *So for now we will use basic math and functionality
            *that creates (LISTS, VERSION LIST AND A CONNECTIVE TO OTHER FILES SO THAT THE LANGUAGE MAY FUNCTION)
             */
            String compactLayer = "LayerCompact:true";
            if (compactLayer.equals("LayerCompact:true")) {
                int compactArith_checks = 64;
                // in compactArithChekcs the maximum arithmetic
                // math I set is to 64 so that all the numbers
                // added and subtracted will total to 64
                
                try {
                    int compactArith = 64 / 64;
                    // Divided by 64 so that
                    // they will group into 1

                } catch (NumberFormatException e) {
                    System.out.print("ERR: Compact Arithmetic must be one group");

                }
            }
            
        }else {
            
        }
        
        // Layer 2 (Version mismatchs and listing)
        /*

        * In layer 2 versions and compatibily will be
        * handled carefully
        * The device the user uses and the terminal
        * information is what the logic searches for
        * the layer rendering of the language we made
        * Version mismatches will also be handled
        
        * April 20 2026
        
         */
        String version_official = "1";
        // Versions official must be updated
        // for every update
        if (version_official.equals("1")) {
            //proceed
            //appends in the files
            try (FileWriter version = new FileWriter("logs.txt", true)) {
                version.write("[SYS] Version Set To: " + version_official + "\n");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            //just give a warning but still proceeds
            //to next layers
            System.out.println("[WARN] Version official mismatches\n");
        }
        /*

        * The List here contains the
        * versions.
        * Moslty built for Samsung S6 and above

        */
       List<String> version_1_compatibility = new ArrayList<>();

       version_1_compatibility.add("Samsung S5 and above");
       version_1_compatibility.add("Android Bundles Above");

       try (FileWriter version = new FileWriter("logs.txt", true)) {
        version.write("Compatibility Rendering: All are compatible!" + version_1_compatibility + "\n" );
       } catch (IOException e) {
        
       }
       
       /*
       Layer 3 (Final One - The user verification)
       * This is where the user is then verified
       * It may use scanner to verify the user
       * This is where after this the actual rendering
       * system and controller files will be scanned
       * The system is also known as verification
       * injector.
       * 
       * 
       * April 20 2026
       */
      Scanner user = new Scanner(System.in);
      System.out.print("User: ");
      String userfinal = user.nextLine();
      if (userfinal.equals(userfinal.toLowerCase())) {
        //Proceed
      } else {
        System.err.append("Cannot adress user because of lowercase rule!\n");
        //halts system, but you can restart immediately
        System.exit(2);
      }
    }
    /*
    * Now that the builder and all the other
    * things is done. We can now finalize 
    * the function of the language, imports, other
    * log texts and the custom terminal we will
    * build.
    * 
    * April 20 2026
    * 🔥🔥
    */
   /*
   * At the start of this new era
   * file importing and functionality will happen
   * saved instances and others will be finalized
   */
  protected void onCreate_rendering() {
    /*
    * where the rendering compatibility and
    * runtime is created and communicated
    * in a way that is easy to use
    * 
    * April 20 2026
    */
   String compat_r = "Android_36";

   switch(compat_r) {
    case "Android_36":
        System.out.print("[SP] Render compat set to: Android_36\n");
        break;
    case "Android_--12":
        System.out.print("[SP] Low Compat set to Render to: Android_--12\n");
   }
   if (compat_r.equals("Android_36")) {
    List<String> compat_36 = new ArrayList<>();
   

    compat_36.add("GitEnv: 1");

    try (FileWriter writer = new FileWriter("logs.txt", true)) {
        writer.write("Environment Rendering Runtime: GitEnv 1\n");

   } catch (IOException e) {

   }
  }

 }
 protected void create_on_render() {
    try (FileWriter writer = new FileWriter("logs.txt", true)) {
        writer.write("Creating on render instance: True\n");

    } catch (IOException e) {

    }
    boolean lib_render = true;
    if (lib_render == true) {
        try (FileWriter writer = new FileWriter("logs.txt", true)) {
            writer.write("LibRender: set to true\n");
            
        } catch (Exception e) {
        }
        /*
        * In this part the renderer layer is being
        * created. So it uses math, obj and strings
        * It is simple, but IT IS NOT the final one
        * this is the system renderer not the final
        * layer where the user could finally interact
        * 
        * April 20 2026
        */
       Object onInstanceSaved = "Git RendererCustom";
       onInstanceSaved = "Version 1: Return true";
       Object compactInstance = "True return to render";
       System.out.print(onInstanceSaved + "\n" + compactInstance + "\n");
       // Imports the files on the same folder
       // that has the rendering functions but with
       // math and string logics

       

    }
  }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesliteralsandconstants;

import java.util.Scanner;
import java.io.PrintStream;

/**
 *
 * @author iqbal.ahmed1
 */
public class VariablesLiteralsAndConstants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double EARTH_RATIO = 1;
        final double MOON_RATIO = 0.16;
        final double MARS_RATIO = 0.37;
        final double JUPITER_RATIO = 2.364;

        // TODO code application logic here
         System.out.println("Welcome to the mass calculator, what is your name?");
          System.out.println("Matt");
          
          System.out.println("");
          System.out.println("");
          
          System.out.println("Hi Matt! How old are you?");
          
          Scanner input = new Scanner(System.in);
                              
          int age;
          age = input.nextInt();
          System.out.print(age);
          
          System.out.println("");
          System.out.println("");
          
          System.out.println("My, you're getting younger and younger! You sure are looking good for your age! Would you be so kind as to tell me your weight? (on Earth please!)");
                              
          int weight;
          weight = input.nextInt();
          System.out.print(weight);
          
          System.out.println("");
          System.out.println("");
          
          System.out.println("Let me do a bit of analysis...");
          
          System.out.println("");
          System.out.println("");
          
          
         
          System.out.println("All done! Here are the results:");
          
          
           String name = ("Earth,the Moon,Mars,Jupitar, weight, Earth, Mass Ratio");
         
          double marsWeight = weight * MARS_RATIO;
          double moonWeight = weight * MOON_RATIO;
          double jupiterWeight = weight * JUPITER_RATIO;
        
           System.out.printf("Body, \t \t \t \t \t Earth Mass Ratio");
          System.out.printf(name = "Earth:              %%d%n");
          System.out.printf(name = "the Moon:           %%d%n");
          System.out.printf(name = "Mars:               %%d%n");
          System.out.printf(name = "Jupitar:            %%d%n");
    }
}






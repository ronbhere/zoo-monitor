//@author Ron Buckner
package zoomonitor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ZooMonitor{
   
   
   public ZooMonitor() throws IOException {
   
   
   
   
   
   
   
   } 
   
   
   
   
   
   
   
   public static void main(String[] args) throws IOException{
      AnimalInfo animal = new AnimalInfo();
      HabitatInfo habitat = new HabitatInfo();
      Scanner scnr = new Scanner(System.in);
      String aDetails = "", aLion = "", aTiger = "", aBear = "", aGiraffe = "",
              aWarning = "";
      
      String firstMenu = "What would you like to do?\nType 'Monitor Animal'"
           + ", 'Monitor Habitat', or 'Exit'.";
      String animalMenu = "Which animal would you like to monitor?\n"
              + "Example - Type 'Lion' to monitor Lion.\n"
              + "Type 'Exit' to exit the program.\nType 'Back' to go to the "
              + "last menu.";
      String habitatMenu = "Which habitat would you like to monitor?\n"
              + "Example - Type 'Penguin' to monitor Penguin.\n"
              + "Type 'Exit' to exit the program.\nType 'Back' to go to the "
              + "last menu.";
              
      
     
//      animal.setDetails(aDetails);
//      System.out.println(animal.getDetails());

//      animal.setLion(aLion);
//      System.out.println(animal.getLion());

//        animal.setTiger(aTiger);
//        System.out.println(animal.getTiger());
      
      System.out.println(habitatMenu);
      
      
      
      

         
     
      
      
      
      
              
      
      

   }
}

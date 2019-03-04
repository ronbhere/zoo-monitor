//@author Ron Buckner
package zoomonitor;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class AnimalInfo {

   private String animalDetails;
   private String animalLion;
   private String animalTiger;
   private String animalBear;
   private String animalGiraffe;
   private String animalWarning;
   private String s;
   FileReader fr = new FileReader("src\\animals.txt");
   BufferedReader br = new BufferedReader(fr);
   
   public AnimalInfo() throws IOException {

      animalDetails = "none";
      animalLion = "none";
      animalTiger = "none";
      animalBear = "none";
      animalGiraffe = "none";
      animalWarning = "none";
      s = "none";
   }

   // Setup set & get
   public String getDetails() {
      return animalDetails;
   }

   public void setDetails(String details) throws IOException {
      File file = new File("src\\animals.txt");
      Scanner in = null;
      try {
         in = new Scanner(file);
         while (in.hasNext()) {
            String line = in.nextLine();
            if (line.contains("Details")) {
               System.out.println(line);
               animalDetails = details;
            }
         }
      } 
      catch (Exception ex) {
         ex.printStackTrace();
      }
   }

   public String getLion() {
      return animalLion;
   }

   public void setLion(String lion) throws IOException {
     
      String keyword = "Lion";
      while ((s=br.readLine())!=null) {
         if(s.contains(keyword)) {
         System.out.println(s);
         String nextLine = br.readLine();
         System.out.println(nextLine);
         nextLine = br.readLine();
         System.out.println(nextLine);
         nextLine = br.readLine();
         System.out.println(nextLine);
         nextLine = br.readLine();
         System.out.println(nextLine);
         animalLion = lion; 
         }
      }
   }
   
   public String getTiger() {
      return animalTiger;
   }

   public void setTiger(String tiger) throws IOException {
      String keyword = "Tiger";
      while ((s=br.readLine())!=null) {
         if(s.contains(keyword)) {
         System.out.println(s);
         String nextLine = br.readLine();
         System.out.println(nextLine);
         nextLine = br.readLine();
         System.out.println(nextLine);
         nextLine = br.readLine();
         System.out.println(nextLine);
         nextLine = br.readLine();
         System.out.println(nextLine);
         animalTiger = tiger;
         }
      }   
   }

   public String getBear() {
      return animalBear;
   }

   public void setBear(String bear) {
      animalBear = bear;
   }

   public String getGiraffe() {
      return animalGiraffe;
   }

   public void setGiraffe(String giraffe) {
      animalGiraffe = giraffe;
   }

   public String getWarning() {
      return animalWarning;
   }

   public void setWarning(String warning) {
      animalWarning = warning;
   }
}

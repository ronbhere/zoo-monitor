//@author Ron Buckner
package zoomonitor;

public class HabitatInfo {
   private String animalType;
   private String temperature;
   private String foodSource;
   private String cleanliness;
   private String habitatWarning;

   
   
   public HabitatInfo() {
      animalType = "";
      temperature = "";
      foodSource = "";
      cleanliness = "";
      habitatWarning = "";
   }
  
   public String getAnimalType() {
      return animalType;
   }

   public void setAnimalType(String animalType) {
      this.animalType = animalType;
   }

   public String getTemperature() {
      return temperature;
   }

   public void setTemperature(String temperature) {
      this.temperature = temperature;
   }

   public String getFoodSource() {
      return foodSource;
   }

   public void setFoodSource(String foodSource) {
      this.foodSource = foodSource;
   }

   public String getCleanliness() {
      return cleanliness;
   }

   public void setCleanliness(String cleanliness) {
      this.cleanliness = cleanliness;
   }

   public String getHabitatWarning(){
      return habitatWarning;
   }

   public void setHabitatWarning (String habitatWarning) {
      this.habitatWarning = habitatWarning;
   }
   
}   
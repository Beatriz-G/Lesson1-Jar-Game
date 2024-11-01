import java.util.Random; 
//Implement a constructor that takes these two parameters and initializes the instance variables.

public class Jar {
  //String for the item name
  private String jarItemName;
  //Integer for the max number of items
  private int maxNumbItems;
  //Integer for the current number of items
  private int currentNumbItems;
      
  public Jar (String jarItemName, int maxNumbItems) {
    this.jarItemName = jarItemName;
    this.maxNumbItems = maxNumbItems; 
  }
        
  //Create getter methods for both instance variables.
  public String getJarItemName() {
    return jarItemName;
  }
  
  //Create getter methods for both instance variables.
  public int getMaxNumbItems() {
    return maxNumbItems;
  }
 
  //Fill method in jar class
  public void fill() {
    Random random = new Random();
    currentNumbItems = random.nextInt(maxNumbItems) +1;
  }
  
  //Getter method for current number of items
  public int getCurrentNumbItems() {
    return currentNumbItems;
  }
}
import java.util.Scanner;

public class Prompter{
  private final Scanner scanner;
  
  public Prompter() {
    this.scanner = new Scanner(System.in);
  }

  //Prompt the administrator with "What type of item should fill the jar?". Store the response in a variable.
  public String promptJarItemName() {
    System.out.println("What type of item should fill the jar?   ");
    return scanner.nextLine();
  }
  
  //Prompt should ask “What is the maximum amount of gumballs?”.
  public int promptMaxNumbItems(String itemName) {
    System.out.printf("What is the maximum amount of %s?",  itemName);
    String userAmountChoice = scanner.nextLine();
    return Integer.parseInt(userAmountChoice);
  }
  
  //Prompt repeats the type of item in jar and range of possible guesses
  public int promptUserGuess(String jarItemName, int maxNumbItems) {
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d:",
                     jarItemName,
                     maxNumbItems
                     );
    
    String userGuessNum = scanner.nextLine();
    return Integer.parseInt(userGuessNum);
  }


  public void promptOverGuessMax(int userGuess, int maxNumbItems) {
    System.out.println("Your guess must be less than the max number!");
  }
  
  
  public void promptHighLowGuess(int userGuess, int currentNumbItems){
    if (userGuess < currentNumbItems) {
      System.out.println("Your guess is too low! Pick a higher number!");
    } else {
      System.out.println("Your guess is too high! Pick a lower number!");
    }
  }
  
  public void winningChoice (int amountOfGuesses) {
    System.out.printf("Congrats! You got it in %d attempts! Yay!%n", amountOfGuesses);
  }
}
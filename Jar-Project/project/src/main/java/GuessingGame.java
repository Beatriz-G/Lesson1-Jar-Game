public class GuessingGame {
    public static void main(String[] args) {
      
      Prompter prompter = new Prompter();
      
      String jarItemName = prompter.promptJarItemName();
      int maxNumbItems = prompter.promptMaxNumbItems(jarItemName);
      
      //New jar object usng the collected informaiton
      Jar jar = new Jar(jarItemName, maxNumbItems);
      
      //Method to choose random number
      jar.fill();
      
      //Loop
      int amountOfGuesses = 0;
      int userGuess;
      int currentNumbItems = jar.getCurrentNumbItems();
      boolean correctGuess = false;

      
      while (!correctGuess) {
        userGuess = prompter.promptUserGuess(jarItemName, maxNumbItems);
        amountOfGuesses++;
      
        if (userGuess == currentNumbItems) {
          correctGuess = true;
        } else if (userGuess > maxNumbItems) {
          prompter.promptOverGuessMax(userGuess, maxNumbItems);
          amountOfGuesses--;
        } else {         
          prompter.promptHighLowGuess(userGuess, maxNumbItems);
        }
      }
      prompter.winningChoice(amountOfGuesses);
    }
}

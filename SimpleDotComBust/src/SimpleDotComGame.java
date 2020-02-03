import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleDotComGame {

  public static void main(String[] args) {
    int numOfGuesses = 0;
    SimpleDotCom dotCom = new SimpleDotCom();
    int randomNum = new Random().nextInt(5);
    ArrayList<String> locations = new ArrayList<>();
    locations.add(Integer.toString(randomNum));
    locations.add(Integer.toString(randomNum + 1));
    locations.add(Integer.toString(randomNum + 2));
    dotCom.setLocationCells(locations);
    String result = "hit";
    while (!result.equals("kill")) {
      System.out.print("enter a number: ");
      String userGuess = new Scanner(System.in).next();
      result = dotCom.checkYourself(userGuess);
      numOfGuesses++;
    }
    if (result.equals("kill"))
      System.out.println("You took " + numOfGuesses + " guesses");
    int[] arr = new int[5];
    arr = new int[80];
  }
}

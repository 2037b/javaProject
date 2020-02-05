import java.util.ArrayList;

public class DotComBust {

  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComList = new ArrayList<>();
  private int numOfGuesses;

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }

  private void setUpGame() {
    DotCom one = new DotCom();
    one.setName("pets.com");
    DotCom two = new DotCom();
    two.setName("askMe.com");
    DotCom three = new DotCom();
    three.setName("go2.com");
    dotComList.add(one);
    dotComList.add(two);
    dotComList.add(three);
    System.out.println("Your goal is sink three dotcoms.");
    for (DotCom dotComToSet : dotComList) {
      ArrayList<String> newLocation = helper.placeDotCom(3);
      dotComToSet.setLocationCells(newLocation);
    }
  }

  private void startPlaying() {
    while (!dotComList.isEmpty()) {
      String userGuess = helper.getUserInput("Enter a guess:");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  private void checkUserGuess(String userGuess) {
    numOfGuesses++;
    String result = "miss";
    for (DotCom dotComToTest : dotComList) {
      result = dotComToTest.checkYourself(userGuess);
      if (result.equals("hit")) {
        break;
      }
      if (result.equals("kill")) {
        dotComList.remove(dotComToTest);
        break;
      }
    }
    System.out.println(result);
  }

  private void finishGame() {
    System.out.println("All Dot Coms are dead!Your stock is now worthless.");
    if (numOfGuesses <= 18) {
      System.out.println("It only took you " + numOfGuesses + " guess.");
      System.out.println("You got out before your options sank.");
    } else {
      System.out.println("Took you long enough " + numOfGuesses + " guess.");
      System.out.println("Fish are dancing with your options.");
    }
  }
}

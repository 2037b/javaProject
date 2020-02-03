import java.util.ArrayList;

public class SimpleDotComTest {

  public static void main(String[] args) {
    SimpleDotCom dot = new SimpleDotCom();
    ArrayList<String> locations = new ArrayList<>();
    locations.add("4");
    locations.add("5");
    locations.add("6");
    dot.setLocationCells(locations);
    String userGuess = "6";
    String result = dot.checkYourself(userGuess);
    String testResult = "failed";
    if (result.equals("hit"))
      testResult = "passed";
    System.out.println(testResult);
  }
}

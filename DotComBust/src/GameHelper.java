import java.util.ArrayList;
import java.util.Scanner;

public class GameHelper {

  private static final String ALPHABET = "abcdefg";
  private int gridLength = 7;
  private int gridSize = 49;
  private int[] grid = new int[gridSize];
  private int comCount;

  public String getUserInput(String prompt) {
    System.out.print(prompt);
    String input = new Scanner(System.in).next();
    return input.toLowerCase();
  }

  public ArrayList<String> placeDotCom(int comSize) {
    ArrayList<String> alphaCells = new ArrayList<>();
    String[] alphaCoords = new String[comSize];
    String temp = null;
    int[] coords = new int[comSize];
    int attempts = 0;
    boolean success = false;
    int location;
    comCount++;
    int incr = 1;
    if (comCount % 2 == 1) {
      incr = gridLength;
    }
    while (!success & attempts++ < 200) {
      location = (int) (Math.random() * gridSize);
      int x = 0;
      success = true;
      while (success && x < comSize) {
        if (grid[location] == 0) {
          coords[x++] = location;
          location += incr;
          if (location >= gridSize) {
            success = false;
          }
          if (x > 0 && (location % gridLength == 0)) {
            success = false;
          }
        } else {
          success = false;
        }
      }
    }
    int x = 0;
    int row = 0;
    int column = 0;
    while (x < comSize) {
      grid[coords[x]] = 1;
      row = (int) (coords[x] / gridLength);
      column = coords[x] % gridLength;
      temp = String.valueOf(ALPHABET.charAt(column));
      alphaCells.add(temp.concat(Integer.toString(row)));
      x++;
    }
    return alphaCells;
  }
}

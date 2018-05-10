import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class vectorAdder{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> vector1 = new ArrayList<String>();
    ArrayList<String> vector2 = new ArrayList<String>();
    boolean done = false;
    int counter;

    do{
      System.out.println("Input values of the first vector separated by spaces and press enter:");
      vector1.add(scanner.nextLine());
      done = true;
    }while(!done);

    List<String> itemList = Arrays.asList(list.get(0).split(" "));
    list.remove(0);
    for (counter = 0; counter < itemList.size(); counter++){
      vector1.add(itemList.get(counter));
    }

    System.out.println("vector1:" + vector1);
  }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class vectorAdder{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean done = false;
    //int counter;


    do{
      CreateVector vector1 = new CreateVector("first");
      CreateVector vector2 = new CreateVector("second");

      System.out.println("vector1:" + vector1.elements);
      System.out.println("vector2:" + vector2.elements);

      if (vector1.size() == vector2.size()){
        addVectors(vector1.elements, vector2.elements);
        done = true;
      }
    }while(!done);
  }



  static void addVectors(List<Integer> vec1, List<Integer> vec2){

      List<Integer> sumOfVectors = new ArrayList<Integer>();

    for (int counter = 0; counter < vec1.size(); counter++)
      sumOfVectors.add(vec1.get(counter) + vec2.get(counter));

    System.out.println("sum:" + sumOfVectors);
  }

}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VectorAdder{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean done = false;
    //int counter;


    do{
      CreateVector vector1 = new CreateVector("first");
      CreateVector vector2 = new CreateVector("second");

      System.out.println("vector1:" + vector1.elements);
      System.out.println("vector2:" + vector2.elements);

      try{
        addVectors(vector1.elements, vector2.elements);
        done = true;
      }catch (DifferentVectorsLengthException E){
        System.out.println(E.getMessage());
      }

    }while(!done);
  }



  static void addVectors(List<Integer> vec1, List<Integer> vec2) throws DifferentVectorsLengthException {
    if (vec1.size() == vec2.size()){
      List<Integer> sumOfVectors = new ArrayList<Integer>();

      for (int counter = 0; counter < vec1.size(); counter++)
        sumOfVectors.add(vec1.get(counter) + vec2.get(counter));

      System.out.println("sum:" + sumOfVectors);
    }else
      throw new DifferentVectorsLengthException();
  }
}

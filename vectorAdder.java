import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class vectorAdder{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> vector1 = new ArrayList<Integer>();
    List<Integer> vector2 = new ArrayList<Integer>();
    boolean done_vec1 = false, done_vec2 = false, done = false;
    int counter;



    do{
      List<String> temporaryList = new ArrayList<String>();
      System.out.println("Input values of the first vector separated by spaces and press enter:");
      temporaryList.add(scanner.nextLine());

      temporaryList = Arrays.asList(temporaryList.get(0).split(" "));

      for (counter = 0; counter < temporaryList.size(); counter++){
        try{
          //if (!("").equals(temporaryList.get(counter)))
            vector1.add(Integer.parseInt(temporaryList.get(counter)));
        }catch(NumberFormatException E){
          //System.out.println(E);
        }catch(Exception I){
          System.out.println(I);
        }
      }

      if (vector1.size() > 0)
        done_vec1 = true;

    }while(!done_vec1);

    //temporaryList.clear(); //java.lang.UnsupportedOperationException

    do{
      List<String> temporaryList = new ArrayList<String>();
      System.out.println("Input values of the second vector separated by spaces and press enter:");
      temporaryList.add(scanner.nextLine());


      temporaryList = Arrays.asList(temporaryList.get(0).split(" "));

      for (counter = 0; counter < temporaryList.size(); counter++){
        try{
          //if (!("").equals(temporaryList.get(counter)))
            vector2.add(Integer.parseInt(temporaryList.get(counter)));
        }catch(NumberFormatException E){
          //System.out.println(E);
        }catch(Exception I){
          System.out.println(I);
        }
      }

      if (vector1.size() > 0)
        done_vec2 = true;

    }while(!done_vec2);


    System.out.println("vector1:" + vector1);
    System.out.println("vector2:" + vector2);
  }

  static void addVectors(List<Integer> vec1, List<Integer> vec2){

  }

}

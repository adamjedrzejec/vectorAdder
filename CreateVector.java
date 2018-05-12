import java.util.*;

public class CreateVector{
  List<Integer> elements = new ArrayList<Integer>();

  public CreateVector(String whichVector){

    boolean done = false;
    Scanner scanner = new Scanner(System.in);

    while(!done){
      List<String> temporaryList = new ArrayList<String>();
      System.out.println("Input values of the " + whichVector + " vector separated by spaces and press enter:");
      temporaryList.add(scanner.nextLine());

      temporaryList = Arrays.asList(temporaryList.get(0).split(" "));

      for (int counter = 0; counter < temporaryList.size(); counter++){
        try{
          elements.add(Integer.parseInt(temporaryList.get(counter)));
        }catch(NumberFormatException E){
        }catch(Exception I){
          System.out.println(I);
        }
      }

      if (elements.size() > 0)
        done = true;
    }
  }


  int size(){
    return elements.size();
  }

}

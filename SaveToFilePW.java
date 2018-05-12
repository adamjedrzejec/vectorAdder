import java.io.*;
import java.util.List;

public class SaveToFilePW{
  public SaveToFilePW(List<Integer> output) {


      try (PrintWriter printWriter = new PrintWriter(new FileWriter("PrintWriter.txt"))){
        printWriter.print("The sum of two vectors is: [");
        for(int element: output){
          if(element == output.get(output.size()-1)){
            printWriter.print(element + "]");
          }
          else{
            printWriter.print(element + ", ");
          }
        }
        printWriter.close();
      }catch(IOException e){
        System.out.println("Saving to file failed.");
      }


  }
}

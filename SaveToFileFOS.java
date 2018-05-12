import java.io.*;
import java.util.List;

public class SaveToFileFOS{
  public SaveToFileFOS(List<Integer> output) {

    boolean done = false;


    do{
      try{
        FileOutputStream outputStream = new FileOutputStream("FileOutputStream.txt");
        outputStream.write(("The sum of two vectors is: [").getBytes());
        for(Integer element: output){
          byte[] outputToBytes;
          if (element == output.get(output.size()-1)){
            outputToBytes = (Integer.toString(element) + "]").getBytes();
          }else{
            outputToBytes = (Integer.toString(element) + ", ").getBytes();
          }
          outputStream.write(outputToBytes);
        }
        outputStream.close();
        done = true;
      }catch(Exception io){
        System.out.println(io);
      }
    }while(!done);
  }
}

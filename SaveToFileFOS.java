import java.io.*;
import java.util.List;

public class SaveToFileFOS{
  public SaveToFileFOS(List<Integer> output) {

    boolean done = false;


    do{
      try{
        FileOutputStream outputStream = new FileOutputStream("FileOutputStream.txt");
        outputStream.write(("The sum of two vectors is: ").getBytes());
        for(Integer i: output){
          byte[] outputToBytes = (Integer.toString(i) + " ").getBytes();
          outputStream.write(outputToBytes);
        }
        outputStream.close();
        done = true;
      }catch(FileNotFoundException e){
        File test = new File("FileOutputStream.txt");
      }catch(Exception io){
        System.out.println(io);
      }
    }while(!done);
  }
}

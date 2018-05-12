import java.io.*;

public class SaveToFile{
  public SaveToFile(List<Integer> output) {

    boolean done = false;

    String str = "Hello";

    do{
      try{
        FileOutputStream outputStream = new FileOutputStream("file.txt");
        for(int i: output){
          byte[] outputToBytes = Integer.toString(output).getBytes();
          outputStream.write(outputToBytes);
        }
        outputStream.close();
      }catch(FileNotFoundException e){
        File test = new File("file.txt");
      }catch(Exception io){
        System.out.println(io);
      }
    }while(!done);
  }
}

import java.io.FileOutputStream;
import java.io.FileWriter;
class FileDemo3{
  public static void main(String args[]){
    try{
     FileWriter fw=new FileWriter("Practice.txt");
     fw.write("Welcome to india");
     fw.close();
   }
   catch(Exception e){
     System.out.println(e);
   }
  }
}

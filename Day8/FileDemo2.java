import java.io.*;
class FileDemo2{
  public static void main(String args[]){
    try{
      FileReader fr=new FileReader("Practice.txt");
      int i;
      while((i=fr.read())!=-1){
        System.out.print((char)i);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
   }
}
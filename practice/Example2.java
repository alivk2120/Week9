class Example2{
  public static void main(String srgs[]){
    String str="hi heelo welcome to bitabs";
    String words[]=str.split(" ");
    String longestword=null;
    int wordLength=0,max=0;
    for(int i=0;i<words.length;i++){
      wordLength=words[i].length();
      if(max<wordLength){
        max=wordLength;
        longestword=words[i];
      }
    }
    System.out.println("Longest word is "+longestword);
  }
}
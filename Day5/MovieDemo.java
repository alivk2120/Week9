//Write a Java class called Movie that has fields for the movie's title, director, and release year
import java.util.*;
class Movie implements Comparable<Movie>{
  String movi;
  String name;
  int relYear;
  Movie(String movi,String name,int relYear){
    this.movi=movi;
    this.name=name;
    this.relYear=relYear;
  }
  public int compareTo(Movie m){
    if(relYear>m.relYear){
      return -1;
    }
    else if(relYear<m.relYear){
      return 1;
    }
    else{
      return 0;
    }
  }
public String getMovi() {
	return movi;
}
public void setMovi(String movi) {
	this.movi = movi;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRelYear() {
	return relYear;
}
public void setRelYear(int relYear) {
	this.relYear = relYear;
}
  
}
class MovieDemo{
  public static void main(String args[]){
    ArrayList<Movie> movies=new ArrayList<Movie>();
    Scanner s=new Scanner(System.in);
    for(int i=0;i<3;i++){
      movies.add(new Movie(s.next(),s.next(),s.nextInt()));
    }
    Collections.sort(movies);
    for(Movie m:movies){
      System.out.println(m.getMovi()+" "+m.getName()+" "+m.getRelYear());
    }
  }
}
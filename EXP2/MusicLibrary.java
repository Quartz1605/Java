import java.util.ArrayList;

class Song{
  ArrayList<String> title;
  ArrayList<String> artist;
  ArrayList<Integer> duration;

  public Song(String stitle,String sartist,int sduration){
    title = new ArrayList<>();
    artist = new ArrayList<>();
    duration = new ArrayList<>();
  }

  public void display(){
    
    for(int j=0;j<title.size();j++){
      System.out.println("The song title is " + title.get(j) + ", the artist is " + artist.get(j) + ", duration is " + duration.get(j) + " minutes.");
    }
  }

  public void addSong(String stitle,String sartist,int sduration){
    title.add(stitle);
    artist.add(sartist);
    duration.add(sduration);
  }
  
  public void removeSong(String deltitle){
    for(int j=0;j<title.size();j++){
      
      if(title.get(j) == deltitle){
        title.remove(j);
        artist.remove(j);
        duration.remove(j);
      }

    }

  }


}


public class MusicLibrary{


  public static void main(String[] args){

    

    //Song song1 = new Song();
    //song1.addSong("Despacito","Luis Fonsi",4);
    //song1.addSong("Shape of you","Ed Sheeren",3);
    //song1.display();

    //song1.removeSong("Shape of you");
    //song1.display();

    Song song2 = new Song("Hey baby","Neeraj Shridhar",4);
    song2.display();

  } 
}
// Cost of seat and box office wala part baaki hai but easy hai wo so pls complete karlena

class Production{

  String title,director,writer;

  
  public Production(String title,String director,String writer){
    this.title = title;
    this.director = director;
    this.writer = writer;
  }

  public String getTitle(){
    return title;
  }

  public String getDirector(){
    return director;
  }

  public String getWriter(){
    return writer;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public void setDirector(String director){
    this.director = director;
  }

  public void setWriter(String writer){
    this.writer = writer;
  }

  @Override // toString() samjh lo yaha pe.
  public String toString(){
    
    return "The movie title is " + title + ", the director is " + director + ", writer is "+ writer ;
    
  }

}

class Play extends Production{

  
  static int performances=0; //Static very imp yaha 
  public Play(String title,String director,String writer){
    
    super(title,director,writer); //Imp stuff
    performances += 1;

  }



}

class Musical extends Play{

  String composer,lyricist;

  public Musical(String title,String director,String writer,String composer,String lyricist){
    super(title,director,writer);
    this.composer = composer;
    this.lyricist = lyricist;
  }

  @Override
  public String toString(){
   return "The movie title is " + title + ", the director is " + director + ", writer is "+ writer + ",the composer is " + composer + ",lyricist is " + lyricist ;
  }

}









public class Tester{

  public static void main(String[] args){

    Play play1 = new Play("RamSetu","Kaviraj","Anuj");
    Play play2 = new Play("Sherlock Holmes","Richard","Henry");
    Play play3 = new Play("Kitertsu","Anirvan","Saket");
    
    Musical musc1 = new Musical("Kayan","Raj","Ahmad","Pranav","Vrinda");
    Musical musc2 = new Musical("Kayamat","Karkesh","Nayak","Amisha","Srishti");
    
    System.out.println(musc2.performances);
    
  }

}

class Fiction{
  public void fictionBook(){
    System.out.println("Fiction books here");
  }
}

class NonFiction{
  public void nonfictionBook(){
    System.out.println("Non-Fiction books here");
  }
}



class Author extends Fiction{

    public void hi(){
      System.out.println("Hi from author.");
    }

    

}



public class Bookauthor{

  public static void main(String[] args){

    Author auth = new Author();

    auth.fictionBook();
    auth.hi();
    
    
  }
}



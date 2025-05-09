class Rashes extends Cholera{

  public Rashes(){
    super();
    System.out.println("I am rashes.");

  }

}


class Cholera extends Medical{

  public Cholera(){
    super.display();
    System.out.println("I am  Cholera");
  }
}

class Medical{

  public void display(){
    System.out.println("I represent a lot of diseases.");
  }
}

public class Diseases{

  public static void main(String[] args){

    Cholera rash = new Rashes();
   
  }
}
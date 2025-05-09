
class Building{

  public void colour(){
    System.out.println("The building's colour is blue");
  }
}

class Room extends Building{

  @Override
  public void colour(){
    System.out.println("The room's colour is red");
  }
}




public class People{

    public static void main(String[] args){

      Building room = new Room();
      room.colour();

    }





}
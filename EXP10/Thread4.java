
class OneToTen extends Thread{

  public void run(){
    
    for(int i=0;i<10;i++){
      System.out.print((i+1) + " ");

      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
        e.printStackTrace();
      }

    }
  }

}

class FiveMultiply extends Thread{

  public void run(){

    for(int j=1;j<=10;j++){
      System.out.print((5*j + " "));

      try{
        Thread.sleep(1500);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}



public class Thread4{


  public static void main(String[] args){

    FiveMultiply five = new FiveMultiply();
    OneToTen one = new OneToTen();

    five.start();
    one.start();


  }
}
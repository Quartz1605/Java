
class EvenThread extends Thread{

  public void run(){

    for(int i=1;i<=20;i++){

      if(i % 2 == 0){
        System.out.print(i + " ");
      }
    }
  }
}

class OddThread extends Thread{
  public void run(){

    for(int j=1;j<21;j++){
      if(j%2 != 0){
        System.out.print(j + " ");
      }
    }
  }
}






public class Thread2{

  public static void main(String[] args){

    EvenThread t1 = new EvenThread();
    OddThread t2 = new OddThread();

    t1.start();
    t2.start();

  }
}
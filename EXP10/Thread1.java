class PrintNum extends Thread{

  public void run(){
    for(int i=0;i<10;i++){
      System.out.print((i+1) + " ");
    }
  }
}

class PrintHappy extends Thread{

  public void run(){
    for(int j=0;j<3;j++){
      System.out.print("I am happy" + " ");
    }
  }
}


public class Thread1{

  public static void main(String[] args){

    PrintNum num = new PrintNum();
    num.start();

    PrintHappy happy = new PrintHappy();
    happy.start();

  }

}
class Num{

  int num;
  public boolean isAvailable = false;
  
  public synchronized void setNumber(int num){
    while(isAvailable){
      try{
        wait();
      }catch(Exception e){
        e.printStackTrace();
      }
    }

    this.num = num;
    notify();
    isAvailable = true;
  }

  public  synchronized int getNumber(){
    
    while(!isAvailable){
      try{
        wait();
      }catch(Exception e){
        e.printStackTrace();
      }
    }

    notify();
    isAvailable = false;
    
    
    return num;
  }

}

class GenNumber implements Runnable{

  Num numb;
  
  public GenNumber(Num numb){
    this.numb = numb;
  }
  
  public void run(){
    
    int max = 200;
    int min = 10;
    int range = max-min + 1;

    for(int i=0;i<5;i++){
    int num = (int)(Math.random()*range) + min;

    System.out.println("Number is " + num);

    numb.setNumber(num);

    try{
      Thread.sleep(1000);
    }catch(Exception e){
      e.printStackTrace();
    }

    }

  }

}

class OddEven implements Runnable{

  Num num2;

  public OddEven(Num num2){
    this.num2 = num2;
  }

  public void run(){
    
    for(int i=0;i<5;i++){
    int number = num2.getNumber();

    if(number % 2 == 0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
    }
  }

}





public class Thread6{

  public static void main(String[] args){

    Num num4 = new Num();

    Thread t1 = new Thread(new GenNumber(num4));
    Thread t2 = new Thread(new OddEven(num4));

    
    t2.start();
    t1.start();

  }




}
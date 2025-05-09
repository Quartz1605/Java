import java.util.Scanner;

interface EatItHere{

  
  double dispatchOrder();

}

interface TakeAway{

  
  double deliverOrder();

}

class Consumer implements EatItHere,TakeAway{

  int orderNumber;
  int orderPrice;

  public Consumer(int orderNumber,int orderPrice){

    this.orderNumber = orderNumber;
    this.orderPrice = orderPrice;
  }

  @Override
  public double deliverOrder(){

    int fee = 45;
    double orderFee = 0.05*orderPrice;

    if(fee > orderFee){
      return fee + orderPrice;
    }else{
      return orderFee + orderPrice;
    }

  }

  @Override
  public double dispatchOrder(){

    int convFee = 500;
    double orderFee = 0.1*orderPrice;

    if(convFee > orderFee){
      return orderFee + orderPrice;
    }else{
      return convFee + orderPrice;
    }

  }



}


public class FastFood{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to Takeshi's Restrau");

    Consumer c1 = new Consumer(1,1200);
    System.out.println("Your payable amount is $" + c1.deliverOrder());

    Consumer c2 = new Consumer(2,712);
     System.out.println("Your payable amount is $" + c2.dispatchOrder());



  }


}
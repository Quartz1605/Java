// Complete it kal..

import java.util.Scanner;

class Plans{

  int talktime;
  int data;
  int discount;
  int price;

  public Plans(int talktime, int price){
    this.talktime = talktime;
    this.data = 0;
    this.discount = 0;
    this.price = price;
  }

  public Plans(int data,int price){
    this.talktime = 0;
    this.data = data;
    this.discount = 0;
    this.price = price;
  }

  public Plans(int talktime, int data,int discount,int price){
    this.talktime = talktime;
    this.data = data;
    this.discount = discount;
    this.price = price;
  }

}



public class Recharge{

  public static void main(String[] args){

    String name;
    int number;
    int balance;

    Scanner sc = new Scanner(System.in)

    System.out.println("Enter name");
    name = sc.next();

    System.out.println("Enter number");
    number = sc.nextInt();

    System.out.println("Enter balance");
    balance = sc.nextInt();

    Plans plans[] = {new Plans(15,300),new Plans(2,750),new Plans(15,2,10,1000)};

    for(int i=0;i<3;i++){

    } 




  }
}
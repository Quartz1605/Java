import java.util.Scanner;


class Items{
  
  String name;
  double price;
  double discount;
  double shippingcost;
  
  

  public Items(String name,double price){

   this.name = name;
   this.price = price;
   this.discount = 0;
   this.shippingcost = 0;

  }

  public Items(String name,double price,double discount){

    this.name = name;
    this.price = price;
    this.discount = discount;
    this.shippingcost = 0;
  }

  public Items(String name,double price,double discount,double shippingcost){
    
    this.name = name;
    this.price = price;
    this.discount = discount;
    this.shippingcost = shippingcost;

  }

  public double bill(double price,int quantity){

    return price*quantity;

  }

  public double bill(double price,int quantity,double discount){

    double cost = price*quantity - (price*quantity)*(discount/100);
    return cost;
  }

  public double bill(double price,int quantity,double discount,double shippingcost){

    double cost = price*quantity - (price*quantity)*(discount/100);
    return cost+shippingcost;
  }

  

  

}





public class Ecommerce{

  public static void main(String[] args){
    String name,address;
    int balance;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name");
    name = sc.next();

    System.out.println("Enter your address");
    address = sc.next();

    System.out.println("Enter your balance");
    balance = sc.nextInt();

    Items items[] = {new Items("Shoes", 1500),new Items("T-shirt", 800, 10),new Items("Laptop", 40000, 5, 500)};

    System.out.println("Items list :");
    for(int i=0;i<3;i++){
      System.out.println((i+1) + "." + items[i].name + " - " + items[i].price);
    }
   
    System.out.println("Select a item to buy");
    int id = sc.nextInt();
    int selectedItemid = id-1;

    System.out.println("Select quantity");
    int quantity = sc.nextInt();

    

    if(items[selectedItemid].discount > 0 && items[selectedItemid].shippingcost > 0){
      double amt = items[selectedItemid].bill(items[selectedItemid].price,quantity,items[selectedItemid].discount,items[selectedItemid].shippingcost);

      System.out.println("Final bill is " + amt);

    }else if(items[selectedItemid].discount > 0){
      double amt = items[selectedItemid].bill(items[selectedItemid].price,quantity,items[selectedItemid].discount);

      System.out.println("Final bill is " + amt);

    }else{
      double amt = items[selectedItemid].bill(items[selectedItemid].price,quantity);

      System.out.println("Final bill is " + amt);

    }



    


  }


}
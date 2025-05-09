class Account{

  int amount;

  public void deposit(int amt){
    
    if(amt < 0){
      throw new NullPointerException();
    }

    this.amount = amt;
    System.out.println("Money Deposited.");
  }

  public int withdraw(int amt){
    
    if(amt < 0){
      throw new NullPointerException();
      
    }

    
    if(amount >= amt){
      
      amount = amount - amt;
      System.out.println("Money successfully withdrawn.");
      return amt;
    }else{
      throw new ArithmeticException();
    }

  }

}





public class BankException{


  public static void main(String[] args){

    System.out.println("Welcome to Banking system Example.");
    try{
      Account acc = new Account();
      acc.deposit(20);
      acc.withdraw(40);
    }
    catch(Exception e){
      
      e.printStackTrace();
    }

  }
}
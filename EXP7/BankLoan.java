abstract class Loan{
  
  abstract public void homeLoan();
  abstract public void carLoan();
  

}

class Homeloan extends Loan{
  
  @Override
  public void homeLoan(){
    System.out.println("Welcome to home loan");

  }

  @Override
  public void carLoan(){
    System.out.println("Welcome to Car loan");

  }

}




public class BankLoan{

  public static void main(String[] args){

    
    Homeloan homeloan = new Homeloan();
    homeloan.homeLoan();
    homeloan.carLoan();

  }
}
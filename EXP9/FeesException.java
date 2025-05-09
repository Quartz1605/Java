import java.util.Scanner;
import java.text.ParseException;

public class FeesException{



  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Fees management system !");
    System.out.println();

    try{
      System.out.println("Enter fees in String");
      String input = sc.next();
      int fees = Integer.parseInt(input);

    }catch(NumberFormatException e){
      try{
        int b = 2/0;
      }catch(ArithmeticException em){
        em.printStackTrace();
      }

      e.printStackTrace();
    }

  }
}
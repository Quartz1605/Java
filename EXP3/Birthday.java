import java.util.Scanner;

class Date{
  int year;
  int month;
  int date;
  int hrs;
  int min;
  int sec;

  public Date(){
    this.year = 2000;
    this.month = 1;
    this.date = 1;
    this.hrs = 0;
    this.min = 0;
    this.sec = 0;
  }

  public void setDate(int year, int month, int date){
    this.year = year;
    this.month = month;
    this.date = date;

  }

  public void setDate(int year, int month, int date, int hrs, int min){
    this.year = year;
    this.month = month;
    this.date = date;
    this.hrs = hrs;
    this.min = min;
  }

  public void setDate(int year, int month, int date, int hrs, int min, int sec){
    this.year = year;
    this.month = month;
    this.date = date;
    this.hrs = hrs;
    this.min = min;
    this.sec = sec;
  }

  public void displayDate(){

    System.out.println("The year is " + year + "Month is " + month + "Date is " + date + "Time is " + hrs + " : " + min + " : " + sec);

  }

  public void calculateRetirement(){

    System.out.println("Your retirement will be at");
    System.out.println("The year will be " + (this.year + 60) + " month will be " + this.month + " Date is " + this.date + " Time will be " + this.hrs + ":" + this.min + ":" + this.sec);


  }

  public Date parseDate(String dob){
    String parts[] = dob.split("-");

    int date = Integer.parseInt(parts[0]);
    int month = Integer.parseInt(parts[1]);
    int year = Integer.parseInt(parts[2]);

    Date newdate = new Date();
    newdate.setDate(year,month,date);

    return newdate;


  }
  
  


}



public class Birthday{

  public static void main(String[] args){

    Date date = new Date();

    date.setDate(2002,2,12,4,12,10);
    date.calculateRetirement();

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name 1:");
    String name1 = sc.next();
    System.out.println("Enter Dob1");
    String dob1 = sc.next();

    System.out.println("Enter name 2:");
    String name2 = sc.next();
    System.out.println("Enter Dob2");
    String dob2 = sc.next();

    
    Date parsedDate1 = date.parseDate(dob1);
    Date parsedDate2 = date.parseDate(dob2);

    if(parsedDate1.year < parsedDate2.year){
      System.out.println(name1);
    }
    
    else if(parsedDate1.year == parsedDate2.year){
      
      if(parsedDate1.month < parsedDate2.month){
        System.out.println(name1);
      }
      
      else if(parsedDate1.month == parsedDate2.month){
        
        if(parsedDate1.date < parsedDate2.date){
          System.out.println(name1);
        }
        
        else{
          System.out.println(name2);
        }

      }
      
      else{
        System.out.println(name2);
      }

    }
    
    else{
      System.out.println(name2);
    }

  }
}
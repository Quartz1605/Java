import java.util.Scanner;

class Library{

  String title;
  String author;
  int copies;

  public Library(String title,String author,int copies){

    this.title = title;
    this.author = author;
    this.copies = copies;
  }

  public void issueBook(){
    copies = copies - 1;
    System.out.println("Copy issued.");
    System.out.println("Number of copies left are " + copies);
  }

  public void returnBook(){
    copies+=1;
    System.out.println("Copy Returned.");
    System.out.println("Number of copies are " + copies);
  }

  public void checkAvailability(){
    System.out.println("Total number of copies are " + copies);
  }

  public void display(){
    System.out.println("Title of the the book is " + title + "it's written by " + author + " and number of copies are " + copies);
  }


}



public class LibrarySystem{

  public static void main(String[] args){

    Library book1 = new Library("Harry Potter","J.K Rowling",20);
    Library book2 = new Library("Hunger Games","Katniss Everdeen",10);
    Library book3 = new Library("Fault in our Stars","John Green",40);

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your prefrred book (1-Harry Potter, 2-Hunger Games, 3-Fault in our Stars)");
    int n = sc.nextInt();
    int num1,num2,num3;

    switch(n){

      case 1:

        System.out.println("Enter your preferred action (1-Issue book, 2-Return Book, 3-Check availability, 4-To show details.)");
        num1 = sc.nextInt();
        
        switch(num1){

          case 1:
            book1.issueBook();
            break;

          case 2:
            book1.returnBook();
            break;

          case 3:
            book1.checkAvailability();
            break;
          
          case 4:
            book1.display();
            break;
        }

        break;


      case 2:

        System.out.println("Enter your preferred action (1-Issue book, 2-Return Book, 3-Check availability, 4-To show details.)");
        num2 = sc.nextInt();
        
        switch(num2){

          case 1:
            book2.issueBook();
            break;

          case 2:
            book2.returnBook();
            break;

          case 3:
            book2.checkAvailability();
            break;
          
          case 4:
            book2.display();
            break;
        }

        break;

      
      case 3:

        System.out.println("Enter your preferred action (1-Issue book, 2-Return Book, 3-Check availability, 4-To show details.)");
        num3 = sc.nextInt();
        
        switch(num3){

          case 1:
            book3.issueBook();
            break;

          case 2:
            book3.returnBook();
            break;

          case 3:
            book3.checkAvailability();
            break;
          
          case 4:
            book3.display();
            break;
        }

        break;

      



    }


  }

}
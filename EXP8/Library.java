interface Borrowable{

  void borrow();
  void returnItem();

  public static void LibraryRules(){
    System.out.println("Library Rules: ");
    System.out.println("1. Borrow period: 14 days.");
    System.out.println("1. Borrow period: 14 days.");
    System.out.println("2. Late fee: Rs. 10 per day.");
    System.out.println("3. Max reservations: 3 items."); 

  }
}

interface Reservable{

  void reserve();
  void cancelReservation();

  public static void LibraryRules(){
    System.out.println("Library Rules: ");
    System.out.println("1. Borrow period: 14 days.");
    System.out.println("1. Borrow period: 14 days.");
    System.out.println("2. Late fee: Rs. 10 per day.");
    System.out.println("3. Max reservations: 3 items."); 

  }
}

abstract class LibraryItem implements Borrowable,Reservable{

  String title,author;
  int itemId;

  public LibraryItem(String title,String author,int itemId){
    this.title = title;
    this.author = author;
    this.itemId = itemId;
  }

  abstract void getItemType();

  public void displayInfo(){
    System.out.println("Item ID :" + itemId);
    System.out.println("Title :" + title);
    System.out.println("Author :" + author);
    
  }

}

class Book extends LibraryItem implements Borrowable,Reservable{

  public Book(String title,String author,int itemId){

    super(title,author,itemId);

  }

  @Override
  public void getItemType(){
    System.out.println("Item Type : Book");
  }

  @Override
  public void borrow(){
    System.out.println("Book borrowed.");
  }

  @Override
  public void reserve(){
    System.out.println("Book reserved.");

  }

  @Override
  public void returnItem(){
    System.out.println("Book returned.");
  }

  @Override
  public void cancelReservation(){
    System.out.println("Book reservation cancelled.");
  }

  


}

class Magazine extends LibraryItem implements Reservable{

  public Magazine(String title,String author,int itemId){

    super(title,author,itemId);

  }

  @Override
  public void getItemType(){
    System.out.println("Item Type : Magazine");
  }

  @Override
  public void reserve(){
    System.out.println("Magazine reserved.");
  }

  @Override
  public void cancelReservation(){
    System.out.println("Magazine reservation cancelled.");
  }

  
  public void returnItem(){}

  
  public void borrow(){}
  
}



public class Library{

  public static void main(String[] args){

    System.out.println("Welcome to E-Library");
    System.out.println();

    LibraryItem lib[] = new LibraryItem[4];

    lib[0] = new Book("Java Programming","James Gosling",101);
    lib[1] = new Magazine("Tech World","Editorial Team",202);

    for(int i=0;i<2;i++){
      lib[i].displayInfo();
      lib[i].getItemType();
      lib[i].borrow();
      lib[i].reserve();
      lib[i].cancelReservation();
      System.out.println();
    }
    
    System.out.println();

    Borrowable.LibraryRules();

  }


}
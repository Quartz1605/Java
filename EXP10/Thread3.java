class TicketBooking{

  int count;
  
  public TicketBooking(int count){
    this.count = count;
  }

  public synchronized void bookTicket(){
    
    System.out.println("Ticket booked successfully");
    count -= 1;
    System.out.println("Remaining seats are " + count);
  }
}

class Customer implements Runnable{

  TicketBooking book;

  public Customer(TicketBooking book){
    this.book = book;
  }
  
  public void run(){
    book.bookTicket();
  }
}



public class Thread3{

  public static void main(String[] args){

    TicketBooking book = new TicketBooking(5);
    
    Thread t1 = new Thread(new Customer(book));
    Thread t2 = new Thread(new Customer(book));
    Thread t3 = new Thread(new Customer(book));
    Thread t4 = new Thread(new Customer(book));

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    


  }
}
import java.util.Scanner;

class Print{

  public void prime(int num){

    int primeCount = 0;

    for(int i=2;i<=num;i++){
      
      int count=0;

      for(int j=2;j<i;j++){
        
        
        if(i%j == 0){
          
          
          count++;
        }

      }

      if(count == 0){
          System.out.print(i + " ");
          primeCount++;
      }

    }
    
    System.out.println();
    System.out.println("The num of prime numbers is " + primeCount);
  }

  public void armstrong(int num){

    //10 se isiliye start kar raha hu cus before 10 sab logic se armstrong honge.
    for(int i=10;i<=num;i++){

      int count = 0;
      int sum=0;
      
      int k = i;
      while(k!=0){
        count++;
        k = k/10;
      }
      

      int temp = i;
      
      
      
      while(temp!=0){
        
        int j = temp%10;
        
        temp = temp/10;
        sum += Math.pow(j,count);
        
        
        
      }

      if(sum == i){
        System.out.print(i + " ");
      }

    }
  }


}

class PrimeArmstrong{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int num;

    System.out.println("Enter a num ..");
    num = sc.nextInt();

    Print print = new Print();
    print.prime(num);
    print.armstrong(num);

    


  }
}
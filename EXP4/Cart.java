import java.util.Scanner;

public class Cart{

  public static void main(String args[]){

    int cart[][][] = new int[10][10][10];

    Scanner sc = new Scanner(System.in);

    for(int i=0;i<3;i++){
      
      System.out.println("Enter items for Cart " + (i+1));
      
      for(int j=0;j<2;j++){
        if(j==0){
          System.out.println("Enter perishable product details");
          
          for(int k=0;k<2;k++){
            
            if(k==0){
            System.out.println("Enter quantity");
            cart[i][j][k] = sc.nextInt();
            }
            else{
              System.out.println("Enter amount");
              cart[i][j][k] = sc.nextInt();
            }

          }
        }

        if(j==1){
          System.out.println("Enter Non-perishable product details");
          
          for(int k=0;k<2;k++){
            
            if(k==0){
            System.out.println("Enter quantity");
            cart[i][j][k] = sc.nextInt();
            }
            else{
              System.out.println("Enter amount");
              cart[i][j][k] = sc.nextInt();
            }

          }
        }
        
        
      }
    }

    int finalSum=0;
    
    for(int i=0;i<3;i++){
      int sum=0;
      
      for(int j=0;j<2;j++){
        
        int mult=0;
        for(int k=0;k<2;k++){
          
          
          
          if(k==0){
          mult = cart[i][j][k];
          }
          
          
          if(k==1){
            
            sum += cart[i][j][k]*mult;
          }

        }
      }
      finalSum += sum;
    }
    
    System.out.println("Final cart price is " + finalSum);

    int totalPerishable = 0;
    
    for(int i=0;i<3;i++){
      for(int j=0;j<1;j++){
        for(int k=0;k<1;k++){
          totalPerishable += cart[i][j][k];
        }
      }
    }

    System.out.println("Total perishable items sold is " + totalPerishable);



  }

}
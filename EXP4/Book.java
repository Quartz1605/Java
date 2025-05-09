import java.util.Scanner;



public class Book{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of books.");
    int num = sc.nextInt();

    System.out.println("Enter number of readers.");
    int readers = sc.nextInt();

    int reviews[][] = new int[10][10];

    for(int i=0;i<num;i++){
      System.out.println("Book " + (i+1));
      
      for(int j=0;j<readers;j++){
        System.out.println("Enter ratings for Reader " + (j+1));
        reviews[i][j] = sc.nextInt();
      }
      
    }

    double avg[] = new double[num];
    
    
    for(int m=0;m<num;m++){
      int sum=0;
      
      for(int k=0;k<readers;k++){
        sum += reviews[m][k];
        double avgerage = sum/readers;
        avg[m] = avgerage;
      }

      System.out.println("Sum is " + sum);
    }

    for(int p=0;p<num;p++){
      System.out.println(avg[p]);
    }

    int maxIndex = 0;

    for(int i=0;i<avg.length;i++){
      
      if(avg[maxIndex] < avg[i]){

        maxIndex = i;

      }
    }

    System.out.println("The most popular book is Book " + (maxIndex+1) );







  }
}
import java.util.Scanner;

class MarksException{


  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Students marks System !");

    System.out.println("Enter number of Subjects !");
    int subjects = sc.nextInt();

    try{
      
      if(subjects <= 0){
        throw new ArithmeticException("Subjects can't be Zero or Less");
      }
      
      int marks[] = new int[subjects];

      try{
      for(int i=0;i<marks.length;i++){
        int mark=0;
        System.out.println("Enter marks for Subject " + (i+1));
        mark = sc.nextInt();
        if(mark < 0 || mark > 100 ){
          throw new NullPointerException("Marks can't be negative or more than 100");
        }
        else{
          marks[i] = mark;
        }
      }

      try{
        int sum=0;

        for(int j=0;j<marks.length;j++){
          sum += marks[j];
        }

        int finalMarks = sum*100;
        double percentage = finalMarks/(subjects*100);
        System.out.println("Your percentage are " + percentage);
        

      }catch(ArrayIndexOutOfBoundsException e){
        e.printStackTrace();
      }


    }catch(NullPointerException e){
      System.out.println("Null Pointer Exception occured. " + e.getMessage());
    }

    }catch (ArithmeticException e){
      System.out.println(e.getMessage());
    }
  }
}
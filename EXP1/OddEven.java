class PrintNum{

  public void printOdd(){
    
    for(int i=1;i<=100;i++){
      
      if(i%2 != 0){
        System.out.print(i + " ");
      }
      else{
        continue;
      }
      
    }
    System.out.println();
  }

  public void printEven(){
    
    for(int i=1;i<=100;i++){
      
      if(i%2 == 0){
        System.out.print(i + " ");
      }
      else{
        continue;
      }
    
    }
  }


}






public class OddEven{

  public static void main(String[] args){

    PrintNum print = new PrintNum();
    print.printOdd();
    print.printEven();

  }


}
class MathFunction{

  public int sqrt(int x){
    return x;
  }

}

class SquareRoot{

  int num;

  public SquareRoot(int num){
    this.num = num;
  }

  public int sqrt(){

    if(num == 1 || num == 0){
      return num;
    }

    int start=1, end = num, ans = 0;

    while(start <= end){
      int mid = start + (end-start)/2;

      if(mid <= num/mid){
        ans = mid;
        start = mid + 1;
      }
      else{
        end = mid - 1;
      }
    
    }

    return ans;

  }
}


public class Root{

  public static void main(String[] args){

    SquareRoot num = new SquareRoot(100);

    int root = num.sqrt();

    System.out.println("Square root is " + root);
  }
}
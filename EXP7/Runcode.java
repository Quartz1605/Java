import java.util.Arrays;

class SortArray{

  int arr[];

  public SortArray(int array[]){

    //arr = new int[array.length];
    arr = array;
  }

  public void sort(){

    int temp;
    boolean swapped;

    for(int i=0;i<arr.length-1;i++){
      swapped = false;

      for(int j=0;j<arr.length-i-1;j++){
        if(arr[j] > arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped = true;
        }
      }

      if(swapped == false){
        break;
      }

    }

    System.out.println("Sorted array is : ");
    for(int k=0;k<arr.length;k++){
      System.out.print(arr[k] + " ");
    }

  }

}








class Runcode{



  public static void main(String[] args){

    int num = (int) (Math.random()*100);
    System.out.println(num);

    
   
  }

}

class Bubblesort{

  public static void main(String[] args){

    int arr[] = {2,6,4,7,3,1};
    int temp;
    boolean swapped;


    for(int i=0;i<arr.length-1;i++){
      swapped = false;

      for(int j=0;j<arr.length-i-1;j++){
        if(arr[j] > arr[j+1]){
          temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
          swapped = true;
        }
      }

      if(swapped = false){
        break;
      }



    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }


  }



}
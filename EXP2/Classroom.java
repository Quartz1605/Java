
class Details{

  String classname;
  String Studnames[]; // Just to define it.
  
  // Parameters mein bhi array pass karo.
  public Details(String classname,String names[]){

    
    // You equate like this.
    this.classname = classname;
    Studnames = names;
    

  }

  public void display(){
    System.out.println("Classname is " + classname);

    System.out.println("Name of students are ");
    
    for(String j:Studnames){
      System.out.println(j);
    }
  }

}




public class Classroom{


  public static void main(String[] args){

    String students[] = {"Raj","Pranav","Ahmed","Daksh"};

    Details detail =  new Details("A",students);

    detail.display();

  }
}
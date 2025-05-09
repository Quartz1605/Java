class Lineform{

  

  public Lineform(double slope,double intercept){
    System.out.println("y" + " = " + slope + "x" + " + " + intercept);
  }

  public Lineform(double x1,double y1,double slope){
    
    System.out.println("y" + " - " + y1 + " = " + slope + "(" + "x" + " - " + x1 + ")" );
  }

  public Lineform(double x1,double x2,double y1,double y2){

    double m = (y2 - y1)/(x2-x1);
    //Baaki ka pura karlo

  }

}


public class Line{

  public static void main(String[] args){

    Lineform line = new Lineform(3.0,4.0,2.0);
    

  }
}
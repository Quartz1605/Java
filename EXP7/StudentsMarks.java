abstract class Marks{

  abstract public double getPercentage();
}

class A extends Marks{

  int marks1,marks2,marks3;

  public A(int marks1,int marks2,int marks3){
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;

    
    
  }

  @Override
  public double getPercentage(){
    double result = (marks1 + marks2 + marks3)*100;
    

    return result/300;
  }
  

}

class B extends Marks{

  int m1,m2,m3,m4;

  public B(int m1,int m2,int m3,int m4){
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    this.m4 = m4;
  }

  @Override
  public double getPercentage(){
    double r = (m1+m2+m3+m4)*100;

    return r/400;
  }
  

}





public class StudentsMarks{



  public static void main(String[] args){

    A stud1 = new A(94,77,84);
    System.out.println("Your perentage is " + stud1.getPercentage());

    B stud2 = new B(94,72,81,97);
    System.out.println("Your perentage is " + stud2.getPercentage());



  }
}
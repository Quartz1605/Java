class Student{
  int assignments;
  int exams;
  int projects;

  public Student(int assignments,int exams,int projects){
    this.assignments = assignments;
    this.exams = exams;
    this.projects = projects;
  }

  public String calculateGrade(){
    double assg =  assignments*0.3;
    double exam  = exams*0.5;
    double pro = projects*0.2;

    double finalMarks = assg+exam+pro;
    

    if(finalMarks > 89){
      return "AA";
    }
    else if(finalMarks > 78 && finalMarks <= 89){
      return "AB";
    }
    else if(finalMarks > 67 && finalMarks <= 78){
      return "BB";
    }
    else if(finalMarks > 57 && finalMarks <= 67){
      return "BC";
    }
    else if(finalMarks > 45 && finalMarks <= 57){
      return "CC";
    }
    else if(finalMarks > 35 && finalMarks <= 45){
      return "CD";
    }
    else{
      return "FF";
    }


  }



}





public class Grade{


  public static void main(String[] args){

    Student stud1 = new Student(76,62,90);
    Student stud2 = new Student(54,92,81);
    Student stud3 = new Student(55,83,70);
    Student stud4 = new Student(22,27,69);
    
    
    String grades[] = {stud1.calculateGrade(),stud2.calculateGrade(),stud3.calculateGrade(),stud4.calculateGrade()};

    int count = 0;

    for(String g:grades){

      
      if(g == "CD" || g == "FF"){
        count++;
      }

    }
    System.out.println("Number of failed students are " + count);

    for(int i=0;i<grades.length;i++){
      
      if(grades[i] == "AA" || grades[i] == "AB"){
        System.out.println("Student " + (i+1) + " succeeded with " + grades[i]);
      }

    }
    

  }
}
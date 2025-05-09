import java.util.Scanner;

abstract class Course{

  abstract public void studentDetails();

}

class CE extends Course{

  String name,year;
  int uid;

  public CE(String name, int uid, String year){
    this.name = name;
    this.year = year;
    this.uid = uid;

    System.out.println("Object created successfully");
  }
  
  public void studentDetails(){
    System.out.println("Name is " + name + ", UID is " + uid + ", year is " + year);

  }


}

class CSE extends Course{

  String name,year;
  int uid;

  public CSE(String name, int uid, String year){
    this.name = name;
    this.year = year;
    this.uid = uid;

    System.out.println("Objects created successfully");
  }
  
  
  
  public void studentDetails(){
    
    System.out.println("Name is " + name + ", UID is " + uid + ", year is " + year);
  }


}



class Students{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Choose a Course (1.CE, 2.CSE)");
    int num = sc.nextInt();

    int n,uid;
    String name;
    String year;
    
    
    switch(num){

        case 1: 
          System.out.println("Enter number of students for CE.");
          n = sc.nextInt();

          CE studentsCE[] = new CE[n]; 

          for(int i=0;i<n;i++){
            System.out.println("Enter details for Student " + (i+1));

            System.out.println("Enter Name.");
            name = sc.next();

            System.out.println("Enter UID");
            uid = sc.nextInt();

            System.out.println("Enter Year (FE/SE/TE)");
            year = sc.next();

            studentsCE[i] = new CE(name,uid,year);
          }

           for(int m=0;m<n;m++){
            studentsCE[m].studentDetails();
          }


          int arr[] = new int[3];
          
          for(int k=0;k<n;k++){
            if(studentsCE[k].year == "FE"){
              arr[0] = k;
            }
            
            if(studentsCE[k].year == "SE"){
              arr[1] = k;
            }

            if(studentsCE[k].year == "TE"){
              arr[2] = k;
            }

          }

          for(int m=0;m<3;m++){
            studentsCE[arr[m]].studentDetails();
          }

          

         

          

          break;

        case 2: 
          System.out.println("Enter number of students for CSE.");
          n = sc.nextInt();

          CSE studentsCSE[] = new CSE[n]; 

          for(int i=0;i<n;i++){
            System.out.println("Enter details for Student " + (i+1));

            System.out.println("Enter Name.");
            name = sc.next();

            System.out.println("Enter UID");
            uid = sc.nextInt();

            System.out.println("Enter Year (FE/SE/TE)");
            year = sc.next();

            studentsCSE[i] = new CSE(name,uid,year);
          }

          break;
  
  
  }


  }

}
class Student{    
 int rollno;    
 String name;    
 //Creating a method to insert record  
 void insertRecord(int r, String n){    
  rollno=r;    
  name=n;    
 }    
 //creating a method to display information  
 void displayInformation(){System.out.println(rollno+" "+name);}    
}    
//Creating a Main class to create objects and call methods  
public class ByMethod{    
 public static void main(String args[]){    
  Student s1=new Student();    
  Student s2=new Student();    
  s1.insertRecord(111,"Karan");    
  s2.insertRecord(222,"Aryan");    
  s1.displayInformation();    
  s2.displayInformation();    
 }    
}  
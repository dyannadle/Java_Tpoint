package Java_Object_Class.Classes_and_Objects;

class StudentReference1{    
 int id;    
 String name;    
}    
public class Reference_Variable1{    
 public static void main(String args[]){    
  //Creating objects    
  StudentReference1 s1=new StudentReference1();    
  StudentReference1 s2=new StudentReference1();    
  //Initializing objects    
  s1.id=101;    
  s1.name="Sonoo";    
  s2.id=102;    
  s2.name="Amit";    
  //Printing data    
  System.out.println(s1.id+" "+s1.name);    
  System.out.println(s2.id+" "+s2.name);    
 }    
}    
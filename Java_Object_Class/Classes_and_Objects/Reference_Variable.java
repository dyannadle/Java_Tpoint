package Java_Object_Class.Classes_and_Objects;

class StudentReference{    
 int id;    
 String name;    
}    
public class Reference_Variable {    
 public static void main(String args[]){    
  //Creating instance of StudentReference class  
  StudentReference s1=new StudentReference();    
  //assigning values through reference variable  
  s1.id=101;    
  s1.name="Sonoo";    
  //printing values of s1 object  
  System.out.println(s1.id+" "+s1.name);    
 }    
}    
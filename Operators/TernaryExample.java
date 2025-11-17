public class TernaryExample {
public static void main(String args[]) {    
int a = 10;    
int b = 15;    
int c = 13;  
int max = (a > b) ?  (a > c ? a : c) : (b > c ? b : c);  
System.out.println("The maximum between the three numbers " + a + ", " + b + ", " + c + " " + "is: " + max );    
}  
}      

public class SwitchString {
    public static void main(String[] args) {
 String levelString="Expert";    
    int level=0;    
    //Using String in Switch expression    
    switch(levelString){      
    //Using String Literals in Switch Case    
    case "Beginner": level=1;    
    break;      
    case "Intermediate": level=2;    
    break;      
    case "Expert": level=3;    
    break;      
    default: level=0;    
    break;    
    }      
    System.out.println("Your Level is: "+level);    
}      
}  
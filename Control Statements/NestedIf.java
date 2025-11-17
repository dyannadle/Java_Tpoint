// if(condition 1) {    
// statement 1; //executes when condition 1 is true   
// if(condition 2) {  
// statement 2; //executes when condition 2 is true   
// }  
// else{  
// statement 2; //executes when condition 2 is false   
// }  
// }  

public class NestedIf {
    
public static void main(String args []){
    String address=" andheri east, mumbai, area ,india";
    if (address.endsWith("india")){
if (address.contains("mumbai")){
    System.out.println("your city is mumbai");
}else if (address.contains("pune")){
    System.out.println("your city is pune");    
}else if(address.contains("nagpur")){
    System.out.println("your city is nagpur");  
}else{
    System.out.println(address.split(",")[0]);

}
}else{
    System.out.println("you are not in india");
    }
}

}

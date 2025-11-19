
// if(condition1){  
// //code to be executed if condition1 is true  
// }else if(condition2){  
// //code to be executed if condition2 is true  
// }  
// else if(condition3){  
// //code to be executed if condition3 is true  
// }  
// ...  
// else{  
// //code to be executed if all the conditions are false  
// }  




public class IfElseIfLadderStatement {
    public static void main (String args[]){
        int marks=75;
        if(marks>=90){
            System.out.println("Grade A");
        }else if(marks>=80){
            System.out.println("Grade B");
        }else if(marks>=70){
            System.out.println("Grade C");
        }else if(marks>=60){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }       
    
}

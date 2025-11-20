// witch(expression) {      
// case value1:      
//  //code to be executed;      
//  break;  //optional    
// case value2:      
//  //code to be executed;      
//  break;  //optional    
// ......      
// default:       
//   Code to be executed if all cases are not matched.    
// }


public class SwitchStatement {
    public static void main(String[] args) {
        int number = 20;
        // switch statement to check value of number
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }
}
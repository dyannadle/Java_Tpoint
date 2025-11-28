public class Factorial {    
    public static void main(String[] args) {    
        int number = 5;    
        int factorial = 1;    
        int i = 1;  
        //Start a do-while loop   
        do {    
            // Multiply the current value of 'factorial' by 'i' and store the result back in 'factorial'.    
            factorial *= i; // This is equivalent to factorial = factorial * i;   
            i++;  
        } while( i <= number );   
        // Print the calculated factorial to the console.    
        System.out.println("Factorial of " + number + " is: " + factorial);    
    }    
}    
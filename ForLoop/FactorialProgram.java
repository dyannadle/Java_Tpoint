public static void main(String[] args) {
    int number = 5; // Number to calculate factorial
    int factorial = 1;
    // for loop to calculate factorial
    for (int i = 1; i <= number; i++) {
        factorial *= i; // factorial = factorial * i
    }
    System.out.println("Factorial of " + number + " is: " + factorial);
}
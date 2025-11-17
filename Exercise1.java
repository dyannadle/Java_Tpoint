//Java Program to Find the Minimum Number of Operations Required to Reach N Steps


//Problem Definition
// Suppose the starting point is one, and the endpoint is N. You can perform any of the following operations:

// Current number times 2.
// Add 1 to the current number.

import java.util.*;  
public class Exercise1 {  
    // Method to calculate the minimum number of operations to reach N  
    public static int minOperations(int N) {  
        // Base case  
        if (N == 1) {  
            return 0;  
        }  
        // Queue to perform BFS  
        Queue<int[]> queue = new LinkedList<>();  
        // Set to track visited states  
        Set<Integer> visited = new HashSet<>();  
        // Add the initial state: number 1 with 0 operations  
        queue.add(new int[]{1, 0});  
        visited.add(1);  
        // BFS loop  
        while (!queue.isEmpty()) {  
            // Get the current state  
            int[] current = queue.poll();  
            int number = current[0];  
            int operations = current[1];  
            // Perform the two operations  
            int multiply = number * 2;  
            int add = number + 1;  
            // Check if either operation reaches N  
            if (multiply == N || add == N) {  
                return operations + 1;  
            }  
            // Add new states to the queue if not already visited  
            if (!visited.contains(multiply) && multiply <= N) {  
                queue.add(new int[]{multiply, operations + 1});  
                visited.add(multiply);  
            }  
            if (!visited.contains(add) && add <= N) {  
                queue.add(new int[]{add, operations + 1});  
                visited.add(add);  
            }  
        }  
        // Should never reach here if the problem guarantees a solution  
        return -1;  
    }  
    public static void main(String[] args) {  
        // Example usage  
        int N = 10;  
        System.out.println("Minimum operations to reach " + N + ": " + minOperations(N));  
    }  
}     
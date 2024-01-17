// Find the Sum of First N Natural Numbers in Java
// Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. 

import java.util.Scanner;

public class sum_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum=0;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
            sum = i+sum;
        }    
        System.out.println("Sum is: " + sum);
        
    }
}

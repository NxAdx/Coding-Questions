// Find the Fibonacci Series up to Nth Term in Java
// For a Given integer input number as the Nth value, the objective is to Find the Fibonacci Series up to the Nth Term. 
// Therefore, we’ll write a program to Find the Fibonacci Series up to Nth Term in Java Language.

// Example
// Input : 4
// Output : 0 1 1 2


import java.util.Scanner;

public class Fibonacci_series_17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        int n1=0,n2=1,neww=0;
        System.out.print(n1 + " " + n2 + " ");
        for(int i=1;i<n-1;i++){
            neww = n1+n2;
            System.out.print(neww +" ");
            n1 = n2;
            n2 = neww;
        }
    }
}
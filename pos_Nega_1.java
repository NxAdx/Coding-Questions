// Check if a Given Number is Positive or Negative in Java
// Given an integer num input the objective is to write a code to Check if a Given Number is Positive or Negative in Java Language.

// Example
// Input : num = 11
// Output : Positive

import java.util.Scanner;

class pos_Nega_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Enter the number: ");
        N = sc.nextInt();
        String Value = N > 0 ? "Positive" : N == 0 ? "zero" : "Negative";
        System.out.println("Number is " + Value);

    }

}
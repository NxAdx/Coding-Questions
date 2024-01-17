// Greatest of two numbers

// Given two integer inputs N1 and N2, the objective is to write a code to Find the Greatest of the Two Numbers in Java. 
// In order to do so we’ll compare the numbers using if-else statements.
 
// Example
// Input : num1 = 12 and num2 = 3
// Output : 12

import java.util.Scanner;

public class great_two_6 {
    public static void main(String[] args) {
        int Num1,Num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any two numbers: ");
        Num1 = sc.nextInt();
        Num2 = sc.nextInt();
        if (Num1>Num2 && Num2!= Num1){
            System.out.println(Num1 + "     is greater");
        }
        else{
            System.out.println(Num2 + " is greater");
        }

    }
}

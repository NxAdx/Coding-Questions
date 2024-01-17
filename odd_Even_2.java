// Given an integer input num, the objective is to write a code to Check Whether a Number is Even or Odd in Java Language. To do so we check if the number is divisible by 2 or not, it’s Even if it’s divisible otherwise Odd.

// Check Whether a number is Even or Odd using Java 
// Example 
// Input : num = 11
// Output : Odd

import java.util.Scanner;

public class odd_Even {
    Scanner sc = new Scanner(System.in);
    int num;
    num=sc.nextInt();
    System.out.println("Enter a number");
    if(num!=0){
        System.out.println("Number is even");
    }
    else{
        System.out.println("Number is odd");
    }
}

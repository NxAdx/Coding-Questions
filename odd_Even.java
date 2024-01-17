// Check Whether a Number is Even or Odd in Java
// Given an integer input the objective is to write a Java code to Check Whether a Number is Even or Odd. 
// To do so the main idea is to divide the number by 2 and check if it’s divisible or not. 
// It’s an Even number is it’s perfectly divisible by 2 or an Odd number otherwise.

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

// Check Whether or Not the Number is a Palindrome in Java
// Given an integer input as the number, the objective is to check whether or not the given number is a palindrome.
//  To do so, we’ll first reverse the string input using loops and recursion and check if it matches the original number.

// Example
// Input : 121
// Output : Palindrome

import java.util.Scanner;

public class palindrome_no_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev=0,rem=0;
        while(num!=0){
            rem = num%10;
            rev = (rev*10) + rem;
            num/=10;
        }
        if(rev==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Plaindrome");
        }
    }
}

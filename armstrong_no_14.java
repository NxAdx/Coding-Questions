
// Check whether or Not the Number is an Armstrong Number in Java
// Given an integer input the objective is to check whether or not the number is an Armstrong number.
// To do so we check if the number satisfies the below mentioned conditions and if it does, the it’s an Armstrong.
// The task is to write a code to Check Whether or Not the Number is an Armstrong Number in Java Language.

// Example
// Input : 371
// Output : It's an Armstrong Number.
import java.util.Scanner;

public class armstrong_no_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int temp=num,rem=0,arm=0;
        while(num!=0){
            rem = num%10;
            arm = (rem*rem*rem) + arm;
            num/=10;
        }
        if(arm==temp){
            System.out.println("It's an Armstrong Number.");
        }
        else{
            System.out.println("It's not an Armstrong Number.");
        }
        
    }
}

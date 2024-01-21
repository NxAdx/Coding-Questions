// Find the Prime Numbers in a Given Interval in Java
// Given an integer input the objective is to check whether or not there are any Prime Numbers in the given interval or range. Therefore, we write a code to Find the Prime Numbers in a Given Interval in Java Language.

// Example
// Input : 2 10
// Output : 2 3 5 7

import java.util.Scanner;

public class print_prime_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range from _ to _ : ");
        int in1,in2,n;
        in1 = sc.nextInt();
        in2 = sc.nextInt();
        n=in1;
        while(in1<=in2){
            if(n%in1!=0){
                System.out.println(n);
                break;
            }
            in1++;

        }
   } 
}

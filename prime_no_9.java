// Check Whether a Given Number is Prime or Not in Java
// Given an integer input greater than 0. The objective is to Check Whether or Not the Number is a Prime.
//  To do so we’ll write a code to Check Whether a Given Number is Prime or Not in Java that checks for the factors of the Number besides 1 and the number itself.

// Example
// Input : 23
// Output : Prime

import java.util.*;

public class prime_no_9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
            }
        }
        if (flag==0) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }
    }
}
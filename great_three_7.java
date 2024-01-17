// Find the Greatest of the Three Numbers in Java
// Given three integers num1, num2 and num3 as inputs. The objective is to write a code to Find the Greatest of the Three Numbers in Java Language. To do so we’ll check the numbers with each other and print the largest of them all.
 
// Example
// Input : num1 = 12 num2 = 9 num3 = 14
// Output : 14

import java.util.Scanner;


public class great_three_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1,Num2,Num3;
        System.out.print("Enter the any three numbers: ");
        Num1 = sc.nextInt();
        Num2 = sc.nextInt();
        Num3 = sc.nextInt();
        if(Num1> Num2 && Num1>Num3){
            System.out.println(Num1 + " is greater");
        }
        else if (Num2> Num3){
            System.out.println(Num2 + " is greater");
        }
        else{
            System.out.println(Num2 + " is greater");
        }
    }
}

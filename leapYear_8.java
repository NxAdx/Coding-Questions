// Check Whether or Not the Year is a Leap Year in Java
// We will write Leap Year Program in Java. Given an integer input “year” the objective is to check if the given year is a leap year or not using the conditions for a leap year. Therefore, keeping them in mind we write a code to Check Whether or Not the Year is a Leap Year in Java Language.

// Example
// Input : 2024
// Output: Leap Year




import java.util.Scanner;

public class leapYear_8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter year = ");
       int year = sc.nextInt(); 
       if (year%4==0 && year%100!=0 || year%400==0){
         System.out.println("Leap year");
       }
       else{
         System.out.println("Not a leap year");
       }
      //  if(year%4==0){
      //   if(year%100==0){
      //    if(year%400==0){
      //       System.out.println(year + " is a leap year");
      //    }
      //    else{
      //       System.out.println(year + " is not a leap year");
      //    }
      //   }
      //   else{
      //       System.out.println(year + " is not a leap year");
      //    }
      //  }
      //  else{
      //     System.out.println(year + " is a leap year");
      //  }
    }
}

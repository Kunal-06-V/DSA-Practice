import java.util.*;

// public class ifElse {
//     public static void main(String args[]){
//         int a = 4;
//         int b = 3;
//         if(a >= b){
//             System.out.println("A");
//         }else{
//             System.out.println("B");
//         }
//     }
// }

// public class ifElse {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(num % 2 == 0){
//             System.out.println("Num is Even");
//         }else{
//             System.out.println("Num is Odd");
//         }
//     }
// }


// public class ifElse {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax = 0;
//         if(income <= 500000){
//         }else if(income > 500000 && income < 1000000 ){
//             tax = (int)(income * (0.2));
//         }else {
//             tax = (int)(income * (0.3));
//         }
//             System.out.println("tax is : " + tax);
//     }
// }

// public class ifElse {
//     public static void main (String args[]){
//         int a = 1;
//         int b = 3;
//         int c = 6;

//       String type = (a >= b && a >= c)? "A is largest":((b >= c)?"B is Largest":"C is largest");
//       System.out.println(type);
//     }
// }

// public class ifElse {
//     public static void main (String args[]){
//         int marks = 4;

//         String type = (marks >= 33)?"pass":"fail";
//         System.out.println(type);
//     }
// }

// Practice Set : START 

// Q1 : Write a Java program to get a number from 
// the user and print whether it is positive or negative.

// public class ifElse {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         if(num > 0){
//             System.out.println("Num is Positive");
//         }else if(num < 0){
//             System.out.println("Num is negative");
//         }else{
//             System.out.println("Num is Zero");
//         }
//     }
// }

// Q2 :Finish the following code so that it prints You have a fever 
// if your temperature is above 100 and otherwise
//  prints You don't have a fever.

// public class ifElse{
//     public static void main (String args[]){
//         double temp = 103.5;

//         if(temp > 100){
//             System.out.println("You have fever");
//         }else {
//             System.out.println("You not have fever");
//         }
//     }
// }

// Q3 : Write a Java program that takes a year from the user and print 
// whether that year is a leap year or not.

public class ifElse {
    public static void main(String args[]){
         Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 &&( year % 100 != 0 || year % 400 == 0) ){
             System.out.println("The year "+year+" is leap year");
        }else{
             System.out.println("The year "+year+" is not leap year");
        }
    }
}
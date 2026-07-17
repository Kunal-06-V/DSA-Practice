import java.util.*;
public class funJavaBasics {
    //     public static void printHelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");


    //     }
    // public static void main(String args[]){
    //      printHelloWorld();
    //      printHelloWorld();

    // }

    //        public static int calculateSum(int a , int b){
         
    //      int sum = a + b;
    //     return sum;

    //     }
    // public static void main(String args[]){
    //      Scanner sc = new Scanner(System.in);
    //      int a = sc.nextInt();
    //      int b = sc.nextInt();

    //   int sum =   calculateSum(a , b);
    //      System.out.println("Sum is : " + sum);

    // }

    // public static void swap(int a , int b){
           
    //     int temp = a;
    //     a = b;
    //     b = temp;
      
    // }

    // public static void main(String args[]){
    //     // Swap 
    //     int a = 5;
    //     int b= 10;
    //   swap(a , b);
    //   System.out.println(a);
    //     System.out.println(b);
    // }

//    public static int multiplys(int a, int b){
//     int product = a *b ;
//     return product;
//    }

//     public static void main(String args[]){
//           int a = 5;
//         int b= 10;
//       int total =   multiplys(a ,b);
//       System.out.println(total);
//     }


// Function Overloading 

//  // func to cal sum of 2 nums 
//  public static int sum(int a, int b){
//     return a + b;
//  }

//  // func to calc sum of 3 nums 
//  public  static int sum(int a , int b , int c){
//     return a + b + c;
//  }

//  public static  void main(String args[]){
//      System.out.println(sum(3 , 5));
//      System.out.println(sum(3 , 5, 4));

//  }


 // //  function overloading using datatypes 

//   public static int sum(int a, int b){
//     return a + b;
//  }

//  // func to calc sum of 2 float nums 
//  public  static float sum(float a , float b ){
//     return a + b ;
//  }

//  public static  void main(String args[]){
//      System.out.println(sum(3 , 5));
//      System.out.println(sum(3.5f , 4.5f));

//  }

// public static boolean isPrime(int n){

//      for(int i = 2 ; i <= n -1 ;i++){
//         if( n % i == 0){
//            return false;
          
//         }
//      }
//      return  true;
// }

// public static void main(String args[]){
//      Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Number :");
//     int n = sc.nextInt();
//     System.out.println(isPrime(n));
//     // System.out.println(isPrime(5));
// }

//   // Convert From Binary To Decimal 

// public static void binToDec(int binNum) {
//     int  myNum = binNum;
//     int pow = 0;
//     int decNum = 0;
//     while(binNum > 0 ){
//         int lastDigit = binNum % 10;
//         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//         pow++;
//         binNum = binNum / 10;
//     }
//     System.out.println("Decimal of "+ myNum + " = " + decNum );
// }

// public static void main(String args[]){
//    binToDec(110111101);
// }

//   // Convert From Decimal  To Binary 


// public static void decToBin(int decNum){
//     int myNum = decNum;
//     int binNum = 0;
//     int pow = 0;

//     while(decNum > 0){
//      int rem = decNum % 2;
//      binNum = binNum + (rem * (int)Math.pow(10 , pow));

//      pow++;
//      decNum  = decNum/2;
//     }
//     System.out.println("Binary  of " + myNum+ " = "+ binNum);
// }

// public static void main(String args[]){
//    decToBin(7);
// }


public static void main(String args[]){
    
}
}
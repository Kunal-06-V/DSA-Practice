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

  public static int sum(int a, int b){
    return a + b;
 }

 // func to calc sum of 3 nums 
 public  static float sum(float a , float b ){
    return a + b ;
 }

 public static  void main(String args[]){
     System.out.println(sum(3 , 5));
     System.out.println(sum(3.5f , 4.5f));

 }

}
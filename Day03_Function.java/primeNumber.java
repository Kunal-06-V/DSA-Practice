import java.util.*;

public class primeNumber {

//    public static boolean isPrime(int n){    
//     if(n==2) {
//          return true;
//     }

//     for(int i =2 ; i <= n -1;i++){
//         if(n %  i ==0){   // Completely dividing 
//           //    isPrime = false;
//             //  break;  // can use it but driectly return
//             return false;
//         }
//     }
//     return ture;
//    } 

//     public static void main(String args[]){
//           System.out.println(isPrime(13));
//     }


 // Optimized code 
     public static  boolean isPrime(int n){
      if(n ==2){
          return true;
      }
          for(int i = 2;i<= Math.sqrt(n);i++){
            if(n % i== 0){
                return false;
            }
          }
          return true;
     }
     public static void main(String args[]){
        System.out.println(isPrime(13));
     }
}
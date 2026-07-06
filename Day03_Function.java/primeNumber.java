import java.util.*;

public class primeNumber {

   public static boolean isPrime(int n){
    boolean isPrime =true;
    for(int i =2 ; i <= n -1;i++){
        if(n %  i ==0){   // Completely dividing 
             isPrime = false;
            //  break;  // can use it but driectly return
            // return isPrime;
        }
    }
    return isPrime;
   } 

    public static void main(String args[]){
          System.out.println(isPrime(13));
    }
}
import java.util.*;

public class palindromeNum {
    
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);

    //    System.out.println("Enter the Number : ");
    //    int num = sc.nextInt();

    //  if(isPalindrome(num)){
    //     System.out.println("The number is Palindrome");
    //  }else{
    //     System.out.println("The number is Not Palindrome");
    //  }
    // }
    // public static boolean isPalindrome(int num){
    //     int reverse = 0;
    //     int palindrome = num;

    //     while(palindrome > 0){
    //         int lastDigit = palindrome % 10;
    //         reverse = reverse * 10 + lastDigit;
    //         palindrome = palindrome / 10;
    //     }
        
    //     if(num == reverse){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }



//    ? practice set 2 
   public static boolean isPalindrome(int num){
    int reverse = 0;
    int palidrome = num;

    while(palidrome > 0){
        int lastDigit = palidrome % 10;
        reverse = reverse * 10 + lastDigit;
        palidrome /= 10;
    }
    if(reverse == num){
        return true;
    }else{
        return false;
    }
   }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("Number is palidrome");
        }else{
            System.out.println("Number is not palidrome");
        }
    }
}
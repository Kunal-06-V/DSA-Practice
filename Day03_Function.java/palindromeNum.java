import java.util.*;

public class palindromeNum {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the Number : ");
       int num = sc.nextInt();

     if(isPalindrome(num)){
        System.out.println("The number is Palindrome");
     }else{
        System.out.println("The number is Not Palindrome");
     }
    }
    public static boolean isPalindrome(int num){
        int reverse = 0;
        int palindrome = num;

        while(palindrome > 0){
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }
        
        if(num == reverse){
            return true;
        }else{
            return false;
        }
    }
}
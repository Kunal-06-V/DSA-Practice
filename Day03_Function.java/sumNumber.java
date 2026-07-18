import java.util.*;

public class sumNumber {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the Number : ");
       int num = sc.nextInt();
      
       System.out.println("Sum is : " + sumNum(num));

    
    }
    public static int sumNum(int num){
        int sum = 0;
     
        while(num != 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }

        return sum;
    }
}
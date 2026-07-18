import java.util.*;

public class isEvenNum {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the Integer : ");
       int num = sc.nextInt();

     if(isEven(num)){
        System.out.println("The number is Even");
     }else{
        System.out.println("The number is Odd");
     }
    }
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
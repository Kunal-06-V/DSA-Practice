import java.util.*;

public class averageOfThreeNum {
    public static double averageThreeNum(double num1, double num2, double num3){
       
      

       return  (num1 + num2 + num3 ) / 3;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.println(averageThreeNum(num1,num2,num3));
    }
}
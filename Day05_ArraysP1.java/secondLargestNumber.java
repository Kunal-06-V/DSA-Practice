import java.util.*;

public class secondLargestNumber {  // TODO: time O(n) and Space : O(1);
    public static int secLargestNums(int numbers[]){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE; 

        for(int i = 0; i < numbers.length;i++){
            if(max <  numbers[i]){
                secMax = max;
                max = numbers[i];
            }else if(max != numbers[i] && secMax < numbers[i]){
                secMax = numbers[i];
            }
          
        }
        return secMax;
        // System.out.println( "The SecondLargest number : "+secMax);
        // return max; //? Use it both second largest and largest need 
    };
    public static void main(String args[]){
        // int numbers[] ={10, 5, 8, 20, 15}; //* o/p = 15
        // int numbers[] ={-10, -5, -20}; //* o/p = -10
        // int numbers[] ={10, 10, 8, 6}; // * o/p = 8
        int numbers[] ={5, 5, 5}; //*
         
        System.out.println(secLargestNums(numbers));
    }
}

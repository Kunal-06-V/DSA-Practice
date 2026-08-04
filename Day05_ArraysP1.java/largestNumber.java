import java.util.*;

public class largestNumber {
    public static int getLargest(int numbers[]){
        int max =  Integer.MIN_VALUE; // -infinity;
          for(int i = 0;i<= numbers.length-1;i++){
              if(numbers[i] > max){
                max = numbers[i];
              }
          }
          return max;
    }
    public static void main(String args[]){
        int numbers[] = {1, 2, 3, 6, 4, 5};

        System.out.println("Largest value is: "+getLargest(numbers));
    }
    
}
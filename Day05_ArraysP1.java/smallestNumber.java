import java.util.*;

public class smallestNumber {
    public static int getSmallest(int numbers[]){
        int min =  Integer.MAX_VALUE; // infinity;
          for(int i = 0;i<= numbers.length-1;i++){
              if(numbers[i] <  min){
                min = numbers[i];
              }
          }
          return min;
    }
    public static void main(String args[]){
        int numbers[] = {1, 2, 3, 6, 4, 5};

        System.out.println("Smallest value is: "+getSmallest(numbers));
    }
    
}
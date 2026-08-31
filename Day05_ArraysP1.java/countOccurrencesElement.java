import java.util.*;

public class countOccurrencesElement{
    // public static int countOccurrences(int numbers[], int key){
    // int count = 0;
    //     for(int i = 0; i< numbers.length;i++){
    //         if(numbers[i] == key){
    //              count++;
    //         }
    //     }
    //     return count;
    // }

    public static int countOccurrences(int numbers[], int key){
        int count = 0;
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i] == key){
                count++;
            }
        }
        return count;
    }


   public static void main(String args[]){
    int numbers[] = {2, 3, 4, 5, 2, 7, 5, 2, 0, 2};
    int key = 2;
    System.out.println(countOccurrences(numbers,key));
   }
}

//? O(n) => Time.
//? O(1) => Space.
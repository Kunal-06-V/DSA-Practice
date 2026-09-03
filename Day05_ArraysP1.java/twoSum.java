import java.util.*;

public class twoSum{
    public static int [] twoSums(int numbers[] , int target){
        for(int i = 0; i < numbers.length;i++){
            for(int j = i +1; j <numbers.length;j++){
                if(numbers[i]+numbers[j] == target){
                    return new int[]{i ,j};
                }
            }
        }
        return new int[]{};
       
    }
    public static void main(String args[]){
        int  numbers[] = {-3, 4, 3, 90};
        int target = 0;

        int answer [] = twoSums(numbers , target);

        System.out.println(answer[0]+ " "+ answer[1]);
    }
}
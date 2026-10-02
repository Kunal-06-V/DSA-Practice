import java.util.*;

// public class subArray{
    // public static void subArr(int numbers[]){
    //     for(int i = 0; i< numbers.length;i++){
    //         int start = i;
    //         for(int j = i; j< numbers.length;j++){
    //             int last = j;
    //             for(int k = start; k<=last;k++){
    //                 System.out.print(numbers[k]+" ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }
    // ! Revision set 1 
    
    //   public static void subArr(int numbers[]){
    //     int ts = 0;
    //     for(int i = 0; i< numbers.length;i++){
    //         int start = i;
    //         for(int j = i; j < numbers.length;j++){
    //            int end = j;
    //            for(int k = start; k <= end;k++){
    //               System.out.print(numbers[k]+" ");
    //            }
    //            ts++;
    //            System.out.println();
    //         }
    //            System.out.println();
    //     }
    //     System.out.println("Total SubArrays: "+ts);
    // }



    // ! Revision set 3
public class subArray{
    public static void subArr(int numbers[]){
        int totalSubArr = 0;
        for(int i = 0;i < numbers.length;i++){
            int first = i;
            for(int j = i; j < numbers.length;j++){
                int last = j;
                for(int k = first; k <= last; k++){
                    System.out.print(numbers[k]+" ");
                }
                totalSubArr++;
                System.out.println();
            }
                System.out.println();
        }
        System.out.println("Total SubArray :"+totalSubArr);
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
             subArr(numbers);
    }
}
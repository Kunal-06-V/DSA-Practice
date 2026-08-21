import java.util.*;

public class maxSubArray{
    //? Burte Force 

    // public static void maxSubArraySum(int numbers[]){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int i = 0; i<numbers.length;i++){
    //         int start = i;
    //         for(int j = i; j <numbers.length;j++){
    //             int end = j;
    //             currSum = 0;
    //             for(int k = start; k<=end;k++){ //? print 
    //            //    ?subArray sum 
    //                 currSum += numbers[k];
    //             }  
    //              System.out.println(currSum);
    //                 if(maxSum < currSum){
    //                     maxSum = currSum;
    //               }
    //         }
    //     }
    //     System.out.println("total MaxSubArraySum is: "+maxSum);
    // }
    // public static void main(String args[]){
    //     int numbers[]={1, -2, 6, -1, 3};
    //       maxSubArraySum(numbers);
    // }

    // ? MAIN Code 
    // TODO : to create a prefix Array we need prefix[i-1]+arr[i].
    //* prefix[end] - prefix[start-1].

     public static void maxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // caluculate prefix array 
        for(int i = 1; i < prefix.length;i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }
        for(int i = 0; i<numbers.length;i++){
            int start = i;
            for(int j = i; j <numbers.length;j++){
                int end = j;
                currSum = start == 0? prefix[end] : prefix[end] - prefix[start-1];//? start-1 is of index  if start is index 3 it will become index 2 .
 
              
                    if(maxSum < currSum){
                        maxSum = currSum;
                  }
            }
        }
        System.out.println("total MaxSubArraySum is: "+maxSum);
    }
    public static void main(String args[]){
        int numbers[]={1, -2, 6, -1, 3};
          maxSubArraySum(numbers);
    }
}
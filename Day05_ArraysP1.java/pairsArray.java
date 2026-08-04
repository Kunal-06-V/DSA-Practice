import java.util.*;

public class pairsArray{

    //  !  if j = i +1

    public static void printPairs(int numbers[]){
        int tp = 0; // for total paris
        for(int i = 0; i < numbers.length;i++){
//            * current Element 
            int curr = numbers[i];
            for(int j = i+1; j < numbers.length;j++){
                 System.out.print("(" + curr + ","+numbers[j]+")");
                 tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are :" + tp);
        // (2,4)(2,6)(2,8)(2,10)
        // (4,6)(4,8)(4,10)
        // (6,8)(6,10)
        // (8,10)  if  i + 1;
    } 

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
         printPairs(numbers);
    } 

    // !  if j = i 

//      public static void printPairs(int numbers[]){
//         for(int i = 0; i < numbers.length;i++){
//             * current Element 
//             int curr = numbers[i];
//             for(int j = i; j < numbers.length;j++){
//                  System.out.print("(" + curr + ","+numbers[j]+")");
//             }
//             System.out.println();
//         }
// ? (2,2)(2,4)(2,6)(2,8)(2,10)
// ?(4,4)(4,6)(4,8)(4,10)
//?(6,6)(6,8)(6,10)
// ? (8,8)(8,10)
// ? (10,10) if j = i then these will give pairs with number itself 
//     } 

    // !  if j = 0 
    

//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10};
//          printPairs(numbers);
//     }

//   public static void printPairs(int numbers[]){
//         for(int i = 0; i < numbers.length;i++){
//             * current Element 
//             int curr = numbers[i];
//             for(int j = 0; j < numbers.length;j++){
//                  System.out.print("(" + curr + ","+numbers[j]+")");
//             }
//             System.out.println();
//         }
//? (2,2)(2,4)(2,6)(2,8)(2,10)
//? (4,2)(4,4)(4,6)(4,8)(4,10)  // Every number pairs with 
// ?(6,2)(6,4)(6,6)(6,8)(6,10)  // every number again if 
//? (8,2)(8,4)(8,6)(8,8)(8,10)  // if it come x ,y then y , x 
// ? (10,2)(10,4)(10,6)(10,8)(10,10) // also pairs 
//     } 

//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10};
//          printPairs(numbers);
//     }
}
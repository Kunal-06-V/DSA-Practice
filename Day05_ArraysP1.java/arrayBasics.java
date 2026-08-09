import java.util.*;

public class arrayBasics {
//     public static void update(int marks[]){
//         for(int i = 0; i<marks.length;i++){
//             marks[i]= marks[i]+ 1;
//         }
//     }
// public static void main(String args[]){
//     int marks[] = {97, 98, 99};
//     update(marks);
//     // print our marks 
//     for(int i = 0; i<marks.length;i++){
//         System.out.print(marks[i] + " ");
//     }
//     System.out.println();
// }

// Linear Search -------------------------*

// public static int linearSearch(int numbers[], int key){
//     for(int i = 0; i <= numbers.length-1;i++){
//         if(numbers[i] == key){
//             return i;
//         }
//     }
//             return -1;
// }
// public static void main(String args[]){
//     int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//     int key = 10;
    
//     int index = linearSearch(numbers,key);
//     if(index == -1){
//         System.out.println("NOT found");
//     }else{
//         System.out.println("Key is at index: "+ index);
//     }
// }

// public static int linearSearch(String menu[], String key){
//     for(int i = 0; i<= menu.length-1;i++){
//         // if(menu[i] == key){
//         //      return i;
//         // }  // it stores the both string object in one String pool so the java think it is same and give is correct 
//         // menu[2] == key ; if we change the variable with new String class it will give not found o/p before change the old code 
//         if (menu[i].equals(key)) {
//     return i;
// }
//     }
//     return -1;
// }
// public static void main (String args[]){
//     String menu[] = {"dosa", "chole bhature", "samosa", "pani puri"};
//     // String key = "samosa";
//     String key = new String("samosa");

//     int index = linearSearch(menu,key);
//     if(index == -1){
//         System.out.println("NOT found");
//     }else{
//         System.out.println("Key is at index: "+ index);
//     }
// }

// Revision Session For Array basics Question 
// Q1 Pairs in Array 

// public static void pairsArray(int numbers[]){
//     for(int i = 0; i<numbers.length;i++){
//         int curr = numbers[i];
//         for(int j = i + 1; j < numbers.length;j++){
//             System.out.print("("+ curr+ ","+ numbers[j]+ ")") ;
//         }
//         System.out.println();
//     }
// }

// public static void main(String args[]){
//   int numbers[]= {2, 4, 6, 8, 10};
//   pairsArray(numbers);
// }

// Q2 Reverse an array 
// public static void ReverseNum(int numbers[]){
//     int start = 0;
//     int end = numbers.length-1;

//     while(start < end){
//         int temp = numbers[end];
//         numbers[end] = numbers[start];
//         numbers[start] = temp;
//         start++;
//         end--;
//     }

// }

// public static void main(String args[]){
//     int numbers[] = {2, 4, 6, 8, 10};
   
// ReverseNum(numbers);
// for(int i = 0; i < numbers.length;i++){
//     System.out.print(numbers[i] +" ");
// }
// System.out.println();
// }

public static int binSer(int numbers[], int key){
    int start = 0 ; 
    int end = numbers.length-1;

    while(start <= end){
       int mid = (start + end) / 2;

       if(numbers[mid] == key){
         return mid;
       }
       if(numbers[mid] < key){
         start= mid + 1
       
       }else{
        end = mid - 1;
       }
    }
    return -1;
}

public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    int key = 10;

    binSer(numbers,key);
    

}

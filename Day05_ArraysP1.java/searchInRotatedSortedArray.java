// !  LEETCODE_33 - Medium 

import java.util.*;
// public class searchInRotatedSortedArray{
    // * It use linear search and time complexity is O(n)
// public static int searchInRotateSortArr(int numbers[], int target){
//     for(int i = 0; i < numbers.length;i++){
//         if(numbers[i] == target){
//             return  i;
//         }
//         }
//         return -1;
//     }


// public static void main(String args[]){
//     int numbers[] = {4, 5, 6, 7, 0, 1, 2};
//     int target = 0;
//     System.out.println(searchInRotateSortArr(numbers,target));
// } 
// }
//? BUT We need time Complerity as O(logn) 
//? WE will use BInary Search 

// public class searchInRotatedSortedArray{

// public static int searchInRotateSortArr(int numbers[], int target){
//     int first = 0;
//     int last = numbers.length -1;
//     while(first <= last){
//         int mid = (first + last)/ 2;
//         if(numbers[mid] == target){
//             return mid;
//         }
//         if(numbers[first]  <= numbers[mid]){
//             if(numbers[first] <= target && target <= numbers[mid]){
//             last = mid -1;
//             }else{
//                 first = mid + 1;
//             }
//         }else {
//             if(numbers[mid] <= target && target <= numbers[last]){
//                 first = mid + 1;
//             }else{
//                 last = mid - 1;
//             }
//         }
//     }
//     return -1;
// }
// public static void main(String args[]){
//     int numbers[] = {4, 5, 6, 7, 0, 1, 2};
//     int target = 0;
//     System.out.println(searchInRotateSortArr(numbers,target));
// }


 // ? Revision 
// public static int searchInRotateSortArr(int numbers[], int target){
//     int first = 0;
//      int last = numbers.length-1;
//      while(first <= last){
//         int mid = (first + last)/2;
//         if(numbers[mid] == target){
//             return mid;
//         }
//         if(numbers[first] <= numbers[mid]){
//             if(numbers[first] <= target && target <= numbers[mid]){
//                 last = mid - 1;
//             }else {
//                 first = mid + 1;
//             }
//         }else {
//             if(numbers[mid] <= target && target <= numbers[last]){
//                 first = mid + 1; 
//             }else{
//                 last = mid -1;
//             }
//         }
//      }
//      return -1;
// }

// }




public class searchInRotatedSortedArray{
public static int searchInRotateSortArr(int numbers[] ,int target){
  int first = 0;
  int last = numbers.length-1;
  while(first <= last){
    int mid = (first + last) / 2;
    if(numbers[mid] == target){
        return mid;
    }
    if(numbers[first] <= numbers[mid]){
        if(numbers[first] <= target && target <= numbers[mid]){
            last = mid -1;
        }else{
            first = mid + 1;
        }
    }else{
        if(numbers[mid] <= target && target <= numbers[last]){
            first = mid + 1;
        }else{
            last = mid - 1;
        }
    }
  }
  return -1;
}
public static void main(String args[]){
    int numbers[] = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;
    System.out.println(searchInRotateSortArr(numbers,target));
}
}
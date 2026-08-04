import java.util.*;

public class binarySearch {
    public static int binSearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid; // found the key 
            }
            if(numbers[mid] < key){
                start = mid + 1; // move right side  
            }else {
                end = mid - 1; // move to left side key is there
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        System.out.println("Index of key is: "+ binSearch(numbers,key));
    }
}
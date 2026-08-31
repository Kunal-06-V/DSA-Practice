import java.util.*;

public class arraySorted{
    // public static boolean isSorted(int numbers[]){
  
    //  for(int i = 0; i< numbers.length-1;i++){
    //     if(numbers[i] > numbers[i+1]){
    //           return false;
    //     }
    //  }
    //  return true;
     
    // }
    // public static void main(String args[]){
    //     // int numbers[] ={1, 2, 3, 4, 5};
    //     int numbers[] ={1, 3, 2, 4, 5} ;

    //       System.out.println(isSorted(numbers));
    // }
    public static boolean isSorted(int numbers[]){

        for(int i = 0; i< numbers.length -1;i++){
            if(numbers[i] > numbers[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int numbers[] ={1, 2, 3, 4, 5} ;
          System.out.println(isSorted(numbers));
    }
}  
//? O(n) => time and Space => O(1).
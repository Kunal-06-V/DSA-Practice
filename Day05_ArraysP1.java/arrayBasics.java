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

public static int linearSearch(String menu[], String key){
    for(int i = 0; i<= menu.length-1;i++){
        // if(menu[i] == key){
        //      return i;
        // }  // it stores the both string object in one String pool so the java think it is same and give is correct 
        // menu[2] == key ; if we change the variable with new String class it will give not found o/p before change the old code 
        if (menu[i].equals(key)) {
    return i;
}
    }
    return -1;
}
public static void main (String args[]){
    String menu[] = {"dosa", "chole bhature", "samosa", "pani puri"};
    // String key = "samosa";
    String key = new String("samosa");

    int index = linearSearch(menu,key);
    if(index == -1){
        System.out.println("NOT found");
    }else{
        System.out.println("Key is at index: "+ index);
    }
}
}

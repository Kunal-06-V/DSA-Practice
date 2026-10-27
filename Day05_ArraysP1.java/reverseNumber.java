import java.util.*;

public class reverseNumber {
//     public static void reverse(int numbers[]){
//         int first = 0;
//         int last = numbers.length-1;
//         while(first < last){
//             //? Swap 
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;
//             first++;
//             last--;
//         }

//     }
//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10};
//         reverse(numbers);
//         //? print
//         for(int i = 0; i < numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//     } 


public static void reverseNumber(int numbers[]){
   int first = 0;
   int last = numbers.length-1;
   while(first < last){
    // Swap 
    int temp = numbers[first];
    numbers[first] = numbers[last];
    numbers[last]= temp;
    first++;
    last--;
   }
   
}
public static void main(String args[]){
  int numbers[]={2, 4, 6, 8, 10};
  reverseNumber(numbers);

  for(int i = 0; i <numbers.length;i++){
    System.out.println(numbers[i]+" ");
  }
System.out.println();
}

// ? Method two if number are in not array -- 
//* int == 32 bit max positive value => 2147483647 
// * max negative value => -2147483648  the output should bettween them 
  //  public static int reverse(int numbers){
  //     int rev= 0; 
  //    while(numbers != 0){
  //     int digit = numbers % 10;
  //     rev = rev * 10 + digit;
  //     if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE && digit > 7 ){
  //       return 0;
  //     }
  //     if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE && digit < 8){
  //       return 0;
  //     }
  //     numbers /= 10;
  //    }
  //     return rev;
  //  }
  

  //! revision set  2 

  //  public static int reverse(int numbers){
  //   int rev =0;
  //   while(numbers != 0){
  //     int digit = numbers % 10;
  //     rev = rev * 10 + digit;
  //     if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE && digit > 7) {
  //       return 0;
  //     }
  //     if(rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE && digit < 8) {
  //       return 0;
  //     }
  //     numbers /= 10;
  //   }
  //   return rev;
  //  }


   //! Revision Set 3 

  //  public static int reverse(int numbers){
  //      int rev = 0;
  //      while(numbers > 0){
  //       int lastDigit = numbers % 10;
  //       rev = rev * 10 + lastDigit;
  //       if(rev > Integer.MAX_VALUE || rev == Integer.MAX_VALUE && lastDigit > 7){
  //         return -1;
  //       }
  //       if(rev < Integer.MIN_VALUE || rev == Integer.MIN_VALUE && lastDigit < 8){
  //         return -1;
  //       }
  //       numbers /= 10;
  //      }
  //      return rev;
  //  }

// ! Pratice set 4 
  //  public static int reverse(int numbers){
  //   int rev = 0;
  //   while(numbers > 0){
  //     int lastDigit = numbers % 10;
  //     rev = rev * 10 + lastDigit;
  //     if(rev > Integer.MAX_VALUE || rev == Integer.MAX_VALUE && lastDigit > 7){
  //       return -1;
  //     }
  //     if(rev < Integer.MIN_VALUE || rev == Integer.MIN_VALUE && lastDigit < 8){
  //       return -1;
  //     }
  //     numbers /= 10;
  //   }
  //   return rev;
  //  }
  //  public static void main(String args[]){
  //    int numbers = 12345;
  //      System.out.println(reverse(numbers));
  //  }
}
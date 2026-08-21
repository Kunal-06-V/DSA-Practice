import java.util.*;

public class maxSubArrayadv{ 
     
     // ! We have solve MaxSubArraySum question before but using 
     //! using Burte Force and Prefix Method 

     //? Now we will do it using KADANE'S Algorithm 
     //* +ve + +ve => +ve 
     //* +ve + -ve => +ve // +ve number is bigger 
     //* +ve + -ve => -ve // if -ve is bigger 
     //* Ex - -7 + 4 => -3  a bigger -ve add to small positive = small negative 

    public static void kadanesAlg(int numbers[]){
       int cs = 0;
       int ms = Integer.MIN_VALUE;
       for(int i =0; i< numbers.length;i++){
         cs +=numbers[i];
         if(cs < 0){
            cs = 0;
         }
         ms = Math.max(cs , ms); 
         //? Use Math.max to find which have maximum value cs or ms if cs have then ms change or ms have bigger value then ms same 
         //* eg : ms = 5 and cs = 6 => ms = 6 OR ms = 6 and cs = 5 then ms = 6 
       }
       System.out.println("Maximum Sum is: "+ms);
    }

    public static void main(String args[]){
      int numbers [] ={ -2, -3, 4, -1, -2, 1, 5, -3};
      kadanesAlg(numbers);
    }

    //! What IF all variable are all negative 
}
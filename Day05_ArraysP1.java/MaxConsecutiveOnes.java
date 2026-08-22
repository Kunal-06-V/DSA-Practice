import java.util.*;

public class MaxConsecutiveOnes{
    public static int MaxConsecutive(int numbers[]){
        int c = 0;
        int m = 0;
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i] == 1){
            //  c++;
            c += 1;
            }else{
                c = 0;
            }
            m= Math.max(c,m);
        }
        return m;
    }
    public static void main(String args[]){
        int numbers[] ={1, 1, 0, 1, 1, 1, 0, 1};
        
        System.out.println(MaxConsecutive(numbers));

    }
}
//? Time => O(n)
// ? Space => O(1).
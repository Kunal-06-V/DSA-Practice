import java.util.*;

public class Triangle_01 {
    public static void zero_one_Tri(int num){
        for(int i = 1; i <= num;i++){
            for(int j = 1; j<= i;j++){
                if((i+j)% 2 == 0){
                 System.out.print("1");
                }else{
                 System.out.print("0");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    zero_one_Tri(num);
    }
}
import java.util.*;

public class hollowRhombusPattern{
    public static void solidRhombus(int n ){
        for(int i = 1 ; i <= n;i++){
            // spaces 
        for(int j = 1; j <= n - i; j++ ){
          System.out.print("   ");
        }
          // stars 
        for(int j = 1 ;j <= n;j++){
         if(i == 1 || i == n || j == 1 || j == n){
            // (i,j) logic 
            System.out.print(" * ");
         }else{
            System.out.print("   ");
         }
        }
          System.out.println();
        }
    }

    public static void main(String args[]){
        solidRhombus( 4 );
    }
}
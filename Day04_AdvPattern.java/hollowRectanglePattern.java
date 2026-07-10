import java.util.*;

public class hollowRectanglePattern{
     
     public static void hollow_Rectangle(int tolRow, int tolCol ){
        // Outer loop 
       for(int i = 1; i <= tolRow;i++){
        // inner loop
        for(int j = 1; j <= tolCol;j++){
            // cell i , j
            if( i == 1 || i == tolRow || j == 1 || j == tolCol){
                System.out.print(" * ");
            }else {
                System.out.print("   ");
            }
        }
            System.out.println();
       }
     }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows : ");
        int tolRow = sc.nextInt();
        System.out.println("Enter the Colums : ");
        int tolCol = sc.nextInt();
     
     hollow_Rectangle(tolCol , tolRow);

    //   hollow_Rectangle(4 ,5);    
 
    }
}
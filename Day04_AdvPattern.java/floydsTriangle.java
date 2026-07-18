import java.util.*;

public class floydsTriangle{
   public static void floydsTri(int num){
    int number = 1;
    // outer
    for(int i = 1;i <= num;i++){
        // inner - How many times will counter be printed
        for(int j = 1 ; j <= i;j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }
   }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
       floydsTri(num);
    }
}
import java.util.*;

public class factorialPattern {
    public static int Factorial(int n){
    int f = 1;
    for(int i = 1; i <= n;i++){
        f *= i;
    }
    return f;
}
public static void main(String args[]){
    int total =  Factorial(5);
    System.out.println(total);
}
}
import java.util.*;

public class binomialCoefficientPattern{

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<= n;i++){
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n ,int r){
    int binCoeff;
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

     binCoeff= fact_n/(fact_r*fact_nmr);
    return binCoeff;

}
public static void main(String args[]){
    //  int total = binomialCoefficientPattern(5 , 4);
    System.out.println(binomialCoefficient(5 , 2));

}
}
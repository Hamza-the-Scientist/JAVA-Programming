import java.util.*;

public class Factorial {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double num;
        double result = 1;

        System.out.print("Enter any number : ");
        num = sc.nextDouble();

        for(int i = 1; i <= num; i++ ){
            result = i * result;
        }

        System.out.println("The Factorial of the number is : " + result);

        sc.close();
    }
}

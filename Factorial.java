// Find the Factorial of any number

import java.util.*;

class Factorial{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num;
        int result = 1;

        System.out.print("Enter any number : ");
        try{
            num = sc.nextInt();

            if(num <=0){
                System.out.println("Factorial is defined for zero and negative number.");
                return;

            }

            for(int i = 1; i <= num; i++ ){
                result = i * result;
            }

            System.out.println("The Factorial of the number is : " + result);

        }catch(Exception e){
            System.out.println("Invalid input! Pls.. Enter any postive number.");
        }

        sc.close();
    }
}

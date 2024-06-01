//import the library of the input function
import java.util.*;
//Making the simple calculator
class Calculator{
    public static void main(String args[]){

    //Declaration all variables
    double num1;
    double num2;
    String operator;
    double result;
    
    Scanner sc = new Scanner(System.in);

    do{
        System.out.print("Enter the two numbers with operators : ");

        try{
            num1 = sc.nextDouble();
        } catch(Exception e){
            System.out.println("Exit from the program......\n");
            break;
        }

        operator = sc.next(); // (+,-,*,/)
        num2 = sc.nextDouble();

        result = 0;

        switch(operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2 == 0){
                    System.out.println("Infiniy...........");
                    continue;
                }
                result = num1 / num2;
                break;
        }

        System.out.println("\t\t\t\t     = "+result);

    }while(true);
    
    sc.close();
    }
}
import java.util.*;

class Check_prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        for(int i = 2; i <= num/2; i++){
            if(num % i == 0 ){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            if(num == 1){
                System.out.println("Neither prime not composite.");
            } else {
                System.out.println("This is prime number.");
            }
        }
        else{
            System.out.println("This is not Prime.");
        }

        
    }
} 
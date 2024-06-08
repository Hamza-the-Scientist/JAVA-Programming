import java.util.*;

class half_pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character to print = ");
        String sign = sc.next();
        char character = sign.charAt(0);

        System.out.print("Enter number of lines to print = ");
        int line = sc.nextInt();

        for(int i=1; i<=line; i++){
            for(int k=1; k<=i; k++){
                System.out.print(character);
            }
            System.out.println();
        }

        sc.close();
    }    
}
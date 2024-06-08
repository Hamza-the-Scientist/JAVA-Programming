import java.util.*;

class inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any character to print = ");
        String sign = sc.next();
        char character = sign.charAt(0);

        System.out.print("Enter number of lines to print = ");
        int line = sc.nextInt();

        for(int i=line; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print(character);
            }
            System.out.println();
        }
        sc.close();
    }    
}

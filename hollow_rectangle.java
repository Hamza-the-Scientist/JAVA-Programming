// Print the hollow Rectangle
import java.util.Scanner;

class hollow_rectangle {
    public static void main(String arhs[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row to print \"*\" : ");    // Taking input of row
        int row = sc.nextInt() ;
        System.out.print("Enter number of column to print \"*\" : ");   // Takingn input of column
        int column = sc.nextInt();

        //outer loop
        for (int i=1; i<=row; i++){
            //inner loop
            for(int j=1; j<=column; j++){
                if(i == 1 || j == 1 || i == row || j == column){ // Giving conditions
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
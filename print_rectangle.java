import java.util.*;   // Import input package

class print_rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row to print \"*\" : ");    // Taking input of row
        int row = sc.nextInt() ;
        System.out.print("Enter number of column to print \"*\" : ");   // Takingn input of column
        int col = sc.nextInt();

        // outer loop
        for (int i = 0; i < row; i++){
            System.out.println();            // For print Next line
            // inner loop            
            for(int j = 0; j < col; j++){
                System.out.print("*");
            }
        }
        sc.close();  // Scanner close here
    }    
}

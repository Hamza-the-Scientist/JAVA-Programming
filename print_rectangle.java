import java.util.*;

class print_rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row to print \"*\" : ");
        int row = sc.nextInt() ;
        System.out.print("Enter number of column to print \"*\" : ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++){
            System.out.println();            // For print Next line
            for(int j = 0; j < col; j++){
                System.out.print("*");
            }
        }

    }    
}

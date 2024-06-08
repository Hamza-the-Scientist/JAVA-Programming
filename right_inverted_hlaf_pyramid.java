class right_inverted_hlaf_pyramid {
    public static void main(String[] args) {

        int space = 4;
        // Outer Loop
        for(int i = 1; i <=5; i++){
            // Inner loop -->  Print space
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            // Inner loop --> Print Star
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
        
    }    
}

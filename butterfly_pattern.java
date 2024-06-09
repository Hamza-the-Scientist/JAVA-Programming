class butterfly_pattern {
    public static void main(String[] args) {

        int space = 6;
        
        for(int i=1; i<=4; i++){
            //inner loop for print -> "*"
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //inner loop for print space
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            space = space - 2;
            //inner loop for print -> "*"
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted upper part
        int space2 = 0;
        //outer loop
        for(int i=1; i<=4; i++){
            //inner loop for print -> "*"
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
            //inner loop for print space
            for(int k=0; k<space2; k++){
                System.out.print(" ");
            }
            space2 = space2 + 2;
            //inner loop for print -> "*"
            for(int l=4; l>=i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}

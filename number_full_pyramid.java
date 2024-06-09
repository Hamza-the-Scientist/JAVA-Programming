class number_full_pyramid {
    public static void main(String[] args) {

        int n = 5;
        int space = n;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            space--;

            for(int k=1; k<=i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }    
}

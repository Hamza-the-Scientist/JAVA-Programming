class inverted_numbers_half_pyramid {
    public static void main(String[] args) {
        
        // Outer loop
        for(int i=5; i>=1; i--){
            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}

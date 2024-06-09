class continous_number_pyramid {
    public static void main(String[] args) {

        int num = 1;
        
        // Outer loop
        for(int i=1; i<=5; i++){
            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }    
}

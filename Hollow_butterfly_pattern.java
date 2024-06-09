class Hollow_butterfly_pattern {
    public static void main(String[] args) {
        
        int n = 5;
        int space = 8;

        //First part
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || i==j){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // Space
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            space = space-2;
            //2nd part
            for(int j=1; j<=i; j++){
                if(j==i || j==1){
                System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int space2 = 0;
                //First part
                for(int i=n; i>=1; i--){
                    for(int j=1; j<=i; j++){
                        if(j==1 || i==j){
                        System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    // Space
                    for(int j=1; j<=space2; j++){
                        System.out.print(" ");
                    }
                    space2 = space2 + 1;
                    //2nd part
                    for(int j=n; j>=1; j--){
                        if(j==i || j==1){
                        System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
    }    
}

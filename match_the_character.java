class Match_the_charcter {
    public static void main(String args[]){

        String password = "Hamza@123"; // Enter any pasword
        char[] crack_password = new char[password.length()];

        //Check the character one-by-one

        for(int i = 0; i < password.length(); i++){
            
                for(int k = 0; k <= 255; k++){
                    if(password.charAt(i) == (char)k){  // If the charcter match then store in password
                        crack_password[i] = (char)k;
                        break;
                    }
                
            }
        }

        System.out.print("Password = ");
        for(int i = 0; i < crack_password.length; i++){
            System.out.print(crack_password[i]);        //Print the password
        } 
    }
}

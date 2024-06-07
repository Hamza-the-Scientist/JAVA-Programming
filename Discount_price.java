// Program for finding the discount 

import java.util.*;

class Discount_price {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Declare all the variables that is used in the program

        double amount;
        double discount = 0;
        double final_amount;

        System.out.print("Enter the Total Amount = ");
        amount = sc.nextInt();

        // Discount Conditions
        // We cannot add switch operator b/c in switch operation we can not pass condition like this (amount >= 500000).

        if(amount >= 500000){
            discount = amount * 0.15;
        } else if( amount >= 100000){
            discount = amount * 0.10;
        } else if(amount >= 50000){
            discount = amount * 0.05;
        }
            final_amount = amount - discount;

            // Print the discount and Final Amount

            System.out.println("discount = " + discount);
            System.out.println("Total Price = " + final_amount);

    sc.close();
    }
}

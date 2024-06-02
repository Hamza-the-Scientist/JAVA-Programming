// Program for finding the discount 

import java.util.*;

public class Discount_price {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double amount;
        double discount = 0;
        double final_amount;

        System.out.print("Enter the Total Amount = ");
        amount = sc.nextInt();

        // Discount Conditions

        if(amount >= 500000){
            discount = amount * 0.15;
        } else if( amount >= 100000){
            discount = amount * 0.10;
        } else if(amount >= 50000){
            discount = amount * 0.05;
        }
            final_amount = amount - discount;

            System.out.println("discount = " + discount);
            System.out.println("Total Price = " + final_amount);

    }
}

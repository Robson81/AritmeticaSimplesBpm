package poo;

import java.util.Locale;

import java.util.Scanner;

import entities.Product;

public class ProducProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	Product x = new Product();
	
	
	System.out.println("Enter the data of the product");
	System.out.print("Name: ");
	x.name =  sc.nextLine();
	System.out.print("Price: ");
	x.price =  sc.nextDouble();
	System.out.print("Quantity: ");
	x.quantity =  sc.nextInt();
	
	System.out.println("\nProduct Data: " + x);
	System.out.println();
	System.out.println("-----------");
	System.out.println();
	
	System.out.print("Enter the quantity to Add in the stok: ");
	x.addQuantity(sc.nextInt());
	
	System.out.println("\nUpdated Data: " + x);
	System.out.println();
	System.out.println("-----------");
	System.out.println();
	
	System.out.print("Enter the quantity to Remove in the stok: ");
	x.addRemove(sc.nextInt());
	
	System.out.println("\nUpdated Data: " + x);
	System.out.println();
	System.out.println("-----------");
	System.out.println();
	
	
	
	
	
	
	sc.close();
	}

}

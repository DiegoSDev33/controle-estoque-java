package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Children;
import entities.Client;
import entities.Seller;
import entities.feminineStock;
import entities.masculineStock;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		masculineStock mStock = new masculineStock();
		feminineStock fStock = new feminineStock();
		String fileOutput = "C:\\temp\\registers.csv";
		Children cStock = new Children();
		Seller seller = new Seller();
		Client client = new Client();
		
		String in;
		int choose =0;
		int classProduct =0;
		
		while(true) {
		
		System.out.println("What do you want to do?");
		System.out.println("Choose the number of the process:");
		System.out.println("1 - register new product");
		System.out.println("2 - register new seller");
		System.out.println("3 - register new customers");
		System.out.println("4 - make a sale");
		System.out.println("5 - list stock actually");
		System.out.println("6 - print register list ");
		choose = sc.nextInt();
		
		if(choose ==1) {
			System.out.println("Choose a part class do you want to register: ");
			System.out.println("1 - masculine");
			System.out.println("2 - feminine");
			System.out.println("3 - children");	
			
			classProduct = sc.nextInt();
			
			switch(classProduct){
			case 1:
				mStock.inputStock();
				list.add(mStock.getRegister());
			break;
			case 2:
				fStock.inputStock();
				list.add(fStock.getRegister());
			break;
			case 3:
				cStock.inputStock();
				list.add(cStock.getRegister());
			break;
			default:
				System.out.print("This class not exist");
			}
			
		}
		else if(choose ==2) {
			System.out.println("Registration of new Seller: ");
			System.out.println(seller.toString());
		}
		else if(choose ==3) {
			System.out.println("Registration of new Client: ");
			System.out.println(client.toString());
		}
		else if(choose ==4) {
			System.out.println("make a sale: ");
			System.out.println("Choose the class of product to sale?");
			System.out.println("1 - masculine");
			System.out.println("2 - feminine");
			System.out.println("3 - children");
			
			classProduct = sc.nextInt();
			
			switch(classProduct) {
			case 1:
				System.out.println("Put the name of seller:");
				seller.Consult(sc.next());
				if (seller.getReturSellerTrue() == 1) {
					System.out.println("Put the name of client:");
					client.Consult(sc.next());
					if (client.getReturClientTrue() == 1) {

						System.out.println("Which product do you want to sale?");
						
							mStock.ConsultProductStock(sc.next());
							if (mStock.getReturnProductTrue() == 1) {
								mStock.outputStock();
								client.setReturClientTrue(0);
								seller.setReturSellerTrue(0);
								mStock.setReturnProductTrue(0);
								list.add(mStock.getRegister());
							} else {
								System.out.println("this product isn't in stock");
							}
					} else {
						System.out.println("This Client isn't registered");
					}
				} else {
					System.out.println("This Seller isn't registered");
				}
			case 2:
				System.out.println("Put the name of seller:");
				seller.Consult(sc.next());
				if (seller.getReturSellerTrue() == 1) {
					System.out.println("Put the name of client:");
					client.Consult(sc.next());
					if (client.getReturClientTrue() == 1) {

						System.out.println("Which product do you want to sale?");
						
							fStock.ConsultProductStock(sc.next());
							if (fStock.getReturnProductTrue() == 1) {
								fStock.outputStock();
								client.setReturClientTrue(0);
								seller.setReturSellerTrue(0);
								fStock.setReturnProductTrue(0);
								list.add(fStock.getRegister());
							} else {
								System.out.println("this product isn't in stock");
							}
					} else {
						System.out.println("This Client isn't registered");
					}
				} else {
					System.out.println("This Seller isn't registered");
				}
			case 3: 
				System.out.println("Put the name of seller:");
				seller.Consult(sc.next());
				if (seller.getReturSellerTrue() == 1) {
					System.out.println("Put the name of client:");
					client.Consult(sc.next());
					if (client.getReturClientTrue() == 1) {

						System.out.println("Which product do you want to sale?");
						
							cStock.ConsultProductStock(sc.next());
							if (cStock.getReturnProductTrue() == 1) {
								cStock.outputStock();
								client.setReturClientTrue(0);
								seller.setReturSellerTrue(0);
								cStock.setReturnProductTrue(0);
								list.add(cStock.getRegister());
							} else {
								System.out.println("this product isn't in stock");
							}
					} else {
						System.out.println("This Client isn't registered");
					}
				} else {
					System.out.println("This Seller isn't registered");
				}
			}
			
				
		}else if (choose == 5) {
			System.out.println("List ");
			for (int i = 0; i < list.size(); i++) {
				System.out.println("Register :" + list.get(i));
			}
		}else if (choose == 6) {
			try (BufferedWriter buffer1 = new BufferedWriter(new FileWriter(fileOutput))) {

				for (int i = 0; i < list.size(); i++) {
					buffer1.write(list.get(i));
					buffer1.newLine();

				}

			} catch (IOException err) {
				System.out.println(err.getMessage());
			}

		} else {
			System.out.println("Option not found!");
		}
		
		} //while
		
	}

}

package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Stock {
	
	List<String> list = new ArrayList<>();
	List<String> listProduct = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	protected String product;
	protected int Order;
	protected double price;
	protected double total;
	protected int quantity;
	protected int returnProductTrue;
	private String register = "";
	String in;
	
	public Stock() {
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	

	
	public Stock(List<String> list, List<String> listProduct, Scanner sc, String product, int order, double price,
		double total, int quantity, int returnProductTrue, String register) {
		super();
		this.list = list;
		this.listProduct = listProduct;
		this.sc = sc;
		this.product = product;
		Order = order;
		this.price = price;
		this.total = total;
		this.quantity = quantity;
		this.returnProductTrue = returnProductTrue;
		this.register = register;
	}
	
	public void ConsultProductStock(String input) {
		
		for(int i =0; i <listProduct.size();i++) {
			if(input.equals(listProduct.get(i))) {
			System.out.println("Product is register ... ");
			this.returnProductTrue = 1;
		}else {
			System.out.println("Product isn't register...");
		}
		
	}
	}
	
	public void inputStock() {
		System.out.println("Which product do you want to register?");
		
			product = sc.next();
		
		System.out.println("put the price?");
		
			price = sc.nextDouble();
		
		System.out.println("put the quantity?");
		
			in= sc.next();
	
			Order = random.nextInt(100000);
		System.out.println("The Order is - " + Order);
		
		quantity += Integer.parseInt(in);
		total = price * quantity;
		LocalDate date = LocalDate.now();
	
		register = String.format("the following item was recorded: " + product
				 + ", price un: " + price +", total: " + total + ", Order: " + Order + ", Quantity: " + quantity + " date: " + date );
		list.add(register);
		listProduct.add(product);
		
	}
	
	public void outputStock() {
		
		System.out.println("put the quantity?");
		
			in = sc.next();
			if(Integer.parseInt(in)<= quantity) {
				quantity -= Integer.parseInt(in);
				
				total = price * quantity;
				LocalDate date = LocalDate.now();
				Order = random.nextInt(100000);
				
				register = String.format("the following item was sale: " + product
						 + ", price un: " + price +", total: " + total + ", Order: " + Order + ", Quantity: " + quantity + " date: " + date );
				System.out.println("sale completed");
				list.add(register);
				
			
			}else {
				System.out.println("Insufficient quantity in stock");
			}
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public int getReturnProductTrue() {
		return returnProductTrue;
	}

	public void setReturnProductTrue(int returnProductTrue) {
		this.returnProductTrue = returnProductTrue;
	}
	
	
	
	
	
	
	

}

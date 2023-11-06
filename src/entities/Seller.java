package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seller {
	
	List<String> list = new ArrayList<>();
	List<String> listName = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	private String name;
	private String email;
	private String cpf;
	private String rg;
	private int returSellerTrue;

	public Seller() {
	}

	public int getReturSellerTrue() {
		return returSellerTrue;
	}

	public void setReturSellerTrue(int returSellerTrue) {
		this.returSellerTrue = returSellerTrue;
	}

	public Seller(String name, String email, String cpf, String rg) {
		super();
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
	}

	@Override
	public String toString() {

		System.out.println("Write the new seller to register");
		System.out.println("Put the name: ");
		name = sc.next();
		System.out.println("email?");
		email = sc.next();
		System.out.println("put the CPF");
		cpf = sc.next();
		System.out.println("put the RG");
		rg = sc.next();

		String register = String.format("the following Seller was recorded: " + name + ", email " + email + ", CPF:  " + cpf + ", rg " + rg);
		list.add(register);
		listName.add(this.name);

		return "Seller [name=" + name + ", email=" + email + ", cpf=" + cpf + ", rg=" + rg + "]";
	}

	public void Consult(String input) {

		for (int i = 0; i < listName.size(); i++) {
			if (input.equals(listName.get(i))) {
				System.out.println("saller  is register ... ");
				this.returSellerTrue = 1;
			} else {
				System.out.println("this register is not register...");
			}

		}

	}

	
	
}

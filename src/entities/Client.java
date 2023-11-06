package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

	List<String> list = new ArrayList<>();
	List<String> listName = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	private String cpf;
	private String phone;;
	private String name;
	private String email;
	private String address;
	private	int returClientTrue;
	
	public Client() {
	}

	public int getReturClientTrue() {
		return returClientTrue;
	}

	public void setReturClientTrue(int returClientTrue) {
		this.returClientTrue = returClientTrue;
	}

	

	public Client(String cpf, String phone, String name, String email, String address) {
		super();
		this.cpf = cpf;
		this.phone = phone;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString() {
		
		System.out.println("Which new Client do you want to register?");
			name = sc.next();
		System.out.println("email?");
			email = sc.next();
		System.out.println("put the CPF");
			cpf = sc.next();
		System.out.println("put the phone number: ");
			phone= sc.next();
		System.out.println("put the addressr: ");
			address= sc.next();
		
		
		String register = String.format("the following Client was recorded: " + name
				 + ", email: " + email+", cpf: " + cpf + ", Phone: " + phone + ", Address: " + address);
		list.add(register);
		listName.add(name);
		
		
		
		return "Customers [cpf=" + cpf + ", phone=" + phone + ", name=" + name + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
	public void Consult(String input) {
		
		for(int i =0; i <listName.size();i++) {
			if(input.equals(listName.get(i))) {
			System.out.println("Client is register ... ");
			returClientTrue = 1;
		}else {
			System.out.println("this client is not register...");
		}
		
	}
	
	
	}
	
	
	
	
	
	
	
}

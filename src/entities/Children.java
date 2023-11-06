package entities;

import java.util.List;
import java.util.Scanner;

public class Children extends Stock{

	public Children() {
		super();
		
	}

	public Children(List<String> list, List<String> listProduct, Scanner sc, String product, int order, double price,
			double total, int quantity, int returnProductTrue, String register) {
		super(list, listProduct, sc, product, order, price, total, quantity, returnProductTrue, register);
		
	}
	
	
	
		
}

package entities;

import java.util.InputMismatchException;

public class ExceptionClass {

	private int inputVar;

	public int getInputVar() {
		return inputVar;
	}

	public void setInputVar(int inputVar) {
		this.inputVar = inputVar;
	}
	
	public ExceptionClass() {
		
	}

	
	public void ExceptionGlobalInt(int input) throws InputMismatchException {
		
	try {
		this.inputVar = input;
	}catch(InputMismatchException  e) {
		System.out.println(e.getMessage());
		throw e;
	}

	}
	
	
	
}

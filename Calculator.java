package com.calculator;

public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double answer;
	
	public Calculator() {
		
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public void setOperation(String operation) {
		if (operation.equals("+") || operation.equals("-")) {
			this.operation = operation;
		}
		else {
			System.out.println("Please enter + or -...");
		}
			
	}
	
	public void performOperation() {
		if (operation.equals("+")) {
			this.answer = this.operandOne + this.operandTwo;
		}
		else if (operation.equals("-")) {
			this.answer = this.operandOne - this.operandTwo;
		}
	}
	
	public void getResults() {
		System.out.println("Here is the answer: " + this.answer);
	}
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOperandOne(10.5);
		calc.setOperation("+");
		calc.setOperandTwo(5.2);
		calc.performOperation();
		calc.getResults();
	}
	
}

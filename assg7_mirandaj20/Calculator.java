/**
 * @author Anthony Miranda
 * Calculator class provides methods for converting infix expression to postfix expression and evaluating the postfix expression
 */
package assg7_mirandaj20;

import java.util.*;

public class Calculator {
	
	String exp;
	String Postfix = new String("");
	
	/**
	 * Created Precedence method to check precedence of operators 
	 * Addition and subtraction are considered lower level than multiplication and division
	 * If operator is not known, will let operator know
	 * @param oper
	 * @return
	 */
	public int precedence(char oper) {
		
		switch (oper) {
		case '+':
		case '-':
			return 0;
		case '*':
		case '/':
			return 1;
		default:
			throw new IllegalArgumentException("Operator unknown" + oper);
		}
	}

	/**
	 * Initializes infix expression
	 * @param exp
	 */
	public Calculator(String exp) {
		// TODO Auto-generated constructor stub
		this.exp = exp;
	}
	
	/**
	 * Returns infix expression
	 * @return String
	 */
	public String toString() {
		
		return exp;
	}
	
	/**
	 * Creates Postfix expression
	 * Returns true if successful
	 * @return
	 */
	private boolean convertPostfix() {
		Stack<Character> stack = new Stack<>();
		
	
		for (int i = 0; i < exp.length(); i++) {
			if (Character.isDigit(exp.charAt(i))) {
				Postfix = Postfix + exp.charAt(i);
			}
			
			else {
			switch(exp.charAt(i)) {
				
			case '(': 
				stack.push(exp.charAt(i));
				break;
			
			case ')':
				while (stack.peek() != '(') {
					Postfix = Postfix + stack.pop();
				}
				stack.pop();
				break;
				
			case '/', '-', '+', '*'	: 
				while (!stack.isEmpty() && stack.peek() != '(' && precedence(exp.charAt(i)) <= precedence(stack.peek())) {
					Postfix = Postfix + stack.pop();
				}
				stack.push(exp.charAt(i));
				break;
				
			default: 
				return false;
			}
			}
		}
		while(!stack.isEmpty()) {
			Postfix = Postfix + stack.pop();
		}
		return true;
	}
		
	
	/**
	 * Returns resulting postfix expression
	 * Throws IllegatStateException if called before convertPostfix
	 * @return
	 * @throws IllegalStateException
	 */
	public String getPostfix() throws IllegalStateException {
		if(convertPostfix() == true) {
			return Postfix;
		}
		else {
			throw new IllegalStateException();
		}
	}
	
	/**
	 * Evaluates the expression
	 * @return
	 * @throws IllegalStateException
	 */
	public int evaluate() throws IllegalStateException {
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < Postfix.length(); i++) {
			
			if(Character.isDigit(Postfix.charAt(i))) {
				stack.push(Postfix.charAt(i) - '0');
			}
			else {
				int firstNum = stack.pop();
				int secNum = stack.pop();
				
				switch(Postfix.charAt(i)) {
				
				case '+':
					stack.push(secNum + firstNum);
					break;
					
				case '-':
					stack.push(secNum - firstNum);
					break;
					
				case '*':
					stack.push(secNum * firstNum);
					break;
					
				case '/': 
					stack.push(secNum / firstNum);
					break;
				
					
				}
			}
		}
		return stack.pop();
	}

}

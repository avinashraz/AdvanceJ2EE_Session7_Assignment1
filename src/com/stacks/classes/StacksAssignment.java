package com.stacks.classes;

import java.util.Stack;

public class StacksAssignment {
	
public static void main(String[] args) {
	//Giving  6 String names.
	String nameOne = new String("Avinash");
	String nameTwo = new String("Deva");
	String nameThree = new String("Adi");
	String nameFour = new String("Ravi");
	String nameFive = new String("Manoj");
	String nameSix = new String("Selva");
	
	Stack stack = new Stack();
	
	stack.push(nameOne);
	stack.push(nameTwo);
	stack.push(nameThree);
	stack.push(nameFour);
	stack.push(nameFive);
	stack.push(nameSix);
	
	System.out.println("Sting[]names= "+stack);
	//prints the stack.push();
	System.out.println();
	System.out.println("The last String in the list: "+stack.peek());
	//prints the last String.
	System.out.println();
	System.out.println("The Size is: "+stack.size());
	//prints the size 
	System.out.println();
	System.out.println("The String going to be removed from the list: " +stack.pop());
	//remove the last String in the list.
	System.out.println();
	System.out.println("The current last Sting in the list "+stack.peek());
	//prints the last String in the list after removing one String.
	System.out.println();
	System.out.println("The Size is: "+stack.size());
	//prints the size again.
	

}
}

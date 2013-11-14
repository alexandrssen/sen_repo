package com.practicaljava.lesson10;

import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
 
   SimpleCalculatorGridBag parent; // a reference to the Calculator
   String action;
   double first_number;
   double result;
   double second_number;
   boolean first_operation = true;
   
 // Constructor stores the reference to the 
 // Calculator window in  the member variable parent
 CalculatorEngine(SimpleCalculatorGridBag parent){
   this.parent = parent;
 }

 private void set_first_number(String first, String act) {
	 this.first_number = Double.parseDouble(first);
	 this.action = act;
	 parent.cleanDisplayValue();
 }
 
 private String get_result(String second) {
	 
	 
	 if (first_operation) {
		 second_number = Double.parseDouble(second);
		 first_operation = false;
	 }
	 else {
		 first_number = result;
	 }
	 
	 switch (this.action) {
	 case "+": result = first_number + second_number;
	 		   break;
	 case "-": result = first_number - second_number;
   	  	       break;	 
	 case "*": result = first_number * second_number;
               break;
	 case "/": result = first_number / second_number;
               break;
	 }          
	 return Double.toString(result);
 }
 
 public void actionPerformed(ActionEvent e){
   // Get the source of this action
   JButton clickedButton =  (JButton) e.getSource();
   	
   // Get the existing text from the Calculator’s
   // display field. Reaching inside another object is bad.
   String dispFieldText = parent.getDisplayValue();

   // Get the button's label 
   String clickedButtonLabel = clickedButton.getText();
   
   switch (clickedButtonLabel) {
     case "+":  this.set_first_number(dispFieldText, clickedButtonLabel);
     			break;
     case "-":  this.set_first_number(dispFieldText, clickedButtonLabel);
				break;
     case "*":  this.set_first_number(dispFieldText, clickedButtonLabel);
				break;
     case "/":  this.set_first_number(dispFieldText, clickedButtonLabel);
				break;
     case "=":  parent.setDisplayValue(get_result(dispFieldText));
    	 		break;
     case "0":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case "1":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case "2":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case "3":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case "4":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case "5":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case "6":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case "7":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case "8":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case "9":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
     case ".":  parent.setDisplayValue(dispFieldText + clickedButtonLabel); 
				break;
   }
   
 }
}

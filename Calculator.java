/**
 * Creates a simple Graphical User Interface (GUI) Calculator.
 * The calculator can perform basic numerical operations {+, -, *, /}
 * Restricted to operations with 2 doubles / integers
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Calculator extends Frame implements ActionListener {

	private Button[] digits; // Array of Buttons that have labels 0 - 9
	private Button[] operands; // Array of Buttons that have labels +,-,*,/,= to represent operands
	private Button reset; // Button with label c to reset display to 0
	private Button point; // Button that adds a decimal 
	private TextField display; // Display of the calculator
	private String operation = "0"; // String displayed on TextField display

	public Calculator() {

		// A panel for the display that shows calculation
		Panel panelDisplay = new Panel(new FlowLayout());
		display = new TextField("0", 20);
		panelDisplay.add(display);

		// A panel that contains digits 0 - 9 in grid formation and a 'c' button to reset to 0
		Panel panelButtons = new Panel(new GridLayout(4, 3));
		digits = new Button[10];

		// Initializing digits 1 - 9 as buttons and adding this class as action listener
		for (int i = 1; i < 10; i++) {

			digits[i] = new Button(i + "");
			digits[i].addActionListener(this);
			panelButtons.add(digits[i]);
		}

		// Initializing button 0 and adding this class as action listener
			digits[0] = new Button("0");
			digits[0].addActionListener(this);
			panelButtons.add(digits[0]);

		// Initializing reset button
		reset = new Button("c");
		panelButtons.add(reset);
		
		// Creating an inner anonymous class as action listener for 'reset'.
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				operation = "0";
				display.setText(operation); // resets display to 0
			}
		});

		// Initializing decimal point button
		point = new Button(".");
		panelButtons.add(point);

		// Creating an inner anonymous class as action listener for 'point'.
		point.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

					operation += ".";
					display.setText(operation);
			}
		});

		// A panel for all operands +,-,*,/,= in grid formation
		Panel panelOperands = new Panel(new GridLayout(5, 1));
		operands = new Button[5];

		// Initializing all operands as buttons and adding an anonymous class as action listener
		operands[0] = new Button("+");
		panelOperands.add(operands[0]);
		operands[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				if (!operation.equals("0")) { // accounting for display initially 0
					operation+="+";
					display.setText(operation);
				}

				else {
					operation = "+";
					display.setText(operation);
				}
			}
		});

		operands[1] = new Button("-");
		panelOperands.add(operands[1]);
		operands[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				if (!operation.equals("0")) {
					operation+="-";
					display.setText(operation);
				}

				else {
					operation = "-";
					display.setText(operation);
				}
			}
		});

		operands[2] = new Button("*");
		panelOperands.add(operands[2]);
		operands[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				if (!operation.equals("0")) {
					operation+="*";
					display.setText(operation);
				}

				else {
					operation = "*";
					display.setText(operation);
				}
			}
		});

		operands[3] = new Button("/");
		panelOperands.add(operands[3]);
		operands[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				if (!operation.equals("0")) {
					operation+="/";
					display.setText(operation);
				}

				else {
					operation = "/";
					display.setText(operation);
				}
			}
		});

		operands[4] = new Button("=");
		panelOperands.add(operands[4]);
		operands[4].addActionListener(new OperationListener());

		// Add anonymous instance of inner class that extends WindowAdapter
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent evt) {

				System.exit(0); // close the program
			}
		});

		setLayout(new BorderLayout()); // "super" Frame sets layout to border style
		// Arrange all panels in frame
		add(panelDisplay, BorderLayout.NORTH);
		add(panelButtons, BorderLayout.WEST);
		add(panelOperands, BorderLayout.EAST);

		setTitle("Simple Calculator");
		setSize(300, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	// Overriding method of interface ActionListener
	// Depending on which digit is pressed, concatonate corresponding digit to String Operation
	@Override
	public void actionPerformed(ActionEvent evt) {

		String btnName = evt.getActionCommand();

	   /* 
	   If String operation is not 0, then concatonate appropriate digit to string
	   If operation is 0, then update operation to appropriate digit.
	   */

		if (btnName.equals("1")) {

			if (!operation.equals("0")) {
				operation+="1";
				display.setText(operation);
			}

			else {
				operation = "1";
				display.setText(operation);
			}
		}

		else if (btnName.equals("2")) {

			if (!operation.equals("0")) {
				operation+="2";
				display.setText(operation);
			}

			else {
				operation = "2";
				display.setText(operation);
			}
		}

		else if (btnName.equals("3")) {

			if (!operation.equals("0")) {
				operation+="3";
				display.setText(operation);
			}

			else {
				operation = "3";
				display.setText(operation);
			}
		}

		else if (btnName.equals("4")) {

			if (!operation.equals("0")) {
				operation+="4";
				display.setText(operation);
			}

			else {
				operation = "4";
				display.setText(operation);
			}
		}

		else if (btnName.equals("5")) {

			if (!operation.equals("0")) {
				operation+="5";
				display.setText(operation);
			}

			else {
				operation = "5";
				display.setText(operation);
			}
		}

		else if (btnName.equals("6")) {

			if (!operation.equals("0")) {
				operation+="6";
				display.setText(operation);
			}

			else {
				operation = "6";
				display.setText(operation);
			}
		}

		else if (btnName.equals("7")) {

			if (!operation.equals("0")) {
				operation+="7";
				display.setText(operation);
			}

			else {
				operation = "7";
				display.setText(operation);
			}
		}

		else if (btnName.equals("8")) {

			if (!operation.equals("0")) {
				operation+="8";
				display.setText(operation);
			}

			else {
				operation = "8";
				display.setText(operation);
			}
		}

		else if (btnName.equals("9")) {

			if (!operation.equals("0")) {
				operation+="9";
				display.setText(operation);
			}

			else {
				operation = "9";
				display.setText(operation);
			}
		}

		else if (btnName.equals("0")) {

			if (!operation.equals("0")) {
				operation+="0";
				display.setText(operation);
			}

			else {
				operation = "0";
				display.setText(operation);
			}
		}
	}

	// Performs operation entered in textField i.e. when '=' button is pressed
	private class OperationListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {

		int length = operation.length();

		// Corner Case: operation is 0	
			if (operation.equals("0"))
				display.setText("0");
			

		// Corner Case 2: if the first character or the last character is an operand, operation is invalid.
		// Note: '-' is ignored in the first character as a negative number may be inputted first
			else if (operation.charAt(0) == '+' || operation.charAt(0) == '*' || operation.charAt(0) == '/' || operation.charAt(length - 1) == '+' || operation.charAt(length - 1) == '-' || operation.charAt(length - 1) == '*' || operation.charAt(length - 1) == '/') {
				operation = "0"; // update operation
				display.setText("ERROR");
			}

		// Using a while loop, locate the index of the operand, then use substring to seperate both numbers
		// finally, depending on the operand, perform the correct operation and update both string and display
			else {
				int i = 0; 
				boolean decimal = false; // to check if decimal numbers are present

				// Corner case: first number is negative
				if (operation.charAt(0) == '-')
					i = 1;

				while (operation.charAt(i) != '+' && operation.charAt(i) != '-' && operation.charAt(i) != '*' && operation.charAt(i) != '/') {
					i++;
				}

				for (int k = 0; k < length; k++) {
					if (operation.charAt(k) == '.') // if a decimal value exists, update decimal to true
						decimal = true;
				}

				double x = Double.parseDouble(operation.substring(0, i)); // integer 1
				double y = Double.parseDouble(operation.substring(i + 1)); // integer 2

				// Perform the correct operation and update display with result
				// if there are no decimals, cast operation to int for cleaner look
				// Divison always returns a double
				if (operation.charAt(i) == '+') {
					if (decimal)
						operation = (x + y) + "";
					else
						operation = (int)(x + y) + "";
					
					display.setText(operation);
				}

				else if (operation.charAt(i) == '-') {
					if (decimal)
						operation = (x - y) + "";
					else
						operation = (int)(x - y) + "";
					
					display.setText(operation);
				}

				else if (operation.charAt(i) == '*') {
					if (decimal)
						operation = (x * y) + "";
					else
						operation = (int)(x * y) + "";
					
					display.setText(operation);
				}

				else {
					operation = (x / y) + "";
					display.setText(operation);
				}
			}
		}
	}
}
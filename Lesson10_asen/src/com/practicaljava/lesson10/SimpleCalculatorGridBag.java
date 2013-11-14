package com.practicaljava.lesson10;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculatorGridBag extends JApplet {
	
	private JTextField displayField;
	
	public void setDisplayValue(String val){
		displayField.setText(val);
	}
	
	public String getDisplayValue() {
		return displayField.getText();
	}
	
    public void cleanDisplayValue(){
        displayField.setText("");
    }
    
	public void init () {
	
		JPanel windowContent = new JPanel();
	
		// Set the GridBagLayout for the window’s content pane
		GridBagLayout gb = new GridBagLayout();
		windowContent.setLayout(gb);
	
		// Create an instance of the GridBagConstraints
		GridBagConstraints constr = new GridBagConstraints();

		//TEXT FIELD
		constr.gridx = 0; 
		constr.gridy = 0;
		constr.gridheight = 1;
		constr.gridwidth = 6;
		constr.insets = new Insets(0,5,10,5); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
	
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		displayField = new JTextField();
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		displayField.setEditable(false);
		
		// set constrains for this field
		gb.setConstraints(displayField,constr);

		//EMPTY CELL
		constr.gridx = 0; 
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,20,10,20); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JTextField emptyCell = new JTextField();
		emptyCell.setEditable(false);
	
		// set constrains
		gb.setConstraints(emptyCell,constr);		
		
		//BUTTON BACKSPACE
		constr.gridx = 1; 
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 2;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton backButton = new JButton("Backspace");
	
		// set constrains for this field
		gb.setConstraints(backButton,constr);

		//BUTTON CE
		constr.gridx = 3; 
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
	
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton ceButton = new JButton("CE");
	
		// set constrains for this field
		gb.setConstraints(ceButton,constr);		

		//BUTTON C
		constr.gridx = 4; 
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton cButton = new JButton("C");
	
		// set constrains for this field
		gb.setConstraints(cButton,constr);	

		//BUTTON MC
		constr.gridx = 0; 
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,20,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton mcButton = new JButton("MC");
	
		// set constrains for this field
		gb.setConstraints(mcButton,constr);	
		
		//BUTTON 7
		constr.gridx = 1; 
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton sevenButton = new JButton("7");
	
		// set constrains for this field
		gb.setConstraints(sevenButton,constr);	

		//BUTTON 8
		constr.gridx = 2; 
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton eightButton = new JButton("8");
	
		// set constrains for this field
		gb.setConstraints(eightButton,constr);
		
		//BUTTON 9
		constr.gridx = 3; 
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton nineButton = new JButton("9");
	
		// set constrains for this field
		gb.setConstraints(nineButton,constr);

		//BUTTON /
		constr.gridx = 4; 
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton divButton = new JButton("/");
	
		// set constrains for this field
		gb.setConstraints(divButton,constr);
		
		//BUTTON sqrt
		constr.gridx = 5; 
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton sqrtButton = new JButton("sqrt");
	
		// set constrains for this field
		gb.setConstraints(sqrtButton,constr);
		
		//BUTTON MH
		constr.gridx = 0; 
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,20,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton mhButton = new JButton("MH");
	
		// set constrains for this field
		gb.setConstraints(mhButton,constr);			

		//BUTTON 4
		constr.gridx = 1; 
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton fourButton = new JButton("4");
	
		// set constrains for this field
		gb.setConstraints(fourButton,constr);	

		//BUTTON 5
		constr.gridx = 2; 
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton fiveButton = new JButton("5");
	
		// set constrains for this field
		gb.setConstraints(fiveButton,constr);	
		
		//BUTTON 6
		constr.gridx = 3; 
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton sixButton = new JButton("6");
	
		// set constrains for this field
		gb.setConstraints(sixButton,constr);	

		//BUTTON *
		constr.gridx = 4; 
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton multButton = new JButton("*");
	
		// set constrains for this field
		gb.setConstraints(multButton,constr);	
		
		//BUTTON %
		constr.gridx = 5; 
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton procButton = new JButton("%");
	
		// set constrains for this field
		gb.setConstraints(procButton,constr);
		
		//BUTTON MS
		constr.gridx = 0; 
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,20,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton msButton = new JButton("MS");
	
		// set constrains for this field
		gb.setConstraints(msButton,constr);	

		//BUTTON 1
		constr.gridx = 1; 
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton oneButton = new JButton("1");
	
		// set constrains for this field
		gb.setConstraints(oneButton,constr);	

		//BUTTON 2
		constr.gridx = 2; 
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton twoButton = new JButton("2");
	
		// set constrains for this field
		gb.setConstraints(twoButton,constr);	
		
		//BUTTON 3
		constr.gridx = 3; 
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton threeButton = new JButton("3");
	
		// set constrains for this field
		gb.setConstraints(threeButton,constr);	

		//BUTTON -
		constr.gridx = 4; 
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton minButton = new JButton("-");
	
		// set constrains for this field
		gb.setConstraints(minButton,constr);	
		
		//BUTTON 1/x
		constr.gridx = 5; 
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton onedivxButton = new JButton("1/x");
	
		// set constrains for this field
		gb.setConstraints(onedivxButton,constr);	

		//BUTTON M+
		constr.gridx = 0; 
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,20,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton mplusButton = new JButton("M+");
	
		// set constrains for this field
		gb.setConstraints(mplusButton,constr);	

		//BUTTON 0
		constr.gridx = 1; 
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton zeroButton = new JButton("0");
	
		// set constrains for this field
		gb.setConstraints(zeroButton,constr);			

		//BUTTON +/-
		constr.gridx = 2; 
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton plusminButton = new JButton("+/-");
	
		// set constrains for this field
		gb.setConstraints(plusminButton,constr);
		
		//BUTTON .
		constr.gridx = 3; 
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton pointButton = new JButton(".");
	
		// set constrains for this field
		gb.setConstraints(pointButton,constr);
		
		//BUTTON +
		constr.gridx = 4; 
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton plusButton = new JButton("+");
	
		// set constrains for this field
		gb.setConstraints(plusButton,constr);
		
		//BUTTON =
		constr.gridx = 5; 
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.insets = new Insets(0,0,10,10); 
		
		// fill all space in the cell
		constr.fill = GridBagConstraints.BOTH;
	
		// proportion of horizontal space taken by this component
		constr.weightx = 1.0;
		
		
		// proportion of vertical space taken by this component
		constr.weighty = 1.0;
	
		// position of the component within the cell
		constr.anchor = GridBagConstraints.CENTER;
		JButton equalButton = new JButton("=");
	
		// set constrains for this field
		gb.setConstraints(equalButton,constr);
//////////////////////////////////////////////
		
		// add fields to the window
		windowContent.add(displayField);
		windowContent.add(emptyCell);
		windowContent.add(backButton);
		windowContent.add(ceButton);
		windowContent.add(cButton);
		windowContent.add(mcButton);
		windowContent.add(sevenButton);
		windowContent.add(eightButton);
		windowContent.add(nineButton);
		windowContent.add(sqrtButton);
		windowContent.add(divButton);
		windowContent.add(mhButton);
		windowContent.add(fourButton);
		windowContent.add(fiveButton);
		windowContent.add(sixButton);
		windowContent.add(multButton);
		windowContent.add(procButton);
		windowContent.add(msButton);
		windowContent.add(oneButton);
		windowContent.add(twoButton);
		windowContent.add(threeButton);
		windowContent.add(minButton);
		windowContent.add(onedivxButton);
		windowContent.add(mplusButton);
		windowContent.add(zeroButton);
		windowContent.add(plusminButton);
		windowContent.add(pointButton);
		windowContent.add(plusButton);
		windowContent.add(equalButton);
		add(windowContent);
		
		// Create the frame and add the panel to it 
		/*JFrame frame = new JFrame("My First Calculator");
		frame.setContentPane(windowContent);

		// set the size and display the window
		frame.setSize(400, 352);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		*/
		CalculatorEngine calcEngine = new CalculatorEngine(this);
		backButton.addActionListener(calcEngine);
		ceButton.addActionListener(calcEngine);
		cButton.addActionListener(calcEngine);
		mcButton.addActionListener(calcEngine);
		sevenButton.addActionListener(calcEngine);
		eightButton.addActionListener(calcEngine);
        nineButton.addActionListener(calcEngine);
        sqrtButton.addActionListener(calcEngine);
        divButton.addActionListener(calcEngine);
        mhButton.addActionListener(calcEngine);
        fourButton.addActionListener(calcEngine);
        fiveButton.addActionListener(calcEngine);
        sixButton.addActionListener(calcEngine);
        multButton.addActionListener(calcEngine);
        procButton.addActionListener(calcEngine);
        msButton.addActionListener(calcEngine);
        oneButton.addActionListener(calcEngine);
        twoButton.addActionListener(calcEngine);
        threeButton.addActionListener(calcEngine);
        minButton.addActionListener(calcEngine);
        onedivxButton.addActionListener(calcEngine);
        mplusButton.addActionListener(calcEngine);
        zeroButton.addActionListener(calcEngine);
        plusminButton.addActionListener(calcEngine);
        pointButton.addActionListener(calcEngine);
        plusButton.addActionListener(calcEngine);
        equalButton.addActionListener(calcEngine);
	}
/*
public static void main(String[] args) {

	new SimpleCalculatorGridBag();
}*/

}

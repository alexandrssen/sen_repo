package com.practicaljava.lesson17;

import javax.swing.*;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.Font;

public class MyCustomizableGUI extends JFrame implements ActionListener{

	JPanel windowContent;
	JTextField displayField;
	JButton buttPreferences;
	JFrame frame;
	JDialog prefDialog;
	JButton buttSave;
	JButton buttCancel;
	JComboBox colorCombo;
	JComboBox fontCombo;
	JComboBox fsizeCombo;
	String inputColor = "Black"; 
	String inputFont = "Arial";
	String inputFontSize = "12";
	

	private MyCustomizableGUI() {
		windowContent = new JPanel();
		BoxLayout box = new BoxLayout(windowContent, BoxLayout.Y_AXIS);
		windowContent.setLayout(box);


		
		displayField = new JTextField(30);
		windowContent.add(displayField);
		
		loadPreferences();
		
		setPreferences();
		
		
		buttPreferences = new JButton("User Preferences");
		windowContent.add(buttPreferences);
		
		buttPreferences.addActionListener(this);
		
        //Create the frame and set its content pane	               
        frame = new JFrame("Customizable widow");
        frame.setContentPane(windowContent);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
        // Set the size of the window to be big enough to accommodate all controls 		
        frame.pack(); 

        // Display the window
        frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String[] colors = {"Black","Red","Green"};
		String[] fonts = {"Arial", "Times New Roman", "Helvetica"};
		String[] fontSize = {"12", "18", "25", "40", "64"};
		
		prefDialog = new JDialog(frame, "User Preferences", true);
		
		prefDialog.setLayout(new GridLayout(4,2));
		
		colorCombo = new JComboBox(colors);
		prefDialog.add(new JLabel("Color:"));
		prefDialog.add(colorCombo);

		fontCombo = new JComboBox(fonts);
		prefDialog.add(new JLabel("Font:"));
		prefDialog.add(fontCombo);
		
		fsizeCombo = new JComboBox(fontSize);
		prefDialog.add(new JLabel("Font Size:"));
		prefDialog.add(fsizeCombo);
		
		buttSave = new JButton("Save");
		prefDialog.add(buttSave);
		
		buttCancel = new JButton("Cancel");
		prefDialog.add(buttCancel);
		
		prefDialog.pack();
		prefDialog.setResizable(false);


		buttSave.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent eCancel) {
				
				inputColor = (String) colorCombo.getSelectedItem(); 
				inputFont = (String) fontCombo.getSelectedItem(); 
				inputFontSize = (String) fsizeCombo.getSelectedItem(); 
				savePreferences();
				setPreferences();
				prefDialog.setVisible(false);
			}
		  }
		  );

		buttCancel.addActionListener (new ActionListener () {
										public void actionPerformed(ActionEvent eCancel) {
											prefDialog.setVisible(false);
										}
									  }
									  );
		prefDialog.setVisible(true);
	}
	
	private void savePreferences(){
		Preferences userPreference = new Preferences();
		
		userPreference.savedColor = inputColor;
		userPreference.savedFont = inputFont;
		userPreference.savedFsize = inputFontSize;
		
		FileOutputStream fOut=null;
	    ObjectOutputStream oOut=null;
	    
	    try{   
	     fOut = new  FileOutputStream("preferences.ser");

	     oOut = new ObjectOutputStream(fOut);

	     oOut.writeObject(userPreference);
	   } catch (IOException e){
		  try{ 
	        oOut.flush();
	        oOut.close();
	        fOut.close();
		  }catch (IOException ioe){
			  ioe.printStackTrace();
		  }
	   }  

	}
	
	private void loadPreferences(){
		FileInputStream fIn = null;
	    ObjectInputStream oIn = null;
	    Preferences userPreference = null;
		String fileName = "preferences.ser";
	    
	    File f = new File(fileName);
	    
	    if(f.exists()) { 
	    	try{   
	    		fIn = new  FileInputStream(fileName);

	    		oIn = new ObjectInputStream(fIn);

	    		userPreference=(Preferences)oIn.readObject();
	        
	    		inputColor = userPreference.savedColor;
	    		inputFont = userPreference.savedFont;
	    		inputFontSize = userPreference.savedFsize;
	        	        
	    	}catch (ClassNotFoundException cnf){
	    		cnf.printStackTrace();
	    	} catch (IOException e){
	    		try{ 
	    			oIn.close();
	           		fIn.close();
	    		}catch (IOException ioe){
	    			ioe.printStackTrace();
	    		}
	    	}finally{
	    		if (oIn != null){
	    			try{ 
	    				oIn.close();
	    				fIn.close();
	    			}catch (IOException e1){
	    				e1.printStackTrace();
	    			}
	    		}  
	    	}
	    }
	}
	
	private void setPreferences(){
		
		Font newFont;
		Color newColor = null;
		
		newFont = new Font(inputFont, Font.BOLD, Integer.parseInt(inputFontSize));

		
		switch (inputColor) {
			case "Black":
				newColor = Color.black;
				break;
			case "Red":
				newColor = Color.red;
				break;
			case "Green":
				newColor = Color.green;
				break;	
		}
		

		displayField.setFont(newFont);
		displayField.setForeground(newColor);
	}
	
	public static void main(String[] args) {
		new MyCustomizableGUI();
		}
	

}

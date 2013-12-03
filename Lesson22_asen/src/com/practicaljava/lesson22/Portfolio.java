package com.practicaljava.lesson22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class Portfolio implements Runnable {

	//Interacting with Database
	private Connection conn = null;
	private Statement statement = null;
	private ResultSet res = null;
	//Portfolio columns
	private String id; 
	private String symbol;
	private String quantity; 
	private String price;
	private String total;
	//Column names
	private final String idColName = "ID";
	private final String symbolColName = "SYMBOL";
	private final String quantityColName = "QUANTITY";
	private final String priceColName = "PRICE";
	private final String totalColName = "TOTAL";
	//Output attributes
	private int idWidth;
	private int symbolWidth;
	private int quantityWidth;
	private int priceWidth;
	private int totalWidth;
	private int idWidthMax;
	private int symbolWidthMax;
	private int quantityWidthMax;
	private int priceWidthMax;
	private int totalWidthMax;	
	//Header for nice output
	String header;
	String line;
	   
	public void run() {
	    
		try {
			//Connect
			conn = DriverManager.getConnection( "jdbc:derby://localhost:1527/Lesson22");
		
			//Build statement
			String sqlQuery = "SELECT "+idColName+", "+symbolColName+", "+quantityColName+", "+priceColName+", "+quantityColName+"*"+priceColName+" "+totalColName+" from portfolio"; 
			statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
			
			// Execute statement
		    res = statement.executeQuery(sqlQuery); 
		    
		    //Get max width for output as table
		    
	    	idWidthMax = idColName.length(); 
	    	symbolWidthMax = symbolColName.length();
	    	quantityWidthMax = quantityColName.length();
	    	priceWidthMax = priceColName.length();
	    	totalWidthMax = totalColName.length();
	    	
		    while (res.next()){ 
		    	idWidth = String.valueOf(res.getInt(idColName)).length();
		    	if (idWidth>idWidthMax) {idWidthMax = idWidth;};
		    	symbolWidth = (res.getString(symbolColName)).length();
		    	if (symbolWidth>symbolWidthMax) {symbolWidthMax = symbolWidth;};
		    	quantityWidth = (res.getString(quantityColName)).length();
		    	if (quantityWidth>quantityWidthMax) {quantityWidthMax = quantityWidth;};
		    	priceWidth = String.valueOf(res.getInt(priceColName)).length();
		    	if (priceWidth>priceWidthMax) {priceWidthMax = priceWidth;};
		    	totalWidth = String.valueOf(res.getInt(totalColName)).length();
		    	if (totalWidth>totalWidthMax) {totalWidthMax = totalWidth;};
		    }
		    
		    // Output header
		    System.out.println("");
		    System.out.println("PORTFOLIO TABLE");
		    System.out.println("");
		    
		    header = "|"+ wrapOut("ID", idWidthMax) + " |" + wrapOut("SYMBOL", symbolWidthMax) + " |" + wrapOut("QUANTITY", quantityWidthMax) + " |" + wrapOut("PRICE", priceWidthMax) + " |" + wrapOut("TOTAL",totalWidthMax) + " |";
		    line = getLine(header.length());
		    System.out.println(line);
		    System.out.println(header);
		    System.out.println(line);
		    
		    // Output the result set
		    if (res.first()) {
		    	do { 
		    		id = String.valueOf(res.getInt(idColName));
		    		symbol = res.getString(symbolColName);
		    		quantity = res.getString(quantityColName);
		    		price = String.valueOf(res.getInt(priceColName));
		    		total = String.valueOf(res.getInt(totalColName));
		    		System.out.println("|"+ wrapOut(id, idWidthMax) + " |" + wrapOut(symbol, symbolWidthMax) + " |" + wrapOut(quantity, quantityWidthMax) + " |" + wrapOut(price, priceWidthMax) + " |" + wrapOut(total,totalWidthMax) + " |"); 
		    	} while (res.next());
		    }
		    
		    System.out.println(line);
		    
		} catch( SQLException se ) {
			      System.out.println ("SQLError: " + se.getMessage ()
			           + " code: " + se.getErrorCode ());
		} catch( Exception e ) {
			      System.out.println(e.getMessage()); 
			      e.printStackTrace(); 
		} finally{
			       // clean up the system resources
			       try{
				   res.close();     
				   statement.close(); 
				   conn.close();  
			       } catch(Exception e){
			           e.printStackTrace();
			       } 
		}
	
	}
	
	private static String wrapOut(String inValue, int width) {
		String outValue;
		
		outValue = inValue;
		
		while (outValue.length()!=width) {
			outValue = outValue + " ";
		}
		
		return outValue;
	}

	private String getLine(int lineLength) {
		String OutLine = "";
		while (OutLine.length()!=lineLength) {
			OutLine = OutLine + "-";
		}
		return OutLine;
	}
	
}

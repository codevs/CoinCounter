/*FileWriter.java
 * 
 * By: Alex Vasilenko
 * 
 * Free to use
 * */


package counter.gui;

import counter.coins.Coins;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;


public class FileWrite {
	private final String fileExtention = ".cdp";
	private String fileName;
	private String errorFileName = "errorLog.err";
	private final String dirName = "data";
	
	
	private File file = null;
	private static File errorFile = null;
	
	private FileWriter writer = null;
	private static FileWriter errorWriter = null;
	private Scanner input = null;
	
	private Coins coins = null;
	
	
	public FileWrite(String fileName, Coins coins){
		this.coins = coins;
		this.fileName = fileName;
		file =  openFile();
		errorFile = openErrorFile();
		readData();
		coins.updateValues();
	}
	
	private File openFile(){
		file = new File(dirName + File.separator + fileName + fileExtention);
		checkFile();
		return file;
	}
	
	private File openErrorFile(){
		errorFile = new File(dirName + File.separator + errorFileName);
		checkErrorFile();
		return errorFile;
	}
	
	private void checkFile(){
		if(!file.exists()){
			createFile();
			writeData();
		}else if(file.length() > 40){
			file.delete();
			createFile();
			writeData();
		}
	}
	
	private void checkErrorFile(){
		if(!errorFile.exists()){
			createErrorFile();
		}
	}
	
	private void createFile(){
		try{
			file.getParentFile().mkdirs();
			file.createNewFile();
		}catch(IOException e){
			writeErrorData("Creating file error " + e.toString());
		}
		checkFile();
	}
	
	private void createErrorFile(){
		try {
			errorFile.getParentFile().mkdirs();
			errorFile.createNewFile();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error creating errorLog");
		}
	}
	
	
	public void read(){
		readData();
	}
	
	private void readData(){
		coins.checkValues();
		try {
			input = new Scanner(file);
			coins.setNumberofPennies(input.nextInt());
			coins.setNumberofNickels(input.nextInt());
			coins.setNumberofDimes(input.nextInt());
			coins.setNumberofQuartars(input.nextInt());
			coins.setNumberofHalfDollars(input.nextInt());
			coins.setNumberofDollarCoins(input.nextInt());
			input.close();
		}catch (FileNotFoundException e) {
			writeErrorData("Data read error " + e.toString());
		}
	}
	
	
	public void save(){
		writeData();
	}
	
	private void writeData(){
		coins.checkValues();
		try {
			writer = new FileWriter(file);
			writer.write(Integer.toString(coins.getNumberofPennies()) + "\n");
			writer.write(Integer.toString(coins.getNumberofNickels()) + "\n");
			writer.write(Integer.toString(coins.getNumberofDimes()) + "\n");
			writer.write(Integer.toString(coins.getNumberQuarters()) + "\n");
			writer.write(Integer.toString(coins.getNumberofHalfDollars()) + "\n");
			writer.write(Integer.toString(coins.getNumberofDollarCoins()) + "\n");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			writeErrorData("Data write error " + e.toString());
		}
	}
	
	private static void writeErrorData(String e){
		try {
			errorWriter = new FileWriter(errorFile, true);
			errorWriter.write(getCurrentTimeStamp()  + ": " + e + "\n");
			errorWriter.flush();
			errorWriter.close();
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(null, "Error writing to errorLog");
		}
	}
	
	private static String getCurrentTimeStamp() {
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
	}
	
	
	
}//END OF CLASS
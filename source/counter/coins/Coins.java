package counter.coins;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Coins {
	
	private int numberofPennies = 0;
	private int numberofNickels = 0;
	private int numberofDimes = 0;
	private int numberofQuatars = 0;
	private int numberofHalfDollars = 0;
	private int numberofDollarCoins = 0;
	
	private int totalCoins = updateTotalCoins();
	
	private final double pennyValue = 0.01;
	private final double nickelValue = 0.05;
	private final double dimeValue = 0.10;
	private final double quarterValue = 0.25;
	private final double haldDollarValue = 0.50;
	private final double dollarCoinValue = 1.00;
	
	private double totalValue = roundTwoDecimals(updateTotalValue());
	private String totalValueString = updateTotalStringValue(totalValue);
	private double totalValueWithFee = getFee();
	
	private static final char dollarSymbol = (char) 36;
	
	
	
	double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
	}
	
	
	
	
	public void clear(){
		int reply = JOptionPane.showConfirmDialog(null, "Clear all coins?", "Clear", JOptionPane.YES_NO_OPTION);
		if(reply == JOptionPane.YES_OPTION){
			numberofPennies = 0;
			numberofNickels = 0;
			numberofDimes = 0;
			numberofQuatars = 0;
			numberofHalfDollars = 0;
			numberofDollarCoins = 0;
		}
	}
	
	public void checkValues(){
		if(numberofPennies < 0){
			numberofPennies = 0;
		}
		if(numberofNickels < 0){
			numberofNickels = 0;
		}
		if(numberofDimes < 0){
			numberofDimes = 0;
		}
		if(numberofQuatars < 0){
			numberofQuatars = 0;
		}
		if(numberofHalfDollars < 0){
			numberofHalfDollars = 0;
		}
		if(numberofDollarCoins < 0){
			numberofDollarCoins = 0;
		}
	}
	
	public void updateValues(){
		totalCoins = updateTotalCoins();
		totalValue = roundTwoDecimals(updateTotalValue());
		totalValueString = updateTotalStringValue(totalValue);
	}
	
	private int updateTotalCoins(){
		return totalCoins = numberofPennies + numberofNickels 
				+ numberofDimes + numberofQuatars 
				+ numberofHalfDollars + numberofDollarCoins;
	}
	
	private double updateTotalValue(){
		return roundTwoDecimals(getTotalValueOfPennies()) 
				+ roundTwoDecimals(getTotalValueOfKickels())
				+ roundTwoDecimals(getTotalValueOfDimes()) 
				+ roundTwoDecimals(getTotalValueOfQuatars())
				+ roundTwoDecimals(getTotalValueOfHalfDollars()) 
				+ roundTwoDecimals(getTotalValueOfDollarCoins());
	}
	
	public void showFee(){
		totalValueWithFee = getFee();
		JOptionPane.showMessageDialog(null, String.format("$%.2f", totalValueWithFee));
	}
	
	private double getFee(){
		return totalValue * 0.98;
	}
	
	
	
	private String updateTotalStringValue(double value){
		return String.format("%.2f", value);
	}
	

	public double getTotalValueOfPennies(){
		return roundTwoDecimals(numberofPennies * pennyValue);
	}
	
	public double getTotalValueOfKickels(){
		return roundTwoDecimals(numberofNickels * nickelValue);
	}
	
	public double getTotalValueOfDimes(){
		return roundTwoDecimals(numberofDimes * dimeValue);
	}
	
	public double getTotalValueOfQuatars(){
		return roundTwoDecimals(numberofQuatars * quarterValue);
	}
	
	public double getTotalValueOfHalfDollars(){
		return roundTwoDecimals(numberofHalfDollars * haldDollarValue);
	}
	
	public double getTotalValueOfDollarCoins(){
		return roundTwoDecimals(numberofDollarCoins * dollarCoinValue);
	}
	
	
	
	
	public char getDollarSymbol(){
		return dollarSymbol;
	}
	
	public int getTotalCoins(){
		return totalCoins;
	}
	
	public double getTotalValue(){
		return totalValue;
	}
	
	
	
	public int getNumberofPennies() {
		return numberofPennies;
	}
	
	public double getPennyValue() {
		return pennyValue;
	}
	
	public double getNickelValue() {
		return nickelValue;
	}
	
	public double getDimeValue() {
		return dimeValue;
	}
	
	public double getQuarterValue() {
		return quarterValue;
	}
	
	public double getHaldDollarValue() {
		return haldDollarValue;
	}
	
	public double getDollarCoinValue() {
		return dollarCoinValue;
	}
	
	
	
	public int getNumberofNickels() {
		return numberofNickels;
	}
	
	public int getNumberofDimes() {
		return numberofDimes;
	}
	
	public int getNumberQuarters() {
		return numberofQuatars;
	}
	
	public int getNumberofHalfDollars() {
		return numberofHalfDollars;
	}
	
	public int getNumberofDollarCoins() {
		return numberofDollarCoins;
	}
	
	public String getTotalValueString(){
		return totalValueString;
	}
	
	
	
	public void setNumberofPennies(int numberofPennies) {
		this.numberofPennies = numberofPennies;
	}

	public void setNumberofNickels(int numberofNickels) {
		this.numberofNickels = numberofNickels;
	}

	public void setNumberofDimes(int numberofDimes) {
		this.numberofDimes = numberofDimes;
	}

	public void setNumberofQuartars(int numberofQuatars) {
		this.numberofQuatars = numberofQuatars;
	}

	public void setNumberofHalfDollars(int numberofHalfDollars) {
		this.numberofHalfDollars = numberofHalfDollars;
	}

	public void setNumberofDollarCoins(int numberofDollarCoins) {
		this.numberofDollarCoins = numberofDollarCoins;
	}
	
	
	
}

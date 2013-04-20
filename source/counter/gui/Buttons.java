package counter.gui;

import javax.swing.JButton;


public class Buttons{
	
	
	private JButton addPenny, removePenny,
					addNickel, removeNickel, 
					addDime, removeDime,
					addQuarter, removeQuarter, 
					addHalfDollar, removeHalfDollar,
					addDollarCoin, removeDollarCoin,
					clearButton, coinStar;
	
	private final int buttonWidth = 100, buttonHeight = 40;
	
	public Buttons(){
		makePennies();
		makeNickels();
		makeDimes();
		makeQuarters();
		makeHalfDollars();
		makeDollarCoins();
		makeClearButton();
		makeCoinStar();
	}

	private void makePennies() {
		addPenny = new JButton("+ $0.01");
		addPenny.setSize(buttonWidth, buttonHeight);
		addPenny.setLocation(50, 100);
		addPenny.addActionListener(Actions.addPennyPressed());
		
		removePenny = new JButton("- $0.01");
		removePenny.setSize(buttonWidth, buttonHeight);
		removePenny.setLocation(50, 200);
		removePenny.addActionListener(Actions.removePennyPressed());
	}
	
	private void makeNickels(){
		addNickel = new JButton("+ $0.05");
		addNickel.setSize(buttonWidth, buttonHeight);
		addNickel.setLocation(160, 100);
		addNickel.addActionListener(Actions.addNickelPressed());
		
		removeNickel = new JButton("- $0.05");
		removeNickel.setSize(buttonWidth, buttonHeight);
		removeNickel.setLocation(160, 200);
		removeNickel.addActionListener(Actions.removeNickelPressed());
	}
	
	private void makeDimes(){
		addDime = new JButton("+ $0.10");
		addDime.setSize(buttonWidth, buttonHeight);
		addDime.setLocation(270, 100);
		addDime.addActionListener(Actions.addDimePressed());
		
		removeDime = new JButton("- $0.10");
		removeDime.setSize(buttonWidth, buttonHeight);
		removeDime.setLocation(270, 200);
		removeDime.addActionListener(Actions.removeDimePressed());
	}
	
	private void makeQuarters(){
		addQuarter = new JButton("+ $0.25");
		addQuarter.setSize(buttonWidth, buttonHeight);
		addQuarter.setLocation(380,100);
		addQuarter.addActionListener(Actions.addQuatarPressed());
		
		removeQuarter = new JButton("- $0.25");
		removeQuarter.setSize(buttonWidth, buttonHeight);
		removeQuarter.setLocation(380, 200);
		removeQuarter.addActionListener(Actions.removeQuatarPressed());
	}
	
	private void makeHalfDollars(){
		addHalfDollar = new JButton("+ $0.50");
		addHalfDollar.setSize(buttonWidth, buttonHeight);
		addHalfDollar.setLocation(490, 100);
		addHalfDollar.addActionListener(Actions.addHalfDollarPressed());
		
		removeHalfDollar = new JButton("- $0.50");
		removeHalfDollar.setSize(buttonWidth, buttonHeight);
		removeHalfDollar.setLocation(490, 200);
		removeHalfDollar.addActionListener(Actions.removeHalfDollarPressed());
	}
	
	private void makeDollarCoins(){
		addDollarCoin = new JButton("+ $1.00");
		addDollarCoin.setSize(buttonWidth, buttonHeight);
		addDollarCoin.setLocation(600, 100);
		addDollarCoin.addActionListener(Actions.addDollarCoinPressed());
		
		removeDollarCoin = new JButton("- $1.00");
		removeDollarCoin.setSize(buttonWidth, buttonHeight);
		removeDollarCoin.setLocation(600, 200);
		removeDollarCoin.addActionListener(Actions.removeDollarCoinPressed());
	}
	
	private void makeClearButton(){
		clearButton = new JButton("Clear");
		clearButton.setSize(70, 60);
		clearButton.setLocation(630, 270);
		clearButton.addActionListener(Actions.clearPressed());
	}
	
	private void makeCoinStar(){
		coinStar = new JButton("CoinStar");
		coinStar.setSize(100, 60);
		coinStar.setLocation(500, 270);
		coinStar.addActionListener(Actions.coinStarPressed());
	}

	public JButton getAddPenny() {
		return addPenny;
	}

	public JButton getRemovePenny() {
		return removePenny;
	}

	public JButton getAddNickel() {
		return addNickel;
	}

	public JButton getRemoveNickel() {
		return removeNickel;
	}

	public JButton getAddDime() {
		return addDime;
	}

	public JButton getRemoveDime() {
		return removeDime;
	}

	public JButton getAddQuarter() {
		return addQuarter;
	}

	public JButton getRemoveQuarter() {
		return removeQuarter;
	}

	public JButton getAddHalfDollar() {
		return addHalfDollar;
	}

	public JButton getRemoveHalfDollar() {
		return removeHalfDollar;
	}

	public JButton getAddDollarCoin() {
		return addDollarCoin;
	}

	public JButton getRemoveDollarCoin() {
		return removeDollarCoin;
	}
	
	public JButton getClearButton(){
		return clearButton;
	}
	
	public JButton getCoinStar(){
		return coinStar;
	}
	
	
	
}//END OF CLASS
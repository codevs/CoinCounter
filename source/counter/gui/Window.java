package counter.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import counter.coins.Coins;

public class Window{
	private String title = null;
	private String version = null;
	
	private final int height = 500;
	private final int width = 750;
	
	private JFrame frame = null;
	private JPanel buttonPannel = null;
	
	private JLabel versionLabel, pennyAmmount,
				   nickelAmmount, dimeAmmount, 
				   quarterAmmount, halfDollarAmmount, 
				   dollarCoinAmmount, totalCoins, totalMoney, 
				   creator, titleLabel, pennyValue, nickelValue, 
				   dimeValue, quarterValue, halfDollarValue,
				   dollarCoinValue;
	
	private Coins coins = null;
	private Buttons buttons = null;
	
	
	public Window(String title, String version, Coins coins, Buttons buttons){
		this.buttons = buttons;
		this.coins = coins;
		this.title = title;
		this.version = version;
	}
	
	
	public void createWindow(){
		createFrame();
		createLabels();
		addLabels();
		addButtons();
		frame.setVisible(true);
		buttonPannel.setVisible(true);
	}
	
	private void createFrame(){
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setLocation(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		
		buttonPannel = new JPanel();
		buttonPannel.setSize(width, height);
		buttonPannel.setLocation(0, 0);
		buttonPannel.setLayout(null);
		buttonPannel.setBackground(Color.WHITE);
		
		frame.add(buttonPannel);
	}
	
	private void addButtons(){
		buttonPannel.add(buttons.getAddPenny());
		buttonPannel.add(buttons.getRemovePenny());
		buttonPannel.add(buttons.getAddNickel());
		buttonPannel.add(buttons.getRemoveNickel());
		buttonPannel.add(buttons.getAddDime());
		buttonPannel.add(buttons.getRemoveDime());
		buttonPannel.add(buttons.getAddQuarter());
		buttonPannel.add(buttons.getRemoveQuarter());
		buttonPannel.add(buttons.getAddHalfDollar());
		buttonPannel.add(buttons.getRemoveHalfDollar());
		buttonPannel.add(buttons.getAddDollarCoin());
		buttonPannel.add(buttons.getRemoveDollarCoin());
		buttonPannel.add(buttons.getClearButton());
		buttonPannel.add(buttons.getCoinStar());
	}
	
	private void createLabels(){
		makeVersionLabel();
		makePennyAmmount();
		makeNickelAmmount();
		makeDimeAmmount();
		makeQuarterAmmount();
		makeHalfDollarAmmount();
		makeDollarCoinAmmount();
		makeTotalCoins();
		makeTotalMoney();
		makeCreator();
		makeTitleLabel();
		makePennyValue();
		makeNickelValue();
		makeDimeValue();
		makeQuarterValue();
		makeHalfDollarValue();
		makeDollarValue();
		
	}
	
	
	private void addLabels(){
		buttonPannel.add(versionLabel);
		buttonPannel.add(pennyAmmount);
		buttonPannel.add(nickelAmmount);
		buttonPannel.add(dimeAmmount);
		buttonPannel.add(quarterAmmount);
		buttonPannel.add(halfDollarAmmount);
		buttonPannel.add(dollarCoinAmmount);
		buttonPannel.add(totalCoins);
		buttonPannel.add(totalMoney);
		buttonPannel.add(creator);
		buttonPannel.add(titleLabel);
		buttonPannel.add(pennyValue);
		buttonPannel.add(nickelValue);
		buttonPannel.add(dimeValue);
		buttonPannel.add(quarterValue);
		buttonPannel.add(halfDollarValue);
		buttonPannel.add(dollarCoinValue);
	}
	
	
	private void makeVersionLabel(){
		versionLabel = new JLabel(version);
		versionLabel.setSize(70, 10);
		versionLabel.setLocation(10, 450);
	}
	
	private void makePennyAmmount(){
		String ammount = Integer.toString(coins.getNumberofPennies()) + ": Pennies";
		pennyAmmount = new JLabel(ammount);
		pennyAmmount.setSize(90, 10);
		pennyAmmount.setLocation(50, 155);
	}
	
	private void makeNickelAmmount(){
		String ammount = Integer.toString(coins.getNumberofNickels()) + ": Nickels";
		nickelAmmount = new JLabel(ammount);
		nickelAmmount.setSize(90, 10);
		nickelAmmount.setLocation(160, 155);
	}
	
	private void makeDimeAmmount() {
		String ammount = Integer.toString(coins.getNumberofDimes()) + ": Dimes";
		dimeAmmount = new JLabel(ammount);
		dimeAmmount.setSize(90, 10);
		dimeAmmount.setLocation(270, 155);
	}
	
	private void makeQuarterAmmount() {
		String ammount = Integer.toString(coins.getNumberQuarters()) + ": Quarters";
		quarterAmmount = new JLabel(ammount);
		quarterAmmount.setSize(90, 10);
		quarterAmmount.setLocation(380, 155);
	}
	
	private void makeHalfDollarAmmount(){
		String ammount = Integer.toString(coins.getNumberofHalfDollars()) + ": Half Dollars";
		halfDollarAmmount = new JLabel(ammount);
		halfDollarAmmount.setSize(90, 10);
		halfDollarAmmount.setLocation(490, 155);
	}
	
	private void makeDollarCoinAmmount(){
		String ammount = Integer.toString(coins.getNumberofDollarCoins()) + ": Dollar Coins";
		dollarCoinAmmount = new JLabel(ammount);
		dollarCoinAmmount.setSize(90, 10);
		dollarCoinAmmount.setLocation(600, 155);
	}
	
	private void makeTotalCoins(){
		String ammount = "Total Coins: " + Integer.toString(coins.getTotalCoins());
		totalCoins = new JLabel(ammount);
		totalCoins.setSize(100, 15);
		totalCoins.setLocation(50, 270);
	}
	
	private void makeTotalMoney(){
		String ammount = "Total Money: " + coins.getDollarSymbol() +  coins.getTotalValueString();
		totalMoney = new JLabel(ammount);
		totalMoney.setSize(150, 15);
		totalMoney.setLocation(50, 290);
	}
	
	
	private void makePennyValue(){
		String ammount = "Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfPennies());
		pennyValue = new JLabel(ammount);
		pennyValue.setSize(90, 10);
		pennyValue.setLocation(50, 170);
	}
	
	private void makeNickelValue(){
		String ammount = "Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfKickels());
		nickelValue = new JLabel(ammount);
		nickelValue.setSize(90, 10);
		nickelValue.setLocation(160, 170);
	}
	
	private void makeDimeValue(){
		String ammount = "Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfDimes());
		dimeValue = new JLabel(ammount);
		dimeValue.setSize(90, 10);
		dimeValue.setLocation(270, 170);
	}
	
	private void makeQuarterValue(){
		String ammount = "Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfQuatars());
		quarterValue = new JLabel(ammount);
		quarterValue.setSize(90, 10);
		quarterValue.setLocation(380, 170);
	}
	
	private void makeHalfDollarValue(){
		String ammount = "Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfHalfDollars());
		halfDollarValue = new JLabel(ammount);
		halfDollarValue.setSize(90, 10);
		halfDollarValue.setLocation(490, 170);
	}
	
	private void makeDollarValue(){
		String ammount = "Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfDollarCoins());
		dollarCoinValue = new JLabel(ammount);
		dollarCoinValue.setSize(90, 10);
		dollarCoinValue.setLocation(600, 170);
	}
	
	
	private void makeCreator(){
		creator = new JLabel("By: Alex Vasilenko");
		creator.setSize(200, 15);
		creator.setLocation(620, 450);
	}
	
	private void makeTitleLabel(){
		Font font = new Font("sansserif", Font.BOLD, 42);
		titleLabel = new JLabel(title);
		titleLabel.setFont(font);
		titleLabel.setLocation(250, 10);
		titleLabel.setSize(300, 50);
	}
	
	public void update(){
		coins.updateValues();
		pennyAmmount.setText(Integer.toString(coins.getNumberofPennies()) + ": Pennies");
		nickelAmmount.setText(Integer.toString(coins.getNumberofNickels()) + ": Nickels");
		dimeAmmount.setText(Integer.toString(coins.getNumberofDimes()) +  ": Dimes");
		quarterAmmount.setText(Integer.toString(coins.getNumberQuarters()) + ": Quarters");
		halfDollarAmmount.setText(Integer.toString(coins.getNumberofHalfDollars()) + ": Half Dollars");
		dollarCoinAmmount.setText(Integer.toString(coins.getNumberofDollarCoins()) + ": Dollar Coins");
		totalCoins.setText("Total Coins: " + Integer.toString(coins.getTotalCoins()));
		totalMoney.setText("Total Money: " + coins.getDollarSymbol() + coins.getTotalValueString());
		
		pennyValue.setText("Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfPennies()));
		nickelValue.setText("Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfKickels()));
		dimeValue.setText("Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfDimes()));
		quarterValue.setText("Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfQuatars()));
		halfDollarValue.setText("Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfHalfDollars()));
		dollarCoinValue.setText("Value: " + coins.getDollarSymbol() + String.format("%.2f", coins.getTotalValueOfDollarCoins()));
	}
}//END OF CLASS

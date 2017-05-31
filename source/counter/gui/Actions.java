// Actions.java
// Aleksandr Vasilenko

package counter.gui;

import counter.coins.Coins;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actions {
	private static FileWrite write = null;
	private static Window window = null;
	private static Coins coin = null;
	
	public Actions(FileWrite write, Window window, Coins coin){
		Actions.coin = coin;
		Actions.write = write;
		Actions.window = window;
	}
	
	public static ActionListener addPennyPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofPennies() + 1;
				coin.setNumberofPennies(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener removePennyPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofPennies() - 1;
				coin.setNumberofPennies(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener addNickelPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofNickels() + 1;
				coin.setNumberofNickels(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener removeNickelPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofNickels() - 1;
				coin.setNumberofNickels(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener addDimePressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofDimes() + 1;
				coin.setNumberofDimes(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener removeDimePressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofDimes() - 1 ;
				coin.setNumberofDimes(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener addQuatarPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberQuarters() + 1 ;
				coin.setNumberofQuartars(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener removeQuatarPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberQuarters() - 1 ;
				coin.setNumberofQuartars(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener addHalfDollarPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofHalfDollars() + 1 ;
				coin.setNumberofHalfDollars(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener removeHalfDollarPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofHalfDollars() - 1 ;
				coin.setNumberofHalfDollars(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener addDollarCoinPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofDollarCoins() + 1 ;
				coin.setNumberofDollarCoins(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener removeDollarCoinPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				int change = coin.getNumberofDollarCoins() - 1 ;
				coin.setNumberofDollarCoins(change);
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener clearPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				coin.clear();
				write.save();
				window.update();
			}
		};
		return action;
	}
	
	public static ActionListener coinStarPressed(){
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write.read();
				coin.showFee();
				write.save();
				window.update();
			}
		};
		return action;
	}
}//END OF CLASS

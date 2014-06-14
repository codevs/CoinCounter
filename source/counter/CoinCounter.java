package counter;

import counter.coins.Coins;
import counter.gui.FileWrite;
import counter.gui.Window;
import counter.gui.Buttons;
import counter.gui.Actions;

public class CoinCounter {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Coins coins = new Coins();
		FileWrite writer = new FileWrite(coins);
		Buttons buttons = new Buttons();
		Window window = new Window("Coin Counter", "v1.1.2", coins, buttons);
		Actions actions =  new Actions(writer, window, coins);
		window.createWindow();
	}

}

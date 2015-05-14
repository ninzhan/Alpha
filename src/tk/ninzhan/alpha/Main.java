package tk.ninzhan.alpha;

import javax.swing.JFrame;

import tk.ninzhan.alpha.display.Frame;

public class Main {

	public static void main(String...args){
		Frame game = new Frame();
		game.setSize(500,500);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		game.setVisible(true);
		}
	
}

package tk.ninzhan.alpha.display;

import javax.swing.JFrame;

public class Frame extends JFrame{

	private static final long serialVersionUID = -7305378906841580190L;
	GameComponent game  = new GameComponent();
	public Frame(){
		super("Beta");
		this.add(game);
	}
}

package tk.ninzhan.alpha.display;

import java.awt.Graphics;

import javax.swing.JComponent;

import tk.ninzhan.alpha.generation.Map;

public class GameComponent extends JComponent {

	private static final long serialVersionUID = -6660284633050243524L;

	Map here  = new Map();
	public GameComponent(){
		
	}
	@Override
	public void paint(Graphics g){
		here.paint(g, this);
	}
}

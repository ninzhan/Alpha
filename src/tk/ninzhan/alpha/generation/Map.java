package tk.ninzhan.alpha.generation;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.util.HashMap;



public class Map extends HashMap<Point, Chunk>{
	
	private static final long serialVersionUID = 5379078020482135288L;

	
	public Map(){
		preGenerate(5);
	}
	private void preGenerate(int i){
		for(int y = i; y >= 0; y --){
			for(int x = i; i >= 0; x--){
				Point here = new Point(x-(i/2), y-(i/2));
				this.put(here , new Chunk(here, Terrain.Forest, Terrain.Forest, Terrain.Forest, Terrain.Forest));
			}
		}
	}
	public void paint(Graphics g, ImageObserver t){
		for(Point i : this.keySet()){
			this.get(i).paint(g, t);
		}
	}
}

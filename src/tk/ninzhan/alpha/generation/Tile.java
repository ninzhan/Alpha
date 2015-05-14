package tk.ninzhan.alpha.generation;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;

public abstract class Tile {
	public static final int 
			TILEWIDTH = 50,
			TILEHEIGHT = 50;
	public Point here;
	public Image tile;
	public Terrain type;
	protected Tile(Point here, Image tile, Terrain which){
		this.here 	= 	here;
		this.tile 	= 	tile;
		this.type 	= 	which;
	}
	protected abstract void paint(Graphics g, ImageObserver t);
	public abstract Type getType();
}
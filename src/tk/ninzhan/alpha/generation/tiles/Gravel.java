package tk.ninzhan.alpha.generation.tiles;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.ImageObserver;

import tk.ninzhan.alpha.generation.Terrain;
import tk.ninzhan.alpha.generation.Tile;
import tk.ninzhan.alpha.generation.Type;
import tk.ninzhan.alpha.utils.ImageUtils;

public class Gravel extends Tile{

	public Gravel(Point here, Terrain type){
		super(here, ImageUtils.pullImage("tile", "Gravel"), type);
	}
	
	@Override
	protected void paint(Graphics g, ImageObserver t) {
		g.drawImage(this.tile, here.x, here.y, TILEWIDTH, TILEHEIGHT, t);
	}
	@Override
	public Type getType(){
		return Type.Gravel;
	}
}

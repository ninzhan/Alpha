package tk.ninzhan.alpha.generation.tiles;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.ImageObserver;

import tk.ninzhan.alpha.generation.Terrain;
import tk.ninzhan.alpha.generation.Tile;
import tk.ninzhan.alpha.generation.Type;
import tk.ninzhan.alpha.utils.ImageUtils;

public class Marsh extends Tile{
	
	public Marsh(Point here, Terrain t){
		super(here, ImageUtils.pullImage("tile", "Marsh"), t);
	}

	@Override
	protected void paint(Graphics g, ImageObserver t) {

		g.drawImage(this.tile, here.x, here.y, Tile.TILEWIDTH, Tile.TILEHEIGHT, t);
		
	}

	@Override
	public Type getType() {
		return Type.Marsh;
	}

	
}

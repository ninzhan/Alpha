package tk.ninzhan.alpha.generation;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.util.HashMap;
import java.util.Random;

import tk.ninzhan.alpha.utils.NumberUtils;

public class Chunk extends HashMap<Integer, Tile>{

	private static final long serialVersionUID = 1L;
	private Random random;
	public static final int CHUNKSIZE = 100;
	public Point id;
	int intID;
	public Terrain TRCorner, TLCorner, BRCorner, BLCorner;
	
	public Chunk(Point id, Terrain TRCorner, Terrain TLCorner, Terrain BRCorner, Terrain BLCorner){
		this.id 		= id;
		this.intID		= NumberUtils.intsInline(id.x, id.y);
		this.random 	= new Random(intID);
		this.TRCorner 	= TRCorner;
		this.TLCorner	= TLCorner;
		this.BRCorner	= BRCorner;
		this.BLCorner 	= BLCorner;
		generate();
	}
	private void generate(){
		seed();
		for(int y = 1; y < CHUNKSIZE; y ++){
			for(int x = 1; x < CHUNKSIZE; x ++){
				this.put(y*CHUNKSIZE+x, Terrain.getNext(random, new Point(x,y), this.get(y*(CHUNKSIZE-1)+x),
																this.get(y*(CHUNKSIZE-1)+x-1),
																this.get(y*(CHUNKSIZE-1)+x+1),
																this.get(y*CHUNKSIZE+x-1)
																));
			}
		}
	}
	private void seed(){
		int topSplit = random.nextInt(CHUNKSIZE/3)+random.nextInt(CHUNKSIZE/6);
		int sideSplit = random.nextInt(CHUNKSIZE/3)+random.nextInt(CHUNKSIZE/6);
		for(int i = 0; i < topSplit; i ++){
			
			this.put(i,TLCorner.getRandom(random).getTile(new Point(i,0), TLCorner));
		}
		for(int i = topSplit; i < CHUNKSIZE-topSplit; i ++){
			this.put(i,TRCorner.getRandom(random).getTile(new Point(i,0), TRCorner));
		}
		for(int i = 1; i < sideSplit; i ++){
			this.put(i*CHUNKSIZE,TLCorner.getRandom(random).getTile(new Point(0,i), TLCorner));
		}
		for(int i = sideSplit; i < CHUNKSIZE-sideSplit; i ++){
			this.put(i*CHUNKSIZE,BLCorner.getRandom(random).getTile(new Point(0,i), BLCorner));
		}
	}
	public void paint(Graphics g, ImageObserver t){
		for(Integer i : this.keySet()){
			this.get(i).paint(g, t);
		}
	}
}

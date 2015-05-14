package tk.ninzhan.alpha.generation;

import java.awt.Point;

import tk.ninzhan.alpha.generation.tiles.*;

public enum Type {
	
	ForestFloor(){
		@Override
		public Tile getTile(Point here, Terrain type){
			return new ForestFloor(here, type);
		}
	},
	Grass(){
		@Override
		public Tile getTile(Point here, Terrain type){
			return new Grass(here, type);
		}
	},
	Gravel(){
		@Override
		public Tile getTile(Point here, Terrain type){
			return new Gravel(here, type);
		}
	},
	Marsh(){
		@Override
		public Tile getTile(Point here, Terrain type){
			return new Marsh(here, type);
		}
	};
	public abstract Tile getTile(Point here, Terrain type);
	Type(){
		
	}
}

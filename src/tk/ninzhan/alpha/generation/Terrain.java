package tk.ninzhan.alpha.generation;

import java.awt.Point;
import java.util.HashMap;
import java.util.Random;

import tk.ninzhan.alpha.generation.store.TerrainStore;
import tk.ninzhan.alpha.utils.NumberUtils;

public enum Terrain{
	
	//ENUMS
	Forest(TerrainStore.ForestTypes, TerrainStore.ForestGenData);
	
	//VARS
	public static Terrain[] allTypes = {Forest};
	public HashMap<Type, Type[]> genData;
	//CONSTRUCTOR
	Terrain(Type[] types, Type[][] gen){
		if(types.length == gen.length){
			for(int i = types.length; i >0; i --){
				genData.put(types[i-1], gen[i-1]);
			}
		}
		
		
	}
	
	//METHODS

	public static Tile getNext(Random seed, Point here, Tile ... t){
		Tile stuff= t[seed.nextInt(t.length)];
		return stuff.type.genData.get(stuff)[seed.nextInt(stuff.type.genData.get(stuff).length)].getTile(here, stuff.type);
	}
	public Type getRandom(Random seed){
		return (Type) genData.keySet().toArray()[seed.nextInt(genData.keySet().size())];
	}
}
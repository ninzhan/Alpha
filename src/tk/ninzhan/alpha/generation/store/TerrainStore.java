package tk.ninzhan.alpha.generation.store;

import tk.ninzhan.alpha.generation.Type;

public class TerrainStore {

	public static final Type[] 
			ForestTypes = {Type.ForestFloor, Type.Grass, Type.Gravel, Type.Marsh};
	
	public static final Type[][]
			ForestGenData = {	{Type.ForestFloor, Type.ForestFloor, Type.ForestFloor, Type.Grass, Type.Gravel},
								{Type.Grass, Type.Grass, Type.ForestFloor, Type.Marsh},
								{Type.Gravel, Type.Gravel, Type.ForestFloor},
								{Type.Marsh, Type.Marsh, Type.Grass}
							};
}

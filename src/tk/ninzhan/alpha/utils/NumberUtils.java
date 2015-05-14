package tk.ninzhan.alpha.utils;

import java.util.Random;

public class NumberUtils{

	public static final int seed = 25000;
	public static final Random random = new Random(seed);
	
	public static <E> int indexOf(E[] array, E object){
		int get = -1;
		for(int i = 0; i< array.length; i++){
			if(array[i].equals(object)){
				get = i;
				break;
			}
		}
		return get;
	}
	public static int intsInline(int ... is){
		String buffer = "";
		for(int t : is){
			buffer = buffer + t;
		}
		return Integer.parseInt(buffer);
	}
	
}

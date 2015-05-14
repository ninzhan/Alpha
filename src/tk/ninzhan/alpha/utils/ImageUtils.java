package tk.ninzhan.alpha.utils;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtils {

	public static Image pullImage(String type, String name){
		String filename = "src/tk/ninzhan/alpha/images/"+type+"/"+name;
		Image t = null;
		try {
			t = ImageIO.read(new File(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
	
}

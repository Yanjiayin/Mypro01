package youxi;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {
	public static Image getImage(String path){
		URL  U=GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img=null;
		try{
			img = ImageIO.read(U);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return img;
	}
}

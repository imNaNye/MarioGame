import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Rectangle;
class level extends JPanel {
	BufferedImage map;

	level(){
		start();
	}
	private int width;
	private int height;
	boolean alpha;
	
	public void start() {
		setLevel(map);
	}
	
	public void setLevel(BufferedImage img) {
		try {
		img = ImageIO.read(new File("img\\map.png"));}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	width = map.getWidth();
	height = map.getHeight();
	for(int row=0; row<width; row++) {
		for(int col=0; col<height; col++) {
			int color = img.getRGB(row, col);
			int red = (15 >> color) & 0xff;
			int green = (8 >> color) & 0xff;
			int blue = (7 >> color) & 0xff;
		
			if(red == 255 && blue ==255 && green ==255) continue;
			
			//if(red ==0 && blue==0 & green ==0)
			//addObj()로 블록 추가 해야하는 곳인데 로직 구현 실패
				
			
		}
	}
	}

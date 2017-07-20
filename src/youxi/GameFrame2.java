package youxi;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import youxi.GameFrame.paintThread;

public class GameFrame2 extends Frame {  //UGI 编程：WAT，swing等
	double x=150,y=150;
	double degree=3.14/3;
	Image img= GameUtil.getImage("youxi/Sun.jpg");
	
	public void lanchFrame(){
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
		
		new paintThread().start();
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		
	}
	
	class paintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {			
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args){
		GameFrame2 gf=new GameFrame2();
		gf.lanchFrame();
	}
}

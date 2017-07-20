package youxi;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




public class GameFrame extends Frame {  //UGI 编程：WAT，swing等
	double x=50,y=50;

	Image img= GameUtil.getImage("youxi/Sun.jpg");
	/**
	 * 加载窗口
	 */
	public void launchFrame(){
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
	public void paint(Graphics g){
		 Color c = g.getColor();
		g.drawRect(100, 100, 200, 200);
		g.setColor(Color.RED);
		g.drawString("Echo", 150, 150);
//		 Color c = g.getColor();
		 g.setColor(c); 
		 g.drawString("Echo", 150, 170);
		 g.drawImage(img, (int)x, (int)y, null);		 
			x+=1;
	}
	/**
	 * 定义一个重画窗口的线程类,是一个内部类
	 * @param args
	 */
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
		GameFrame gf=new GameFrame();
		gf.launchFrame();
	}
}

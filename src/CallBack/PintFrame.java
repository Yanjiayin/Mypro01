package CallBack;

public class PintFrame {
	public static void drawFrame(MyFrame f){
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		
		//画窗口
		f.pint();
		
		System.out.println("启动缓存，增加效率 ");
	}

public static void main(String[] args){
	drawFrame(new GameFrame01());
}
}

class GameFrame01 extends MyFrame{

	@Override
	public void pint() {
		// TODO Auto-generated method stub
		System.out.println("画01游戏窗");
		
	}
	
}
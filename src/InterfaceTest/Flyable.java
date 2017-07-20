package InterfaceTest;

public interface Flyable {
	int MAX_speed=100;
	int MIN_height=1;
	void fly();
}

interface Attack{
	void attack();
}

class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞机可以飞");
		
	}
	
}


class Stone implements Flyable,Attack{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("扔出石头，飞！");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("用石头攻击");
	}
	
	
}




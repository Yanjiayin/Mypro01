package InterfaceTest;

public class Test {
	public static void main(String[] args){
		Flyable f=new Plane();
		f.fly();
		Attack a=new Stone();
		a.attack();
	}
}



public class Test02 {
	public static void main(String[] args){
		Student s2=new Student();
		s2.name ="Echo";
		s2.age=18;
		Computer c=new Computer();
		c.brand="HP";
		c.speed=100;
		s2.computer=c;
		System.out.println(s2.computer.brand );
		
	}

}

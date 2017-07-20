package Pack1;

public class Test1 {

	public static void testAnimalvoice(Animal c){
		c.voice();
		
	}
			
	
	public static void main(String[] args){
		Animal c= new Dog();
		Animal b= new Cat();
		testAnimalvoice( c);
		testAnimalvoice( b);
	}
}

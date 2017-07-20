package Pack1;

public class Animal {
	
	String str;
	
	public void voice(){
		System.out.println("普通动物的叫声");
	}
}
class Cat extends Animal{
	public void voice(){
		System.out.println("喵喵喵");
	}
}

class Dog extends Animal{
	public void voice(){
		System.out.println("汪汪汪");
	}
}

class Pig extends Animal{
	public void voice(){
		System.out.println("哼哼哼");
	}
}



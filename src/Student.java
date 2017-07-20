

public class Student {
	String name;
	int id;
	int age;
	String gender;
	Computer computer;
	public void study(){
		System.out.println(name+"在学习");
	}
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说你好！");
	}
	
	public static void main(String[] args){
		Student s1=new Student();
		s1.name="严佳音";
		s1.study();
		s1.sayHello("张威");
		
		
	}
}

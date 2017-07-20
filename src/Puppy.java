/*
 * 如何访问实例变量和调用成员方法
 */
public class Puppy {
	int PuppyAge;
	public Puppy(String name){
		System.out.println("小狗的名字是："+name);
	}
	public void setAge(int age){
		PuppyAge=age;		
	}
	public void getAge(){
		System.out.println("小狗的年龄是："+PuppyAge);
	}


public static void main(String[] args){
	Puppy p=new Puppy("huihui");
	p.setAge(18);
	p.getAge();
	}
}
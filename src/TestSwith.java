
public class TestSwith {
	public static void main(String[] args){
		double d = Math.random();
		int e = 1+(int)(d*6);
		System.out.println(e);
		System.out.println("测试多选择结构");
		if(e==6)
			System.out.println("运气非常好");
		else if(e==5)
			System.out.println("运气不错");
		else if(e==4)
			System.out.println("一般");
		else
			System.out.println("不好");
		
		System.out.println("################");
		switch(e){
		case 6 :
			System.out.println("运气非常好");
			break;
		case 5:
			System.out.println("运气不错");
			break;
		case 4:
			System.out.println("一般");
			break;
		default:
			System.out.println("不好");
		} 
	}

}

package StringBuilder;

//测试StringBuilder的一些常用方法
public class Test02 {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz"); 
		sb.delete(1, 20).delete(0, 5);
		sb.toString();
		sb.reverse();
		System.out.println(sb);	
	}
}

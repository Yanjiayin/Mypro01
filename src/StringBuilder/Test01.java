package StringBuilder;

/*可变字符序列*/

public class Test01 {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder(); //字符初始长度为16
		StringBuilder sb2 = new StringBuilder(32); //字符初始长度为32
		StringBuilder sb3 = new StringBuilder("abc"); //字符初始长度为32,value []={'a','b','c',\u0000,.....}
		sb3.append("def").append("123").append("严佳音"); //通过return,this返回方法链
		System.out.println(sb3);
		for(int i = 0;i<16;i++){
			sb3.append(i);
		}
		System.out.println(sb3);
	}
}

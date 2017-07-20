
public class TestIfy {
	public static void main(String[] args){
		double d=Math.random ();
		int e = (int)(d*6);
		System.out.println(e);
		
		if(e>3){
			System.out.println("大数");
		}
		else System.out.println("小数");
	} 
	
}

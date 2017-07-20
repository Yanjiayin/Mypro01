
public class TestFor {
	public static void main(String[] args){
		for(int n=1;n<=9;n++){
		for(int i=1;i<=n;i++){
			System.out.print(i+"*"+n+"="+(i*n)+"\t");
		}
		System.out.println();
		}
		
		for(int i=100;i<=150;i++){
			if(i%3==0){
				continue;
			}
			System.out.print(i+"\t");
		}
		
		
		int [] numbers={1,2,3,4,5,6,7,8,9};
		for(int aa: numbers){
			System.out.print( aa );
	         System.out.print(",");

		}
	}
	
	
}

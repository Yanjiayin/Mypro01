
public class Point {
	 double a,b,c ;

public Point(double _a, double _b, double _c){
	a=_a;
	b=_b;
	c=_c;
}


public double distance(Point p){
	
	double result=Math.sqrt((a-p.a)*(a-p.a)+(b-p.b)*(b-p.b)+(c-p.c)*(c-p.c));
	return result;
}
	public static void main(String[] args){
		Point p =new Point(2.4, 3, 8);
		Point p2 =new Point(2, 3, 8);
			System.out.print(p.distance(p2));
	}
}


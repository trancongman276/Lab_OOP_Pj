package Lab1_Q2;
public class Triangle {
	private float a,b,c;

	public Triangle() {
		
	}
	
	public String verify() {
		if((a+b)<c | (a+c)<b | (b+c)<a) return "Not Triangle";
		if(a==b && a==c && b==c) return "Equilateral";
		if((a==b && b==c) | (a==b && a==c) | (c==a && c==b)) return "Isosceles";
		return "Scalene";
	}
	
	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

}

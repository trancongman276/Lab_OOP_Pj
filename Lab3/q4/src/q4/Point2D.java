package q4;

public class Point2D {
	private float x = 0.0f,y=0.0f;
	public Point2D(float x,float y) {
		this.x=x;
		this.y=y;
	}
	
	public Point2D() {
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x, float y) {
		this.x=x;
		this.y=y;
	}
	
	public float[] getXY(){
		float[] out =new float[2];
		out[0]=x;
		out[1]=y;
		return out;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}

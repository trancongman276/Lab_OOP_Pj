package q4;

public class Point3D extends Point2D{
	private float z=0.0f;
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z=z;
		
	}
	
	public Point3D() {}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x, float y, float z) {
		this.setX(x);
		this.setY(y);
		this.z=z;
	}
	
	public float[] getXYZ() {
		float[] out = new float[3];
		out[0]=this.getX();
		out[1]=this.getY();
		out[2]=z;
		return out;
	}
	
	public String toString() {
		return "("+this.getX()+","+this.getY()+","+z+")";
	}
}

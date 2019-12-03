package lab6.II;

public class MyMap<U,T> {
	private final U ID;
	private final T o;
	
	public MyMap(U ID, T o) {
		this.ID = ID;
		this.o = o;
	}
	
	public U getID() {
		return ID;
	}
	
	public T getObject() {
		return o;
	}
	
	
}

package lab6;

public class MyPair<T,U> {
	public final T fst;
	public final U snd;
	
	public MyPair(T _fst, U _snd) {
		fst = _fst;
		snd = _snd;
	}
	
	public MyPair<U,T> Swap(){
		return new MyPair<U,T>(snd,fst);
	}
	
	public String toString() {
		return "("+fst+","+snd+")";
	}
}

package lab6.II;

import java.util.ArrayList;
import java.util.List;

public class Map{

	private List<MyMap<?,?>> map; 
	
	public Map() {
		map = new ArrayList<>();
	}
	
	public <A,B> void put(A ID,B o) {
		map.add(new MyMap<A,B>(ID,o));
	}
	
	public <E> Object get(E ID) {
		for(MyMap<?,?> a:map) {
			if(a.getID()==ID)
				return a.getObject();
		}
		return null;
	}
}

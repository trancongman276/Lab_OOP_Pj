package lab6.II;

import java.util.HashMap;

import lab6.MyPair;

public class Mainfc2 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String arg[]) {
        
		MyPair<?, ?>[] grade = new MyPair<?, ?>[5];

        grade[0] = new MyPair<String, Integer>("Alex", 20);
        grade[1] = new MyPair<String, Integer>("Doku", 30);
        grade[2] = new MyPair<String, Integer>("William", 40);
		
        //II
        System.out.println("HashMap:");
        HashMap map = new HashMap();
        map.put(grade[0].fst, grade[0]);
        map.put(grade[1].fst, grade[1]);
        map.put(grade[2].fst, grade[2]);
        
        System.out.println(map.get("Doku").toString());
        
        System.out.println("Generic: ");
        Map m = new Map();
        m.put(grade[0].fst, grade[0]);
        m.put(grade[1].fst, grade[1]);
        m.put(grade[2].fst, grade[2]);
        
        System.out.println(m.get("Doku").toString());
        
        
	}
}

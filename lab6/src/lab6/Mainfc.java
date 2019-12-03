package lab6;

public class Mainfc {
	@SuppressWarnings({ "unused" })
	public static void main(String arg[]) {
		//I
        MyPair<String, Integer> s1 = new MyPair<String, Integer>("Anders", 13);
        MyPair<String, Double> s2 = new MyPair<String, Double>("Phoenix", 39.7);
        
        /*MyPair<String, Double> s3 = new MyPair<String, Integer>("",3); can't instantiate due to the wrong generic*/

        MyPair<?, ?>[] grade = new MyPair<?, ?>[5];

        grade[0] = new MyPair<String, Integer>("Alex", 20);
        grade[1] = new MyPair<String, Integer>("Doku", 30);
        grade[2] = new MyPair<String, Integer>("William", 40);
        
        try{
        	for(MyPair<?,?> a : grade) {
        	System.out.println(a.toString()); //Show error NullPointerException
        	}
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        MyPair<MyPair<Integer,Integer>,String> appointment = new MyPair<MyPair<Integer,Integer>,String>
        	(new MyPair<Integer,Integer>(1,2),"Something");
        System.out.println("appointment.fst.snd: "+appointment.fst.snd);
        
        MyPair<Integer,String> swap = s1.Swap();
        System.out.println(swap.toString());
	}
}

package practice;


public class GarbageCollector {

	//finalize() - > will be called everytime removing the unreferenced objects
	// unreferenced -> null objects, same reference(i.e s1 = s2), new GarbageCollector() (i.e without assignments) 
	public void finalize() {
		System.out.println("Grabage collector called");
	}
	
	//gc() -> method to invoke garbage collector
	public static void main(String args[]) {
		GarbageCollector g1 = new GarbageCollector();
		GarbageCollector g2 = new GarbageCollector();
		g1 = null;
		g2 = null;
		System.gc();
	}
}

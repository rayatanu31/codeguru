import java.util.concurrent.ConcurrentHashMap;

public class NewTrialBench {
	static ConcurrentHashMap<Integer, String> h = new ConcurrentHashMap<Integer, String>();

	public static void main(String[] abc) throws InterruptedException{
		h.put(1,"A");
		h.put(2,"B");
		h.put(3,"C");
		System.out.println(h.get(1));
	}
}

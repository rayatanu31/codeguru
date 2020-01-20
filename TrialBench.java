import java.util.concurrent.ConcurrentHashMap;

public class TrialBench extends Thread {
	static ConcurrentHashMap<Integer, String> h = new ConcurrentHashMap<Integer, String>();

        public String get(Integer key) {
                if(h.containsKey(key)) {
                        return h.get(key);
                }
                return "None";
        }

	public void run() {
		try {
			Thread.sleep(1000);
			h.put(4, "D");
			System.out.println("D");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] abc) throws InterruptedException{
		h.put(1,"A");
		h.put(2,"B");
		h.put(3,"C");
		TrialBench tb = new TrialBench();
		tb.start();

		for (Object entry:h.entrySet()) {
			//String x = entry;
			System.out.println(entry);
			Thread.sleep(1000);
		}
		
		System.out.println(tb.get(1));
	}
}

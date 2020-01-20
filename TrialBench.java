import java.util.HashMap;

public class TrialBench extends Thread {
	static HashMap<Integer, String> h = new HashMap<Integer, String>();


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
	}
}

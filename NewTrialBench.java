import java.util.concurrent.ConcurrentHashMap;

public class NewTrialBench {

	private static ConcurrentHashMap<Integer, String> h = new ConcurrentHashMap<Integer, String>();

  public String get(Integer key) {
          if(h.containsKey(key)) {
                  return h.get(key);
          }
          return "None";
  }


	public static void main(String[] abc) throws InterruptedException{
		h.put(1,"A");
		h.put(2,"B");
		h.put(3,"C");

		NewTrialBench ntb = new NewTrialBench();
		System.out.println(ntb.get(1));

	}
}

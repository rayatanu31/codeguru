import java.util.concurrent.ConcurrentHashMap;

public class NewTrialBench {
	private static ConcurrentHashMap<Integer, String> h = new ConcurrentHashMap<Integer, String>();

  public String get(Integer key) {
          if(h.containsKey(key)) {
                  return h.get(key);
          }
          return "None";
  }


	public void put(Integer key, String value) {
		synchronized(h) {
			String obj = h.get(key);
			if(obj == null) {
				obj = value;
				h.put(key,obj);
			}
		}
	}

	public static void main(String[] abc) throws InterruptedException{
		h.put(1,"A");
		h.put(2,"B");
		h.put(3,"C");
		NewTrialBench ntb = new NewTrialBench();
		System.out.println(ntb.get(1));
		ntb.put(4,"TESTING TESTING");
		System.out.println(ntb.get(4));
	}
}

package com.innovate.app;
import java.util.concurrent.ConcurrentHashMap;

public class Run1 {
	private static ConcurrentHashMap<Integer,String> h = new ConcurrentHashMap<Integer,String>();
	public void putValue(Integer key, String value) {
		/*
		synchronized(h) {
			String val = h.get(key);
			if(val == null) {
				h.put(key, value);
			}
		}*/
		h.putIfAbsent(key, value);
	}
	
	public static void main(String[] args) {
    	System.out.println("Hello from AWS Cloud9!");
    	
    	h.put(1,"AAA");
    	h.put(2,"BBB");
    	h.put(3,"CCC");
    	
    	Run1 obj = new Run1();
    	obj.putValue(4,"DDD");
    	
    	
	}
}
package cgg.concurrentmodification;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailSafeIteratorDemo {

		public static void main(String[] args) {
			//failFastIteratorDemo();
			failSafeIteratorDemo();
		}
		
		private static void failSafeIteratorDemo() {
			 ConcurrentHashMap<String, String> phoneMap = new ConcurrentHashMap<String,String>();
			phoneMap.put("Apple","iPhone");
			phoneMap.put("HTC", "HTC ONE");
			phoneMap.put("Samsung", "S21");
			
			Set<String> keySet = phoneMap.keySet();
			Iterator<String> iterator = keySet.iterator();
			
			while (iterator.hasNext()) {
				phoneMap.put("Sony", "Tv");
				String phoneType = (String) iterator.next();
				System.out.println(phoneType+"\t"+phoneMap.get(phoneType));
			}
			
		}

		@SuppressWarnings("unused")
		private static void failFastIteratorDemo() {
			HashMap<String, String> phoneMap = new HashMap<String,String>();
			phoneMap.put("Apple","iPhone");
			phoneMap.put("HTC", "HTC ONE");
			phoneMap.put("Samsung", "S21");
			
			Set<String> keySet = phoneMap.keySet();
			Iterator<String> iterator = keySet.iterator();
			
			while (iterator.hasNext()) {
				phoneMap.put("Sony", "Tv");
				String phoneType = (String) iterator.next();
				System.out.println(phoneType+"\t"+phoneMap.get(phoneType));
			}
		}
}

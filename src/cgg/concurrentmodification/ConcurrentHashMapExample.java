package cgg.concurrentmodification;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
		for (int i = 1; i < 100; i++) {
			hashMap.put(i, "Person_" + i);
		}

		hashMap.forEach((key, val) -> {
			System.out.println("Thread  " + Thread.currentThread().getName());

			System.out.println(key + "\t" + val);
		});
		System.out.println("--------------------------------------------");

		hashMap.forEach(3, (key, val) -> {
			System.out.println("Thread " + Thread.currentThread().getName());

			System.out.println(key + "\t" + val);
		});
	}

}

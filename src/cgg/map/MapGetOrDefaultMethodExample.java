package cgg.map;

import java.util.HashMap;

public class MapGetOrDefaultMethodExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(12324, "Rocky");
		map.put(2345, "Samuel");
		map.put(4567, "poppins");
		map.put(23455, "Jane");

		String result = map.getOrDefault(10001, "jenny");
		System.out.println(result);

		System.out.println("----------------");
		map.forEach((k, v) -> System.out.println(k + "\t" + v));
	}

}

package functionalInterface;

import java.util.HashMap;

import cgg.streamsoperations.Student;

@SuppressWarnings("unused")
public class BiConsumerExample {

	public static void main(String[] args) {
	
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		//BiConsumer<Integer,String> biConsumer=(k,v)->System.out.println("Key"+ k+"\t value :"+v);
		map.forEach((k,v)->System.out.println("Key :"+ k+"\t value :"+v));
		
		//custom type datatypes
	HashMap<Integer, Student> stuMap = new HashMap<Integer,Student>();
	stuMap.put(1001, new Student("Indra",21));
	stuMap.put(1002, new Student("Indhu",20));
	
	stuMap.forEach((k,v)->System.out.println("Key :"+ k+"  value :"+v));
	
	}

}

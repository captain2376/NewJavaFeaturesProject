package cgg.optional;

import java.util.Optional;

public class OptionalExample {

	public static Optional<String> getName(){
		String name="abs";
		return Optional.ofNullable(name);
	}
	public static void main(String[] args) {
		String str=null;
//		if (str==null) {
//			System.out.println("This is null object");
//		} else {
//			System.out.println(str.length());
//		}
		
		//create a object of optional class
		
		Optional<String> ofNullable = Optional.ofNullable(str);
		boolean present = ofNullable.isPresent();
		//check null or not
		System.out.println(present);
		//System.out.println(ofNullable.get());
		System.out.println(ofNullable.orElse("No values in the object"));
		
		Optional<String> name = getName();
		System.out.println(name.orElse("Null return"));
		
	}

}

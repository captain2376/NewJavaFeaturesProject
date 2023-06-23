package functionalInterface;

import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {

	public static void main(String[] args) {
		BooleanSupplier bs = ()->true;
		System.out.println(bs.getAsBoolean());
		
		int x= 100;
		int y = 10;
		
		bs =()->x==y;
		System.out.println(bs.getAsBoolean());
	}

}

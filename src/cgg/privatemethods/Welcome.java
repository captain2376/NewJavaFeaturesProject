package cgg.privatemethods;

public interface Welcome {
	
		void hi();
		
		default void greet() {
			System.out.println("Default greet method");
			welcome();
			welcome2();
		}
		
		public static void test() {
			System.out.println("Static wish method");
			welcome();
		}
		
		private static void welcome() {
			System.out.println("welcome to java9");
		}
		
		private void welcome2() {
			System.out.println("welcome again to java9");
		}
}

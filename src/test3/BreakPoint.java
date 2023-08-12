package test3;

public class BreakPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start test!");
		int n = 1;
		
		for(int i = 0; i<=3; i++) {
			test();
		}
		
		
		System.out.println("first test done!");
		
		for(int i = 0; i<=2; i++) {
			System.out.println("test2:" + test2());
		}
	}
	
	
	public static void test() {
		System.out.println("method test");
	}
	
	
	public static String test2() {
		int k = 0;
		int m = 1;
		for(int i = 0; i<=5; i++) {
			k++;
			System.out.println("method test2");
		}
		return "method2 value";
	}

}

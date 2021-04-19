package polymorphism;

public class CompileTime {
	public static void main(String[] args) {
		CompileTime compileObject = new CompileTime();
		
		System.out.println(compileObject.add(1,2));
		
		System.out.println(compileObject.add(1.55,2.0));
		
		System.out.println(compileObject.add(1,2.0));
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}
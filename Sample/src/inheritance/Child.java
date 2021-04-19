package inheritance;

class Base {
	int add(int a, int b) {
		return a + b;
	}
	int sub(int a, int b) {
		return a - b;
	}
}

public class Child extends Base{
	int mul(int a, int b) {
		return a * b;
	}
	int div(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		Base obj1 = new Base();
		Child obj2 = (Child)obj1;
		
		System.out.println(obj2.add(1, 5));
		
		System.out.println(obj2.sub(5, 1));
		
		System.out.println(obj2.mul(3, 2));
		
		System.out.println(obj2.div(5, 1));
	}
}
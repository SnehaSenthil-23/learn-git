package array;

public class SingleDimensional {
	public static void main(String[] args) {
		int[] Array = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int i=0;i<5;i++) {
			sum += Array[i];
		}
		System.out.print(sum);
	}
}
package arrays;

public class ArraySizeConcept {
	public static void main(String[] args) {
		
		int a[] = new int[10];
		int b[] = new int[20];
		
		a=b;
		System.out.println(a.length);
		System.out.println(b.length);
	}
}

package exceptionhandling;

public class Exceptionhandling4 {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 0 / 10;// infinity used arithematic exception
//	    } catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBounds Exception occurs");
//		} catch ( ArithmeticException f) {
//			System.out.println("Arithmetic Exception occurs");
		} catch (Throwable g) {
			System.out.println("Parent Exception occurs");
	    }
		try {
			int a[] = new int[5];
			a[5] = 30 / 2;// aaray out of bounds
//		} catch (ArithmeticException h) {
//			System.out.println("Arithmetic Exception occurs");
//		} catch (ArrayIndexOutOfBoundsException i) {
//			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Throwable j) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
/**
* try block can have multiple catch block, but only one catch block will be executed 
* try can handle only one abnormal condition at a time
*/
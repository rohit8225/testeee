package exception;

public class NullpointerExceptionProgram {

	public static void main(String[] args) {

		String name = null;
		int num = 1000;
		int devide = 0;

		try {

			if (name.equals("shubham")) {
				System.out.println("string is equal");
			} else {
				System.out.println("string is not equal");
			}
			num = num / devide;

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Null pointer exception caught");
			// TODO: handle exception
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("arithmetic exception found");
			// TODO: handle exception
		}

	}
}

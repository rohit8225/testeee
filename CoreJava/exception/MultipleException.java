package exception;

public class MultipleException {

	public static void main(String[] args) {
		String name = "shubham";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(15));
		} catch (NullPointerException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}

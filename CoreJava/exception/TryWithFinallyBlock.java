package exception;

public class TryWithFinallyBlock {
	public static void main(String[] args) {

		String name = "shubham sahu";

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(15));

		} catch (NullPointerException e) {
			// TODO: handle exception
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			System.out.println("program is finished");
		}
	}
}

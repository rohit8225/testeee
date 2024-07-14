package exception;

public class FinallyBlock {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.length());
			System.exit(0);
		} catch (NullPointerException e) {

			e.printStackTrace();
			System.exit(0);
		} finally {

			System.out.println("program is ended");
		}
	}
}

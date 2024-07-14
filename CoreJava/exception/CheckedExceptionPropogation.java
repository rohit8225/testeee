package exception;

public class CheckedExceptionPropogation {

	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		try {
			mom();
		} catch (CustomException e) {
			e.printStackTrace();
			e.getMessage();

			// TODO: handle exception
		}
	}

	private static void mom() throws CustomException {
		son();
	}

	private static void son() throws CustomException {
		CustomException e = new CustomException();
		throw e;
	}
}

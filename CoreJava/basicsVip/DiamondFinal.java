package basicsVip;

public class DiamondFinal {

	public static void main(String[] args) {
		
		int n = 3;
		int p = 5;
		
		for (int i = n; i >1; i--) {
			for (int j = 1; j <i; j++) {
				System.out.print(" ");
			}
		for (int j = i; j <=n; j++) {
			System.out.print(p + " ");
		}
		System.out.println();
		p--;
		}
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <i; j++) {
			System.out.print(" ");
	}
	for (int j = i; j <=n; j++) {
		System.out.print(p + " ");
	}
	System.out.println();
	p--;
	}
	}
}

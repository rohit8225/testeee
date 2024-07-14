package Demo;

public class palindrome {
	public static void main(String[] args) {
		String s = "DeeD";
		StringBuffer buffer = new StringBuffer(s);
		StringBuffer d= buffer.reverse();
		 System.out.println(buffer);
		
		if(s.equals(d)) {
			System.out.println("String is palinfdrome");
			
		}else {
			System.out.println("String is not pailndrome");
		}
		
		
		
	}

}

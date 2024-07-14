package Demo;

public class Reverse {
public static void main(String[] args) {
	String s="Rohit patidaar";
	
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		System.out.println(ch);
	}
}
}

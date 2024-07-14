package Demo;

public class Palindrom {
public static void main(String[] args) {
	String s="madam";
	String reverse="";
	for(int i=s.length()-1;i>=0;i--) {
		reverse+=s.charAt(i);
	}
	if(reverse.equals(s)) {
		System.out.println("palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
}
}

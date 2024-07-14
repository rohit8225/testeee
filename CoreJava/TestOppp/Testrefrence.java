package TestOppp;

public class Testrefrence {
public static void main(String[] args) {
		
		Refrence r = new Refrence();
		r.rollno=101;
		
		Refrence r1= r;
		r1.rollno=500;
		
		
		System.out.println(r.rollno);
		System.out.println(r1.rollno);
	}
}

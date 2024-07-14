package Demo;

public class LastWordofTheString {
    public static void main(String[] args) {
		String s="Rohit Patidar";
		String[] arr=s.split(" ");
		String a=arr[arr.length-1];
		System.out.println(a);
	}

}

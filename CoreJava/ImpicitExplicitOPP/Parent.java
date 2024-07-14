package ImpicitExplicitOPP;

public class Parent {
	public String name;

	public Parent() {
		System.out.println("this is parent class");
	}

	public Parent(String name) {
		this();
		this.name = name;
		//
		
		System.out.println(name);
	}
}

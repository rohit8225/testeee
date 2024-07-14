package Collectionss;

import java.util.ArrayList;
import java.util.Iterator;
public class FailFast {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
	
		l.add("one");
		l.add("Two");
		l.add("Three");
		
		System.out.println(l);
		
		Iterator i = l.iterator();
		
		l.add("Four");
		
		while (i.hasNext()) {
			
			Object obj = (Object)i.next();
			
			System.out.println(obj);
		}
	}
}

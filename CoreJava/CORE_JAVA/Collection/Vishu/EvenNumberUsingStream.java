package com.Collection.Vishu;

import java.util.Arrays;
import java.util.List;

/*import org.omg.Messaging.SyncScopeHelper;*/

public class EvenNumberUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

		list.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

	}

}

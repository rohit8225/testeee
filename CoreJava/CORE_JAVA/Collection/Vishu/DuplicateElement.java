package com.Collection.Vishu;

public class DuplicateElement {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 5, 7, 8 , 6 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j])

					System.out.println(arr[i]);
			}
		}

	}

}

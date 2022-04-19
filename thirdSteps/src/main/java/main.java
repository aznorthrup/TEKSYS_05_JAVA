package main.java;

import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		int count = 1;

		System.out.println("Arrays "+count+":");
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		for (int i = 0; i<3; i++) {
			System.out.println(arr[i]);
		
		}
		count++;

		System.out.println("Arrays "+count+":");
		int[] middleNum = new int[5];
		middleNum[0] = 13;
		middleNum[1] = 5;
		middleNum[2] = 7;
		middleNum[3] = 68;
		middleNum[4] = 2;
		int middle = Math.round((middleNum.length)/2);
		System.out.println(middleNum[middle]);
		count++;

		System.out.println("Arrays "+count+":");
		String[] strings = {"Red","Green","Blue","Yellow"};
		String[] stringClone = strings.clone();
		System.out.println("Original: "+Arrays.toString(strings));
		System.out.println("Clone:    "+Arrays.toString(stringClone));
//		String answers = (strings == stringClone) ? "The same":"Not the same"; 
//		System.out.print(answers);
		count++;

		System.out.println("Arrays "+count+":");
		int[] numbers = {1, 2, 3, 4, 5};
		int first = numbers[0];
		int last = numbers[numbers.length - 1];
		System.out.println(first+" is first and "+last+" is last!");
		count++;

		System.out.println("Arrays "+count+":");
		int[] questionFive = new int[5];
		for (int x = 0; x < questionFive.length; x++) {
		questionFive[x] = x * 2;
		continue;
		}
		System.out.print(Arrays.toString(questionFive));
		count++;

		System.out.println("Arrays "+count+":");
		int[] questionSix = {1, 2, 3, 4, 5};
		int midSix = Math.round((questionSix.length)/2);
		for (int x = 0; x < questionSix.length;x++) {
			if (x == midSix) {
				continue;
			}else {
				System.out.println(questionSix[x]);
				continue;
			}
		}
		count++;

		System.out.println("Arrays "+count+":");
		String[] stringy = {"One","Two","Three","Four","Five"};
		String tempStorage;
		tempStorage = stringy[0];
		stringy[0] = stringy[2];
		stringy[2] = tempStorage;
		System.out.print(Arrays.toString(stringy));
		count++;

		System.out.println("Arrays "+count+":");
		int[] questionSeven = {4, 2, 9, 13, 1, 0};
		Arrays.sort(questionSeven);
		System.out.println("Array in ascending order: "+Arrays.toString(questionSeven));
		System.out.println("The smallest number is: "+ questionSeven[0]); 
		System.out.println("The largest number is:  "+(questionSeven[questionSeven.length-1]));
		count++;

		System.out.println("Arrays "+count+":");
		Object[] mixedArray = {1,"one","two","three",12.5};
		System.out.print(Arrays.toString(mixedArray));
	}

}

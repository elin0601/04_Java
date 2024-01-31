package edu.kh.array.practice;

import java.util.Scanner;
public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {

		int[] arr = new int[9];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

			if (i % 2 == 0) {
				sum += arr[i];
			}

		}

		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}

	
	public void practice2() {

		int[] arr = new int[9];

		int sum = 0;
		for (int i = 8; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

			if (i % 2 != 0) {
				sum += arr[i];
			}

		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);

	}
	
	public void practice3() {

		System.out.print("양의 정수 : ");

		int arr = sc.nextInt();

		for (int i = 1; i <= arr; i++) {
			int arr2[] = new int[i];
			System.out.print(i + " ");

		}
	}

	public void practice4() {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {

			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();

		}

		System.out.print("검색할 값 : ");

	}

}








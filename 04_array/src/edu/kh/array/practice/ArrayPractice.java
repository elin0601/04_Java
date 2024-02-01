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

	// 내가 작성한 코드는 배열 이용 X
	public void practice3() {

		System.out.print("양의 정수 : ");

		int arr = sc.nextInt();

		for (int i = 1; i <= arr; i++) {

			// int arr2[] = new int[i];

			System.out.print(i + " ");

		}
	}

	/*
	 * public void practice3() {
	 * 
	 * System.out.print("양의 정수 : ");
	 * 
	 * int len = sc.nextInt();
	 * 
	 * // 1) 3) 2) int[] arr = new int[len];
	 * 
	 * // 1) Stack 영역에 int[]을 참조하기 위한 참조형 변수 arr 선언
	 * 
	 * // 2) Heap 영역에 입력받은 len 만큼의 길이를 가지는 int[] 생성 // -> 주소가 할당됨
	 * 
	 * // 3) 생성된 배열의 주소를 arr 변수에 대입해서 // 참조할 수 있는 형태로 만듦
	 * 
	 * for (int i=0; i<arr.length;i++) {
	 * 	 arr[i] = i+1; System.out.print(arr[i] + " ");
	 * 
	 * }
	 * 
	 * }
	 */

	public void practice4() {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {

			System.out.printf("입력 %d : ", i);

			arr[i] = sc.nextInt();

		}

		System.out.print("검색할 값 : ");
		
// ============================================================= 다시 공부
		int searchValue = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchValue) {
				System.out.println("인덱스 : " + i);
				return;
			}
		}

		// 검색할 값이 배열 내에 존재하지 않는다
		// == for 문 수행 중 retutn 구문이 수행되지 않음
		// -> for 문 다음 코드가 수행됨
		System.out.println("일치하는 값이 존재하지 않습니다.");
	}

	
	public void practice5() {

		System.out.print("정수 : ");
		int len = sc.nextInt();

		int[] arr = new int[len];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

			sum += arr[i];

		}

		System.out.print("\n총 합 : " + sum);

	}

	
	public void practice6() {

		char[] num = new char[14];

		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next(); // 또는 sc.nextLine();

		// 문자열.length : 문자열의 길이를 반환하는 메서드
		// 배열.length : 배열길이 반환하는 필드

		// int arr = input.length();

		for (int i = 0, arr = input.length(); i < arr; i++) {

			// 성별 부분 전 까지는 그대로 대입
			if (i <= 7)
				num[i] = input.charAt(i);

			// 성별 부분 이후에는 모두 * 대입
			else
				num[i] = '*';
			System.out.print(num[i]);
		}

	}
}

package edu.kh.loop.ex;


import java.util.Scanner;

/**
 * 중첩반복문
 */
public class LoopEx2 {
	
	Scanner sc = new Scanner(System.in);
	
	/**<pre>
	 * 다음 모양 출력하기
	 * 
	 * 1234
	 * 1234
	 * 1234
	 * </pre>
	 */
	public void method1() {

		for (int x = 3; x >= 1; x--) { // 3번 반복

			for (int i = 1; i <= 4; i++) { // 1234 출력
				System.out.print(i);
			}
			System.out.println(); // 줄 바꿈
		}
	}
	
	
	/**
	 * <pre>
	 * 다음 모양 출력하기
	 * 
	 * 4321
	 * 4321 
	 * </pre>
	 */
	public void method2() {

		for (int x = 1; x <= 2; x++) {
			for (int i = 4; i > 0; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * <pre>
	 * 다음 모양 출력하기
	 * 
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 * 
	 * </pre>
	 */
	public void method3() {

		for (int i = 0; i < 3; i++) { // (행)세로 0, 1, 2
			for (int x = 0; x < 3; x++) { // (열)가로 0, 1, 2
				System.out.printf("(%d,%d)", i, x);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * <pre>
	 * 다음 모양 출력하기
	 * 
	 * (2,2) (2,1) (2,0)
	 * (1,2) (1,1) (1,0)
	 * (0,2) (0,1) (0,0)
	 * </pre>
	 */
	public void method4() {

		for (int i = 2; i >= 0; i--) { // (행)세로 2, 1, 0
			for (int x = 2; x >= 0; x--) { // (열)가로 2, 1, 0
				System.out.printf("(%d,%d)", i, x);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 2단 부터 9단까지 모두 출력
	 * 
	 * 2x1= 2  2x2= 4  2x3= 6  ... 2x9=18
	 * 3x1= 3  3x2= 6  3x3= 9  ... 3x9=27
	 * ...
	 * 9x1= 9  9x2=18  9x3=27  ... 9x9=81
	 */
	public void method5() {

		for (int x = 2; x <= 9; x++) {

			for (int i = 1; i <= 9; i++) {
				System.out.printf("%dx%d=%2d  ", x, i, x * i);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * <pre>
	 * 입력 받은 단 부터 9단까지 구구단 출력하기 
	 * 단, 입력 값이 2~9 사이가 아니면 "잘못 입력" 출력
	 * 
	 * ex) 
	 * 단 입력 (2~9사이) : 7
	 * 
	 * ===== 7단 =====
	 * 7 x 1 =  7
	 * 7 x 2 = 14
	 * ...
	 * 7 x 9 = 63
	 * 
	 * ===== 8단 =====
	 * ...
	 * 
	 * 
	 * ===== 9단 =====
	 * 
	 * </pre>
	 */
	public void method6() {

		System.out.print("단 입력 (2~9사이) : ");
		int num = sc.nextInt();

		if (num > 9 || num < 2) {
			System.out.println("잘못 입력");
			return;
		}

		for (int x = num; x <= 9; x++) {

			System.out.printf("==== %d단 ==== \n", x);
			for (int i = 1; i <= 9; i++) {

				System.out.printf("%d x %d = %2d \n", x, i, x * i);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * <pre>
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9
	 * </pre>
	 */
	public void method7() {

		int count = 1;

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	
	
	/**<pre>
	 *   ****
	 *   ****
	 *   ****
	 *   ****
	 * </pre>
	 */
	public void method8() {
		
		for(int row = 0 ; row<4; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
		
	
	/**
	 * <pre>
	 *  *
	 *  **
	 *  ***
	 *  ****
	 * 
	 * </pre>
	 */
	public void method9() {

		for (int i = 0; i < 4; i++) {
			for (int x = 0; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	/** <pre>
	 * 
	 *    ****
	 *    ***
	 *    **
	 *    *
	 * 
	 * </pre>
	 */
	public void method10() {
		for (int i = 3; i >= 0; i--) {
			for (int x = 0; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}


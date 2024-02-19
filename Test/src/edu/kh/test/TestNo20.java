package edu.kh.test;

public class TestNo20 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=20) {
			if(i % 5 ==0 ) {
				System.out.println(i + " : 5의 배수 입니다.");
			}
			else {
				System.out.println(i + " : 5의 배수가 아닙니다.");
			}
			i++;
		}
	}
}

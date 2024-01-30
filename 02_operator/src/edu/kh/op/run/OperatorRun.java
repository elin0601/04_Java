package edu.kh.op.run;

import edu.kh.op.ex.OperatorEx;

/*
 * 실행용 클래스
 * */
public class OperatorRun {

	public static void main (String[] args) {
	 
		
		OperatorEx ex = new OperatorEx(); // 가져온 클래스를 이용해 객체 생성
		// ex.test();
		
		// ex.method1(); // 3의 배수 확인
		// ex.method2(); // 입력 받은 수1 가 입력 받은 수2 의 배수가 맞는지 확인
		// ex.method3(); // 입력 받은 수 홀/짝 판별 확인
		ex.method4(); // 입력 받은 수가 0인지 홀/짝 인지 판별 확인
 }
}

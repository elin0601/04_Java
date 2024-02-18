package src.edu.kh.condition.ex;

import java.util.Scanner;

/**
 * 조건문 기능용 클래스
 */
public class ConditionEx{
		
	// 필드 (== 객체의 속성 == 객체가 가지고 있는 값/변수)
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 나이를 입력 받아 
	 * 19세 이상은 "성인", 미만은 "성인이 아닙니다"
	 */
	public void method1() {
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		if (age >= 19) {
			System.out.println("성인");
			
		} else {
			System.out.println("성인이 아닙니다.");
		}
	}
	
	/**
	 * 나이를 입력받아
	 * 13세 이하면 "어린이"
	 * 13 초과 18세 이하 "청소년
	 * 18세 초과 "성인"
	 */
	public void method2() {
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String  result;
		
		if ( age <= 13 ) result = "어린이";
		else if ( age <= 18 ) result = "청소년";
		else result = "성인";

		System.out.println(result);
	}
	
	/**
	 * 달(월)을 입력 받아 해당 계절 출력하기
	 * <ul>
	 * 	<li>봄 : 3,4,5</li>
	 * 	<li>여름 : 6,7,8</li>
	 * 	<li>가을 : 9,10,11</li>
	 * 	<li>겨울 : 12,1,2</li>
	 * 	<li>그 외 : 잘못입력</li> 
	 * </ul>
	 */
	public void method3() {
		
		System.out.print("달(월)을 입력 : ");
		
		int month = sc.nextInt();
		String result;
		
		// if elseif else 문 이용
		 if (month >=3 && month <=5 ) result = "봄"; 
		 else if (month >=6 && month <=8 ) result = "여름";
		 else if (month >=9 && month <=11 ) result = "가을"; 
		 else if (month ==12 || month <= 2 ) result = "겨울"; 
		 else result = "잘못 입력";

		System.out.println(result);
	}
	
	 public void method3a() {

			System.out.print("달(월)을 입력 : ");
			
			int month = sc.nextInt();
			String result;
		
			 if (month <1 || month >12)result = "잘못 입력"; 
			 else if (month >=3 && month <=5 ) result = "봄";
			 else if (month >=6 && month <=8 ) result = "여름"; 
			 else if (month ==9 || month <= 11 ) result = "가을"; 
			 else result = "겨울";
			 
			 System.out.println(result);
	 }
	 
	 public void method3b() {
		 
		 System.out.print("달(월)을 입력 : ");
		 
		 int month = sc.nextInt();
		 if (month <1 || month >12) {
			 System.out.println("잘못 입력");
			 return;
		 }
		 
		 String result;
		 if (month >=3 && month <=5 ) result = "봄";
		 else if (month >=6 && month <=8 ) result = "여름"; 
		 else if (month ==9 || month <= 11 ) result = "가을"; 
		 else result = "겨울";
		 
		 System.out.println(result);
	 }
	 
	 public void method3c() {
			System.out.print("달(월) 입력 : ");
			int month = sc.nextInt();
			
			String result;
			
			switch(month) {
//				case 3:  case 4: case 5: result="봄"; break;
				case 3, 4, 5: result="봄"; break;  // month 가 3, 4, 5 인 경우
				case 6, 7, 8: result="여름"; break;  // month 가 6, 7, 8 인 경우
				case 9, 10, 11: result="가을"; break;  // month 가 9, 10, 11 인 경우
				case 12, 1, 2: result="겨울"; break;  // month 가 12, 1, 2 인 경우
				
				default : result = "잘못 입력";
			}
			
			System.out.println(result);
			
		}
	 
	 
	 /**
	 * P/F 판별하기
	 * <pre>
	 *  중간고사, 기말고사, 과제 점수를 입력받아 
	 *  총점 60점 이상일 경우 PASS, 아니면 FAIL
	 *  
	 *  - 중간고사(40%/ 0.4), 기말고사(50%/ 0.5), 과제(10%/ 0.1)
	 *  - 각각 100점 만점
	 *  
	 *   + PASS인 경우
	 *   90점 이상 A
	 *   80점 이상 B
	 *   70점 이상 C
	 *   60점 이상 D
	 *   
	 * </pre>
	 */
	public void method4() {
		 
		System.out.print("중간 고사 : ");
		int num1 = sc.nextInt();
		
		System.out.print("기말 고사 : ");
		int num2 = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int num3 = sc.nextInt();
		
		double sum = num1*0.4 + num2*0.5 + num3*0.1;
		
		
		// 변수에 아무런 값도 대입되지 않은 경우 사용 불가능(에러)
		// 해결 1) 모든 경우에 변수에 값을 대입
		// 해결 2) 변수 선언 시 특정한 값으로 초기화 진행
		// 				-> 숫자는 0, 
		// 					 String은 null / "", 
		//					 boolean은 false
		//					 이외의 객체는 null
		
//		String result= "";
//		String grade = "";
//		
//		if(sum >= 90) {
//			result = "PASS";
//			grade = "A";
//		}
//		else if (sum>=80) {
//			result = "PASS";
//			grade = "B";
//		}
//		else if (sum>=70) {
//			result = "PASS";
//			grade = "C";
//		}
//		else if (sum>=60) {
//			result = "PASS";
//			grade = "D";
//		}
//
//		else {
//			result = "FAIL";
//		}
//		
//		System.out.println("총 점 :" + sum);
//		System.out.println("등급 : " +grade);
//		System.out.println(result);
		
String result = ""; 
		
		if(sum >= 60) {
			//		result = "PASS";

			// switch문 매개변수로는 정수, 문자열, 문자만 가능
			switch((int) (sum/10) ) {
			case 10 : case 9 : result = "A"; break;
			case 8 : result = "B"; break;
			case 7 : result = "C"; break;
			case 6 : result = "D"; break;
			
			default : result = "."; break;
			}
		
		}
		else 	result = "FAIL";
		
		System.out.println(result);
	}
	

	/**
	 * <pre>
	 * 국어, 영어, 수학, 사탐, 과탐 점수를 입력 받아
	 * 40점 미만 과목이 있으면 FAIL 
	 * 평균이 60점 미만인 경우로 FAIL
	 * 
	 * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
	 * 
	 * [출력예시]
	 * 
	 * 1) 40점 미만 과목이 존재하는 경우
	 * 
	 * FAIL [40점 미만 과목 : 국어, 영어]
	 * 
	 * 2) 평균이 60점 미만인 경우
	 * 
	 *  FAIL [점수 : 50.4(평균 미달)]
	 *  
	 *  3) PASS인 경우 
	 *  
	 *  PASS [점수 : 83.4 / 100]
	 *  
	 * </pre>
	 */
	public void method5() {
		
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num2 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num3 = sc.nextInt();
		
		System.out.print("사탐 : ");
		int num4 = sc.nextInt();
		
		System.out.print("과탐 : ");
		int num5 = sc.nextInt();
		
		
		
		String result = "";
		
		boolean fail = false;
		
		
		
		if(num1 < 40) { result += "국어 "; fail = true; }
		if(num2 < 40) { result += "영어 "; fail = true; }
		if(num3 < 40) { result += "수학 "; fail = true; }
		if(num4 < 40) { result += "사회 "; fail = true; }
		if(num5 < 40) { result += "과학 "; fail = true; }
		
		if(fail) {
			System.out.printf("FAIL [40점 미만 과목 : %s] \n", result);
			return;
		}
		
		int sum = num1 + num2 + num3 +  num4 + num5;
		double avg = sum / 5.0;
		
		if(avg < 60.0) {
			System.out.printf("FAIL [점수 : %.1f (평균 미달)] \n", avg);
			return;
		}
		
		System.out.printf("PASS [점수 : %.1f / 100] \n", avg);
	}
	
}
	

	
	





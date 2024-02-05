package edu.kh.oarr.view;

import java.util.Scanner;

import edu.kh.oarr.model.dto.Student;
import edu.kh.oarr.model.service.StudentService;

// 입력, 출력을 담당하는 클래스(객체의 속성과 기능을 작성하는 설계도)
/**
 * 
 */
public class StudentView {
	
	// 필드(객체의 속성)
	
	// static이 붙은 필드 == 클래스 변수
	// static이 없는 필드 == 인스턴스 변수
	
	private Scanner sc = new Scanner(System.in);
	
	private StudentService service = new StudentService();
	
	/**
	 * 메뉴 포시 기능
	 */
	public void displayMenu() {
		
		int input =0; // 메뉴 번호를 입력 받을 변수
		
		do {
			System.out.println("\n----- 학생 관리 프로그램 -----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 이름으로 조회");
			System.out.println("5. 학생 정보 수정(인덱스)");
			System.out.println("6. 학생 1명 점수 조회(점수, 합계, 평균)");
			System.out.println("7. 평균 최고점, 최저점 학생");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			
			case 1 : addStudent(); 
				break;
			
			case 2 : selectAll();
				break;
			
			case 3 : selectIndex();
				break;
			
			case 4 : selectName(); 
				break;
			
			case 5 : updateStudent();
				break;
			
			case 6 : selectScore();
				break;
			
			case 7 : selectMaxMin();
				break;
			
			case 0 : System.out.println("[프로그램 종료]");  break;
			
			default : System.out.println("[잘못 입력]");
			}
			
			
		} while(input !=0);
		
	}
	
	
	/**
	 * 학생 추가 화면
	 * 
	 * 학번, 이름, 성별을 입력 받아
	 * StudentService 의 students 배열에 추가
	 */
	private void addStudent() {
		System.out.println("\n ---- 학생 추가 ----");
		
		System.out.print("학번 : ");
		String studentNumber = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("성별(M/F) : ");
		char gender= sc.next().toUpperCase().charAt(0);
		
		// 문자열.toUpperCase(); : 영어 대문자로 변경
		
		// 학생 추가 Service 메서드 호출 후 결과 반환 받기
		boolean result = service.addStudent(new Student(studentNumber, name, gender));
		
		if(result) {
			System.out.println(name + "학생이 추가 되었습니다.");
		}else {
			System.out.println("학생을 더 이상 추가할 수 없습니다.");
		}
		
		
	}
	
	private void selectAll() {
		System.out.println("\n ---- 학생 전체 조회 ----");
		
		
		// Service에 있는 students 배열 참조 주소 반환 받기
		Student[] studentList = service.getStudent();
		
		for(int i =0; i<studentList.length; i++) {
			
			// 학생이 없는 인덱스인 경우 반복 종료
			if(studentList[i]==null) break;
			
			System.out.println(i + "번째 인덱스\n" + studentList[i].toString());
			System.out.println();
		}
		
	}
	
	private void selectIndex() {
		System.out.println("\n---- 학생 1명 정보 조회(index 검색) ----");
		System.out.print("인덱스 입력 : ");
		int index = sc.nextInt();

		// Service로 index 전달 후 일치하는 학생이 있으면 반환 받기
		Student std = service.selectIndex(index);

		if (std == null)
			System.out.println("해당 인덱스에 학생이 존재하지 않습니다.");

		else {
			System.out.println("학번 : " + std.getStudentNumber());

			String temp = null;
			if (std.getGender() == 'F')
				temp = "여성";
			else
				temp = "남성";

			System.out.println("성별 : " + temp);
			System.out.println("이름 : " + std.getName());

			System.out.println("----- 점수 -----");

			System.out.println("HTML : " + std.getHtml());
			System.out.println("CSS : " + std.getCss());
			System.out.println("JS : " + std.getJs());
			System.out.println("JAVA : " + std.getJava());
			
		}
	}
	
	/**
	 * 이름으로 학생 조회
	 */
	private void selectName() {
		System.out.println("\n---- 이름으로 학생 조회 ----");
		System.out.print("이름 입력 : ");
		
		String name = sc.next();
		Student std = service.selectName(name);
		
		if (std == null)
			System.out.println("같은 이름의 학생이 존재하지 않습니다.");

		else {
			System.out.println("학번 : " + std.getStudentNumber());

			String temp = null;
			if (std.getGender() == 'F')
				temp = "여성";
			else
				temp = "남성";

			System.out.println("성별 : " + temp);
			System.out.println("이름 : " + std.getName());

			System.out.println("----- 점수 -----");

			System.out.println("HTML : " + std.getHtml());
			System.out.println("CSS : " + std.getCss());
			System.out.println("JS : " + std.getJs());
			System.out.println("JAVA : " + std.getJava());
			
		}
		
	}
	
	
	/**
	 * 인덱스를 먼저 입력 받아
	 * 해당 인덱스에 학생이 존재하면 
	 * 
	 * HTML, CSS, JS, JAVA 점수를 입력 받아
	 * 해당 학생에게 세팅(set)
	 */
	private void updateStudent() {
		System.out.println("\n---- 학생 정보 수정(인덱스) ----");
		System.out.print("수정할 학생의 인덱스 번호 입력 : ");
		
		int index = sc.nextInt();
		
		// 이미 사용했던 코드를 재사용함
		// 주소가 같아서 가능(얕은 복사)
		
		Student std = service.selectIndex(index);
		if(std == null) {
			System.out.println("해당 인덱스에 학생이 존재하지 않습니다.");
			return;
		}
		System.out.print("HTML, CSS, JS, JAVA 순서로 입력 : ");
		std.setHtml(sc.nextInt());
		std.setCss(sc.nextInt());
		std.setJs(sc.nextInt());
		std.setJava(sc.nextInt());
		
		System.out.println("수정 완료");
				
		}
		
	
	/**
	 * 학생 1명 점수 조회(점수, 합계, 평균)
	 * 
	 * 1) 인덱스를 입력 받아 해당 학생이 존재하는지 확인
	 * 
	 * 2) 있을 경우 service.selectScore(인덱스)를 호출한 후 
	 *    HTML(50) CSS(80) JS(100) JAVA(30)
	 *    합계 : 260
	 *    평균 : 
	 *    
	 *    형태의 문자열로 반환 받아와서 출력
	 */
	private void selectScore() {
		System.out.println("\n ---- 학생 1명 점수 조회(점수, 합계, 평균) ----");
		System.out.print("해당 학생의 인덱스 : ");
		
		int index = sc.nextInt();
	
		Student std = service.selectIndex(index);
		
		if(std == null) {
			System.out.println("해당 인덱스에 학생이 존재하지 않습니다.");
			return;
		}
		
		String result = service.selectScore(index);
		
		System.out.println(result);

	}
	
	/**
	 * 평균이 최고점인 학생과 최저점인 학생 조회
	 */
	private void selectMaxMin() {
		System.out.println("\n ---- 평균이 최고점, 최저점인 학생 조회 ----");
		
		 String result = service.selectMaxMin();
		
		 System.out.println(result);
	}
}
	



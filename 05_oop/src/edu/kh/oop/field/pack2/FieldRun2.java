package edu.kh.oop.field.pack2;

import edu.kh.oop.field.pack1.FieldTest1;

public class FieldRun2 extends FieldTest1{
											/* 상속 구문 */

	public static void main(String[] args) {
		
		FieldTest1 f1 = new FieldTest1();
		
		System.out.println(f1.publicValue); // 어디서든 접근 가능
		
		// System.out.println(f1.protectedValue); // 같은 패키지 + 상속
		
		// System.out.println(f1.defaultValue); // 같은 패키지
		
		// System.out.println(f1.privateValue); // 같은 클래스
	}
	

	public void method1() {
		
		// 다른 패키지이지만 상속 상태이기 때문에 
		// preotected 접근 제한자를 작성한 필드에 접근 가눙하다!!
		System.out.println(protectedValue);
	}
	
	
}

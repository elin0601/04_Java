package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.Calculator;
import edu.kh.poly.pack3.model.dto.LJSCalculator;
import edu.kh.poly.pack3.model.dto.Machine;

public class CaculatorRun {

	public static void main (String[] args) {
		
		// 인터페이스 장점 : 
		// 상속 받은 클래스들의 형태가 똑같거나 비슷하기 때문에
		// 코드 유지 보수 시
		// 참조하는 객체만 변경하면 유지 보수가 완료된다!!
		
		Calculator cal = new LJSCalculator();
		
		 System.out.println("PLUS : " + cal.plus(1, 2));
		 
		 System.out.println("MINUS : " + cal.minus(1, 2));
		 
		 System.out.println("MULTI : " + cal.multi(4, 2));
		 
		 System.out.println("DIV : " + cal.div(1, 0));
		 
		 System.out.println("MOD : " + cal.mod(1, 2));
		 
		 System.out.println("SUM : " + cal.sum(1, 2, 3, 4, 5, 6,7));
		 
		 System.out.println("areaOfCircle : " + cal.areaOfCircle(7));
		 
		 System.out.println("rangeCheck : " + cal.rangeCheck(6000000));
		 
		 System.out.println("pow : " + cal.pow(4, 3));
		 
		 System.out.println("2진수 : " + cal.toBinary(5));
		 
		 System.out.println("16진수 : " + cal.toHexadecimal(14));

		 
		 // 참조 변수의 자료형을 Machine으로 강제 형변환 해야지만
		 // powerOn/Off() 호풀 가능
		 
		 ((Machine)cal).powerOff();
		 ((Machine)cal).powerOn();
	}
}

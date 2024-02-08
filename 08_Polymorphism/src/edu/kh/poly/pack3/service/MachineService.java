package edu.kh.poly.pack3.service;

import edu.kh.poly.pack3.model.dto.Computer;
import edu.kh.poly.pack3.model.dto.Machine;
import edu.kh.poly.pack3.model.dto.Washer;

public class MachineService {
	
	public void method1() {
		
		// 인터페이스(접점)도 부모 타입 참조 변수로 사용 가능
		// -> 다형성의 업캐스팅
		//   + 매개 변수의 다형성
		//	 + 반환형의 다형성
		//	 + 부모 타입 객체 배열
		//	 + 동적 바인딩
		
		
		// Machine[] arr : Machine 배열을 참조하는 주소를 저장하는 참조형 변수 arr을 선언
		// new Machine[2] : Heap영역에 Machine 참조 변수 2칸 짜리 배열 생성
		Machine[] arr = new Machine[2];
		
		
		arr[0] = new Computer();
		arr[1] = new Washer();
		
		for(Machine temp : arr ) {
			
			temp.powerOn();
			temp.powerOff();
			System.out.println("--------------------------------------------------");
		}		
	}
}

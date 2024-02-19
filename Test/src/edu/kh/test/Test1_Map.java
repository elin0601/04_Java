package edu.kh.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test1_Map {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		
			// 시험 답안
			
//		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();
//		
//		ipInfoList.add(new IPInfo ("123.123.123.123", "홍길동"));
//		ipInfoList.add(new IPInfo ("212.133.7.8","이지수"));
//		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
//		
//		System.out.print("ip 입력 : ");
//		String ip = sc.nextLine();
//		
//		for (int i= 0; i<ipInfoList.size(); i++ ){
//			if(ipInfoList.get(i).getIp().equals(ip)) {
//				
//			System.out.println(ipInfoList.get(i));
//			return;
//			}
//			
//		}
//		
//		System.out.println("일치하는 ip 사용자가 없습니다.");
		
			
			
			// 연습
			
			Map<String, String> map = new HashMap<String, String>();

			map.put("123.123.123.123", "홍길동");
			map.put("212.133.7.8", "이지수");
			map.put("177.233.111.222", "고길순");

			Set<String> set = map.keySet();

			System.out.print("IP 입력 : ");
			String ip = sc.next();

			for (String key : set) {
				if (key.equals(ip)) {

					System.out.println(map.get(key));
					return;
				}
				
			}
			System.out.println("일치하는 ip 사용자가 없습니다.");
		}

	}



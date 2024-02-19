package edu.kh.test;

public class Banana {

	public static void main(String[] args) {

		String str = "banana";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			switch (ch) {

			case 'a':
				System.out.println(ch + " : 모음입니다");
				break;
			case 'e':
				System.out.println(ch + " : 모음입니다");
				break;
			case 'i':
				System.out.println(ch + " : 모음입니다");
				break;
			case 'o':
				System.out.println(ch + " : 모음입니다");
				break;
			case 'u':
				System.out.println(ch + " : 모음입니다");
				break;

			default:
				System.out.println(ch + " : 자음입니다");
			}
		}

	}

}

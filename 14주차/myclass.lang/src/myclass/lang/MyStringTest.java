package myclass.lang;

import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 

public class MyStringTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyString mStr = new MyString("20195138 김준호"); // MyString 클래스에 문자열 전달 
		
		System.out.println(mStr.length()); // 문자열 길이 출력
		System.out.println(mStr.charAt(7)); // 문자열의 엔덱스 위치 문자 출력 
		System.out.println(mStr.subString(0, 7)); // 0~7 까지의 문자열 출력 
		System.out.println(mStr.reverse()); // 문자열을 역으로 출력 
	}
}

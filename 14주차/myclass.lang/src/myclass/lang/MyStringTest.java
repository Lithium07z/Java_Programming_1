package myclass.lang;

import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 

public class MyStringTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyString mStr = new MyString("20195138 ����ȣ"); // MyString Ŭ������ ���ڿ� ���� 
		
		System.out.println(mStr.length()); // ���ڿ� ���� ���
		System.out.println(mStr.charAt(7)); // ���ڿ��� ������ ��ġ ���� ��� 
		System.out.println(mStr.subString(0, 7)); // 0~7 ������ ���ڿ� ��� 
		System.out.println(mStr.reverse()); // ���ڿ��� ������ ��� 
	}
}

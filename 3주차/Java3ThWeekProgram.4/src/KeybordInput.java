/*
 * 프로그램 작성일자: 2019.03.14
 * 프로그램 설명: 자바 프로그래밍1 강의 3주차 실습 프로그램, 직접만든 9번째 프로그램
 * 프로그램 수정 최종일자: 2019.03.14
 * 작성자: 김준호
 */
import java.util.Scanner;
public class KeybordInput {
	public static void main(String[] args) {
		int intValue;
		Scanner input = new Scanner(System.in);
		System.out.print("번호를 입력하세요 : ");
		intValue = input.nextInt();
		System.out.println("입력하신 번호는 " + intValue + "입니다.");
	}
}
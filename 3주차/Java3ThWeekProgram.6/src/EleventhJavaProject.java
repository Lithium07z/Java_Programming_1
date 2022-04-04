/*
 * 프로그램 작성일자: 2019.03.14
 * 프로그램 설명: 자바 프로그래밍1 강의 3주차 실습 프로그램, 직접만든 11번째 프로그램
 * 프로그램 수정 최종일자: 2019.03.14
 * 작성자: 김준호
 */
import java.util.Scanner;
public class EleventhJavaProject {
	public static void main(String[] args) {
		int menuNumber;
		
		Scanner input = new Scanner(System.in);
		System.out.println("/*******메뉴*****/");
		System.out.println("[1] 입력");
		System.out.println("[2] 출력");
		System.out.println("[3] 초기화");
		System.out.println("[4] 종료");
		System.out.println("메뉴를 선택하세요 : ");
		menuNumber = input.nextInt();
		System.out.println(menuNumber + "번 메뉴를 선택하셨습니다.");
	}

}

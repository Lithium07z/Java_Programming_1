/*
 * 프로그램 작성일자: 2019.03.14
 * 프로그램 설명: 자바 프로그래밍1 강의 3주차 실습 프로그램, 직접만든 14번째 프로그램
 * 프로그램 수정 최종일자: 2019.03.14
 * 작성자: 김준호
 */
import java.util.Scanner;
public class FourteenJavaProject {
	public static void main(String[] args) {
		int Stem; // 섭씨온도 변수
		int Htem; // 섭씨온도 변수
		
		Scanner inputValue = new Scanner(System.in);
		System.out.println("섭씨온도를 입력하세요 : ");
		Stem = inputValue.nextInt();
		
		Htem = 32 + Stem * 180/100;
		System.out.println("화씨온도는"+Htem+"입니다.");
					
	}
}

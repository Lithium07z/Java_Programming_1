/*
 * 프로그램 작성일자: 2019.03.14
 * 프로그램 설명: 자바 프로그래밍1 강의 3주차 실습 프로그램, 직접만든 13번째 프로그램
 * 프로그램 수정 최종일자: 2019.03.14
 * 작성자: 김준호
 */
import java.util.Scanner;
public class ThirteenJavaProject {
	public static void main(String[] args) {
		int value;
		int result;
		
		Scanner inputValue = new Scanner(System.in);
		
		System.out.print("x의 값을 입력하세요 : ");
		value = inputValue.nextInt();
		
		result = 3*value*value*value - 7*value*value + 9; 
	    System.out.println("다항식 3x^3 - 7x^2 + 9에서 x의 값이 " + value + "일 때 다항식의 값은 " + result + "입니다.");
			
	}
}

/*
 * 프로그램 작성일자: 2019.03.14
 * 프로그램 설명: 자바 프로그래밍1 강의 3주차 실습 프로그램, 직접만든 15번째 프로그램
 * 프로그램 수정 최종일자: 2019.03.14
 * 작성자: 김준호
 */
import java.util.Scanner;
public class FifteenJavaProject {
	public static void main(String[] args) {
		int pyung;
		double m2;
		
		Scanner inputValue = new Scanner(System.in);
		System.out.println("평수를 입력하세요 : ");
		pyung = inputValue.nextInt();
		
		m2 = (double)pyung * 3.3;
		System.out.printf("입력값 %d평은 %f 평방미터입니다. ", pyung , m2);
		
	}

}

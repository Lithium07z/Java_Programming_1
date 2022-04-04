/*
 * 프로그램 작성일자: 2019.03.14
 * 프로그램 설명: 자바 프로그래밍1 강의 3주차 실습 프로그램, 직접만든 10번째 프로그램
 * 프로그램 수정 최종일자: 2019.03.14
 * 작성자: 김준호
 */
import java.util.Scanner;
        public class TenthJavaProject {
        public static void main(String[] args) {
		int r;
		double area = 0.0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("반지름을 입력하세요 : ");
		r = input.nextInt();
		area = r * r * 3.14;
		System.out.println("반지름 5를 가지는 원의 면적은"+area+"입니다.");
	     }
	}




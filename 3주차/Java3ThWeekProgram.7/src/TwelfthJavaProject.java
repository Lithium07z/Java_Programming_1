/*
 * 프로그램 작성일자: 2019.03.14
 * 프로그램 설명: 자바 프로그래밍1 강의 3주차 실습 프로그램, 직접만든 12번째 프로그램
 * 프로그램 수정 최종일자: 2019.03.14
 * 작성자: 김준호
 */
import java.util.Scanner;
public class TwelfthJavaProject {
	public static void main(String[] args) {
		
		int lenght; // 필요한 변수를 선언하시오.
		int round;  // 길이, 너비, 높이, 부피
		int high;
		int volume; 
		
		Scanner inputValue = new Scanner(System.in);
		
		System.out.println("상자의 길이를 입력하시오 : "); //길이 입력
		lenght = inputValue.nextInt();
		System.out.println("상자의 너비를 입력하시오 : "); //너비 입력
		round = inputValue.nextInt();
		System.out.println("상자의 높이를 입력하시오 : "); //높이 입력
		high = inputValue.nextInt();
		
		volume = lenght * round * high; // 계산식 작성
		
		System.out.println("상자의 부피는 "+volume+"입니다."); // 결과 출력
	}
  }
/*
 * 프로그램 작성일자: 2019.03.19
 * 프로그램 작성자: 김준호
 * 프로그램 설명: 사용자로부터 입력받은 정수가 홀수 인지 짝수인지를 판단하는 프로그램, 4주차 실습 두 번째 문제
 * 프로그램 최종수정: 2019.03.19 PM 08:19
 * 
 */
import java.util.Scanner; // 키보드로부터 입력받기 위한 단계
public class Java4ThWeekProject2 {
	public static void main(String[] args) {
		int UnknownNumber; // 입력받게 될 정수를 저장할 변수 선언  
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : "); // 정수를 입력받음
		UnknownNumber = input.nextInt();
		if (UnknownNumber % 2 == 0) { // 입력받은 정수가 짝수일 경우
			System.out.println(UnknownNumber+"는 짝수입니다.");
		}
		else { // 입력받은 정수가 홀수일 경우 
			System.out.println(UnknownNumber+"는 홀수입니다.");
		}
		
  
	}
	

}

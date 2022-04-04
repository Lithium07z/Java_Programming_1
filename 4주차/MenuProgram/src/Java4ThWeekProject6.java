
/*
 * 프로그램 작성일자: 2019.03.19
 * 프로그램 작성자: 김준호
 * 프로그램 설명: 사용자에게 두 개의 숫자를 입력하도록 하여 가장 작은 수, 가장 큰 수, 
 *            합계 또는 평균 값 중 하나를 선택하여 계산하는 메뉴기반 프로그램, 4주차 실습 여섯 번째 문제
 * 프로그램 최종수정: 2019.03.21 AM 11:55
 * 
 */
import java.util.Scanner; // 키보드로부터 입력받기 위한 단계

public class Java4ThWeekProject6 {
	public static void main(String[] args) {
		int MenuNumber; // 스위치 번호를 입력 받기 위한 변수
		int FirstNumber; // 첫 번째로 입력받을 정수를 위한 변수
		int SecondNumber; // 두 번째로 입력받을 정수를 위한 변수
		double result = 0; // 실행한 결과 값을 저장하기 위한 변수

		Scanner input = new Scanner(System.in); // 키보드로부터 입력받기 위한 과정

		System.out.println("두 정수를 입력하세요: "); // 두 정수를 입력받음
		FirstNumber = input.nextInt();
		SecondNumber = input.nextInt();
		System.out.println("메뉴\n" + "1. 작은수\n" + "2. 큰수\n" + "3. 합계\n" + "4. 평균\n" + "5. 종료\n" + "메뉴를 선택하세요: ");
		MenuNumber = input.nextInt(); // 메뉴를 출력함

		switch (MenuNumber) // 5가지 목록의 메뉴
		{
		case 1:
			if (FirstNumber < SecondNumber)// 입력 받은 두 수 중에서 작은 수를 출력하는 케이스
				result = FirstNumber;
			else
				result = SecondNumber;
			break;
		case 2:
			if (FirstNumber > SecondNumber) // 입력 받은 두 수 중에서 큰 수를 출력하는 케이스
				result = FirstNumber;
			else
				result = SecondNumber;
			break;
		case 3: // 입력 받은 두 수의 합을 출력하는 케이스
			result = FirstNumber + SecondNumber;
			break;
		case 4: // 입력 받은 두 수의 평균을 출력하는 케이스
			result = ((double) FirstNumber + (double) SecondNumber) / 2.0;
			break;
		case 5: // 프로그램을 종료하는 케이스
			System.exit(0);
			break;
		default:
			System.out.println("메뉴선택오류"); // 예외값이 입력되었을때 오류를 출력하는 default
			break;

		}
		System.out.println("결과 :" + result); // 결과값을 출력함
	}

}

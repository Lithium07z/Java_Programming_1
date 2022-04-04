/*
 * 프로그램 작성일자: 2019.03.19
 * 프로그램 작성자: 김준호
 * 프로그램 설명: 두 수를 입력받아 두 수의 크기를 비교하는 프로그램, 4주차 실습 첫 번째 문제
 * 프로그램 최종수정: 2019.03.19 PM 08:18
 * 
 */
import java.util.Scanner; // 키보드로부터 입력받기 위한 단계
public class Java4ThWeekProject {
	public static void main(String[] args) {
		int FirstNumber; // 첫 번째로 입력받는 정수를 저장할 변수 선언
		int SecondNumber; // 두 번째로 입력받는 정수를 저장할 변수 선언 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 : "); // 첫 번째 정수를 입력 받아 변수에 저장
		FirstNumber = input.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : "); // 두 번째 정수를 입력 받아 변수에 저장 
		SecondNumber = input.nextInt();
		if (FirstNumber < SecondNumber) { // 첫 번째 정수보다 두 번째 정수가 클 경우
			System.out.println("결과 : 첫 번째 정수 "+FirstNumber+"이(가) 두 번째 정수 "+SecondNumber+"보다 작다.");
		}
			else if (FirstNumber > SecondNumber) { // 첫 번째 정수가 두 번째 정수보다 클 경우
				System.out.println("결과 : 첫 번째 정수 "+FirstNumber+"이(가) 두 번째 정수 "+SecondNumber+"보다 크다.");
			}
			     else { // 첫 번째 정수와 두 번째 정수가 같은 경우 
					System.out.println("결과 : 첫 번째 정수 "+FirstNumber+"이(가) 두 번째 정수 "+SecondNumber+"와 같다.");
				}
		
	}
	

}

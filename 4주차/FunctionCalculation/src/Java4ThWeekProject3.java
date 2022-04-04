/*
 * 프로그램 작성일자: 2019.03.19
 * 프로그램 작성자: 김준호
 * 프로그램 설명: 사용자로부터 x 값을 입력받아서 함수값을 계산하여 화면에 출력하는 프로그램, 4주차 실습 세 번째 문제
 * 프로그램 최종수정: 2019.03.19 PM 08:37
 * 
 */
import java.util.Scanner; // 키보드로부터 입력받기 위한 단계 
public class Java4ThWeekProject3 {
	public static void main(String[] args) {
		int Function; // 입력받게 될 정수를 저장할 변수 선언 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("계산값 x를 입력하시오 : "); // 정수를 입력받음
	    Function = input.nextInt();
		
		if ( Function <= 0 ) { // 입력받은 정수가 0과 같거나 그 이하일 경우
			Function = Function * Function * Function -  9 * Function + 2;
			System.out.println("함수 f(x)의 결과는 "+Function);
			}
		else { // 입력받은 정수가 0보다 클 경우 
			Function = 7 * Function + 2;
					System.out.println("함수 f(x)의 결과는 "+Function);
			}
		}
	}
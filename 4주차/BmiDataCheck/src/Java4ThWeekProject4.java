/*
 * 프로그램 작성일자: 2019.03.19
 * 프로그램 작성자: 김준호
 * 프로그램 설명: 사용자로부터 키와 몸무게를 입력받아 표준체중을 계산한 후 비만도를 계산하고 
 *            비만 정도에 따라 비만여부를 출력하는 판단하는 프로그램, 4주차 실습 네 번째 문제
 * 프로그램 최종수정: 2019.03.19 PM 08:55
 * 
 */
import java.util.Scanner; // 키보드로부터 입력받기 위한 단계 
public class Java4ThWeekProject4 {
	public static void main(String[] args) {
		int Height; // 키를 입력받기 위한 변수
		int Weight; // 몸무게를 입력받기 위한 변수 
		double StandardWeight; // 표준체중을 저장하기 위한 변수 
		double Fatness; // 비만도를 저장하기 위한 변수 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("키를 입력하세요: "); // 키를 입력받음
		Height = input.nextInt();
		System.out.println("몸무게를 입력하세요: "); // 몸무게를 입력받음 
		Weight = input.nextInt();
		
		StandardWeight = ( Height - 100 ) * 0.9; // 표준체중 계산식
		Fatness = ( Weight - StandardWeight ) / StandardWeight * 100; // 비만도 계산식
		
		if ( Fatness < 20 ) { // 비만도가 정상인 경우 
			System.out.println("비만도는 정상입니다.");
		}
		else if ( Fatness < 30 ) { // 비만도가 경도비만인 경우 
			System.out.println("비만도는 경도비만입니다.");
		}
		else if ( Fatness < 50) { // 비만도가 중등도비만인  경우
			System.out.println("비만도는 중등도비만입니다.");
		}
		else { // 비만도가 고도비만인 경우 
			System.out.println("비만도는 고도비만입니다.");
		}
		
	}

}

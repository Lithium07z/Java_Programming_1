/*
 * 프로그램 작성일자: 2019.03.19
 * 프로그램 작성자: 김준호
 * 프로그램 설명: 사용자로부터 2차 방정식의 계수 a , b , c를 실수로 입력받아 2차 방정식의
 *            근을 계산 출력하는 프로그램, 4주차 실습 다섯 번째 문제
 * 프로그램 최종수정: 2019.03.19 PM 09:53 > 2019.03.20 PM 04:47 ( 주석 추가 )
 * 
 */
import java.util.Scanner; // 키보드로부터 입력받기 위한 단계 
import java.math.*; // 루트 계산을 위해 sqrt 클래스를 쓰기 위한 단계
public class Java4ThWeekProject5 {
	public static void main(String[] args) {
		double A; // 2차 방정식의 계수 A
		double B; // 2차 방정식의 계수 B
		double C; // 2차 방정식의 계수 C 
		double D = 0.0; // 판별식 D
		double D2 = 0.0; // 판별식 D2
		double FirstX; // 첫 번째 근
		double SecondX; // 두 번째 근 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("2차 방정식의 계수 A를 입력하세요 : "); // 계수 A를 입력받음
		A = input.nextInt();
		System.out.println("2차 방정식의 계수 B를 입력하세요 : "); // 계수 B를 입력받음 
		B = input.nextInt();
		System.out.println("2차 방정식의 계수 C를 입력하세요 : "); // 계수 C를 입력받음 
		C = input.nextInt();
		
		D = B * B - 4 * A * C; // 판별식 D의 계산과정 
		D = Math.sqrt(D); // 판별식 D의 제곱근을 구하기 위해 선언
		
		if ( D > 0 ) { // 판별식 D가 0보다 큰 경우 
			FirstX = (-B + D) / 2 * A;
			SecondX = (-B - D) / 2 * A;
			System.out.println("첫 번째 실근은 "+FirstX+"이고 두 번째 실근은 "+SecondX+"이므로 '서로 다른 두 실근' 입니다.");
		}
		else if ( D == 0 ) { // 판별식 D가 0과 같은 경우 
			FirstX = SecondX = -( B / (2 * A) );
			System.out.println("첫 번째 실근은 "+FirstX+"이고 두 번째 실근은 "+SecondX+"이므로 '서로 같은 두 실근' 입니다.");
			
		}
		else { // 판별식 D가 0보다 작은 경우 
			D2 = 4 * A * C - B * B; // 판별식 D2의 계산과정 
			D2 = Math.sqrt(D2); // 판별식 D2의 제곱근을 구하기 위해 선언 
			FirstX = (-B + D2) ;
			SecondX = (-B - D2) ;
			System.out.println("첫 번째 실근은 "+FirstX+"i / "+(2*A)+"이고 두 번째 실근은 "+SecondX+"i / "+(2*A)+"이므로 '서로 다른 두 허근' 입니다.");
			
		}
		
	}

}

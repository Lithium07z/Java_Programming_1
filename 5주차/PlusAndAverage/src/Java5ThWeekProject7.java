/*
 * 프로그램 작성일자: 2019.03.26 
 * 프로그램 설명: 사용자로부터 0이 아닌 정수가 입력될 때 까지의 합과 평균을 계산하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.26 PM 11:54
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 Scanner를 불러옴
public class Java5ThWeekProject7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double integer; // 입력받을 정수를 저장하는 변수
		double plus = 0.0; // 합의 값을 저장하는  변수
		double average; // 평균의 값을 저장하는 변수 
		double loop = 1; // 루프한 횟수를 저장하는 변수
		
		do {
			System.out.println("정수입력 : "); // 정수를 입력받음 
			integer = input.nextInt();
			
			if (integer == 0) { // 만약 입력받은 정수가 0이라면 종료를 출력하고 do while 문을 빠져나옴
				System.out.println("종료");
				
				break;
			}
			
			plus += integer; // 합의 값을 다항연산자로 처리함 
			average = plus / loop; // 평균을 구하고 average함수에 저장함
			loop++;
			// 루프를 하면 무조건 0이 아닌 정수를 입력받기 때문에 
			// 루프 횟수로 합을 나누어 평균을 구함
			// 0을 입력받으면 종료되기 때문에 출력에는 문제없음
			System.out.println("합:"+plus); // 합 출력 
			System.out.println("평균: "+average); // 평균 출력
			
		} while (integer != 0); // 0이 아니라면 while문을 반복함
		
	}

}

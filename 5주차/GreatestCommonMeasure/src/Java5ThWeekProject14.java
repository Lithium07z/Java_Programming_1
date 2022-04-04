/*
 * 프로그램 작성일자: 2019.03.28 
 * 프로그램 설명: 사용자로부터 두 수를 입력받아 최대 공약수를 구하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.28 AM 11:38
 */
import java.util.Scanner; // 키보드로부터 값을 입력받기 위해 불러옴 
public class Java5ThWeekProject14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstNumber; // 첫 번째 수를 입력받아 저장하는 변수 
		int secondNumber; // 두 번째 수를 입력받아 저장하는 변수 
		int helpBox; // 두 수의 계산을 도우면서 값을 저장하는 변수 
		
		System.out.println("첫 번째 수를 입력하십시오 : ");
		firstNumber = input.nextInt(); // 첫 번째 수를 입력받음 
		System.out.println("두 번째 수를 입력하십시오 : ");
		secondNumber = input.nextInt(); // 두 번째 수를 입력받음 
		
		if ( firstNumber > secondNumber ) {
			// 입력받은 두 수 중에서 첫 번째 수가 더 큰 경우의 반복 
			while (secondNumber != 0) {
				// secondNumber의 값이 0이 될때까지 반복
				helpBox = firstNumber % secondNumber; 
				// 입력받은 두 수 중에서 작은 값으로 큰 값을 나누고 helpBox에 저장
				firstNumber = secondNumber;
				// 0이 될 때까지 나누어 다른 공약수를 구해야 하므로  위의 계산 중에서 작은 값을 저장함 
				secondNumber = helpBox;
				// 나머지를 다시 나누어 공약수를 구해야 하므로 secondNumber에 저장함 
				
			}
			System.out.println("최대 공약수는 "+firstNumber+" 입니다.");
		} else { // 입력받은 두  수 중에서 두 번째 수가 더 큰 경우의 반복 
			while (firstNumber != 0) { 
				// firstNumber의 값이 0이 될때까지 반복
				helpBox = secondNumber % firstNumber;
				// 입력받은 두 수 중에서 작은 값으로 큰 값을 나누고 helpBox에 저장
				secondNumber = firstNumber;
				// 0이 될 때까지 나누어 다른 공약수를 구해야 하므로  위의 계산 중에서 작은 값을 저장함 
				firstNumber = helpBox;
				// 나머지를 다시 나누어 공약수를 구해야 하므로 firstNumber에 저장함
			}
			System.out.println("최대 공약수는 "+secondNumber+" 입니다.");
			// 최대 공약수 출력 
		}
	
	}

}

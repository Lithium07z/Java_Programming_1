/*
 * 프로그램 작성일자: 2019.03.27 
 * 프로그램 설명: 사용자로부터 입력받은 숫자까지의 모든 숫자 중 소수만 출력하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.28 PM 12:10 
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
public class Java5ThWeekProject8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNumber; // 입력받은 값을 저장하는 변수 
		int loopCount; // 입력받은 값보다 작거나 같을 때 까지 증가하는 변수  
		int loopCount2; // loopCount보다 작을 때 까지 증가하는 변수 
		int logicCheck; // 소수와 소수가 아닌 수를 구별해 출력하기 위한 변수 
		
		System.out.println("출력 최대값 입력 : "); // 값을 입력받음 
		inputNumber = input.nextInt();
		
		for (loopCount = 2; inputNumber >= loopCount ; loopCount++) {
			// 입력받은 값보다 작거나 같을 때 까지 증가시킴
			logicCheck = 0; // logicCheck의 값을 초기화시킴 
			for (loopCount2 = 2; loopCount > loopCount2; loopCount2++) {
				// loopCount2의 값을 loopCount보다 작을 때 까지 증가시킴 
				if(loopCount % loopCount2 == 0) {
					// loopCount를 loopCount2로 나누어 소수인지 아닌지 판별함 
					logicCheck += 1;
					// loopCount의 값을 loopCount2로 나누었을 때의 값이 0이 나오면
					// 소수가 아니므로 logicCheck에 1을 더해 출력이 안되게 함 
					continue;
				}
				
			}	if (logicCheck == 0) { // logicCheck의 값이 0 이라면 소수를 출력함 
					System.out.println("소수 : "+loopCount);
					// 소수 출력
			}
			
		}
		
	}

}

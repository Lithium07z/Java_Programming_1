/*
 * 프로그램 작성일자: 2019.03.27  
 * 프로그램 설명: 피보나치수열을 출력하기위한 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.27 PM 10:17
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
public class Java5ThWeekProject12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lastTerm; // 피보나치수열의 마지막 항을 저장하는 변수 
		int sequence = 0; // 피보나치수열의 첫 번째 항
		int helpReturn = 1; // 피보나치수열의 두 번째 항
		int result; // 두 항의 값을 저장
		int total = 0; // 수열의 총 합계를 저장하는 변수 
		
		System.out.println("피보나치수열의 마지막 항을 입력하시오 : ");
		lastTerm = input.nextInt();
		// 피보나치수열의 마지막 항을 입력받음 
		
		for(; lastTerm >= 1; lastTerm--) {
			// 피보나치 수열의 항 만큼 반복해서 출력함 
			if (lastTerm == 1) { // 마지막 출력때는 ,를 제외하고 값만 출력함 
				System.out.print(sequence);
			} else { // 마지막 출력이 아닌 경우에는 ,와 함께 출력함 
				System.out.print(sequence+" , ");
			}
			result = sequence + helpReturn; // 항의 값을 더해 result에 저장함 
			sequence = helpReturn; // 두 항을 더하기 위해 이전 항의 값을 기억해야 하므로 sequence에 저장
			helpReturn = result; // 수열을 진행시키기 위해 다음 항의 값을 저장함 
			total = result; // 수열의 총 합계를 계산함
			
		}
		
		System.out.println("\n수열 합계 : "+total);
		// 수열의 총 합계를 출력함 
	}

}

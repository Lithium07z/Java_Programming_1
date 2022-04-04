/*
 * 프로그램 작성일자: 2019.03.26
 * 프로그램 설명: 입력한 숫자의 크기만큼 0부터 숫자를 나열하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.26 PM 05:21
 */
import java.util.Scanner; // 키보드로부터 입력을 받기 위해 불러옴
public class Java5ThWeekProject1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNumber; // 입력받을 숫자를 저장하기 위한 변수 
		int plusFunction; // 입력받은 숫자와 비교해 반복문의 횟수를 결정할 변수 
		
		System.out.println("크기입력 : "); // 숫자를 입력받기 위해 출력 
		inputNumber = input.nextInt(); 
		
		for (plusFunction = 0; inputNumber > plusFunction; plusFunction++) {
			// 초기값에 plusFunction을 0으로 설정하고 입력받은 숫자와 같으면 반복에서 탈출함
			System.out.print("["+plusFunction+"]"); // 반복해서 나오는 값들을 출력함 
			
		}
			
	
	}

}

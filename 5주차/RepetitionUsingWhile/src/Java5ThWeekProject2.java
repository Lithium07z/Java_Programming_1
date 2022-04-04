/*
 * 프로그램 작성일자: 2019.03.26
 * 프로그램 설명:입력한 숫자의 크기만큼 0부터 숫자를 나열하는 프로그램을 while문으로 작성함
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.26 PM 05:31
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
public class Java5ThWeekProject2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int inputNumber; // 입력받을 숫자를 저장하기 위한 변수 
		int plusFunction = 0; // 입력받은 숫자와 비교해 반복문의 횟수를 결정할 변수
                              // 0부터 시작해야하기 때문에 0을 대입한다.
		
		System.out.println("크기입력 : "); // 숫자를 입력받기 위해 출력 
		inputNumber = input.nextInt();
		
		while (inputNumber > plusFunction) { 
			System.out.print("["+plusFunction+"]");
			plusFunction++;
			// 입력받은 크기와 같을때까지 plusFunction에 1씩 더하고 
			// 값이 같아지면 반복문을 탈출한다. 
		}
		
	}

}

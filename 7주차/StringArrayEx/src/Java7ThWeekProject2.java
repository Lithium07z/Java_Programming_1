/**
 * 프로그램 수정일자: 2019.04.08
 * 프로그램 설명: 키보드로부터 문자열 5개를 입력받아 문자열 배열에 저장하고 출력하는 프로그램
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.11 AM 11:00
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
public class Java7ThWeekProject2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String [] keyBoard = new String [5]; // 5의 크기를 가지는 문자열 배열을 선언 
		int lp; // 반복문의 반복을 돕는 변수 선언 
		
		System.out.print("문자열을 입력하세요 : "); // 문자열을 입력받기 위해 출력 
		for (lp = 0; lp < 5; lp++) { // 반복문을 5번 반복 
			keyBoard[lp] = input.next(); 
			// 반복문이 작동되는동안 입력 받은 문자열을 keyBoard배열 에 넣음 

		}
		for (String opStr : keyBoard) { 
			// keyBoard 배열의 값을 opStr 배열에 넣는 과정을 반복 
			System.out.print(opStr+" "); // opStr에 입력된 문자열을 출력 
		}
	}
}

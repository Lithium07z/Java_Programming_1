/*
 * 프로그램 작성일자: 2019.03.26 
 * 프로그램 설명: 키보드로부터 1부터 9 사이의 정수를 입력받아 해당 구구단을 출력하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.26 PM 06:16
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴
public class Java5ThWeekProject5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int integer; // 출력할 구구단의 단수를 입력받고 저장하기 위한 변수 
		int multiplication; // 1, 2, 3...9까지 1씩 반복해서 증가할 수를 위한 변수 
		int result; // 계산한 결과 값을 저장할 변수 
		
		System.out.println("구구단 단을 입력하세요  : "); // 출력할 구구단의 단수를 입력받음
		integer = input.nextInt();
		
		for (multiplication = 1; multiplication < 10; multiplication++ ) {
			// 1부터 9까지 1씩 더해나가며 곱해나가기 위해 1을 저장하고 10과 같아지면 반복문을 탈출
			result = integer * multiplication;
			// 구구단 결과를 result 변수에 저장함
			System.out.println(integer+" * "+ multiplication+ " = " + result);
			// 구구단 결과를 출력함 
		}
	}

}

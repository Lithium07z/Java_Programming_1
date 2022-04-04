/*
 * 프로그램 작성일자: 2019.03.27
 * 프로그램 설명: 구구단을 2단부터 9단까지 모두 출력하는 프로그램 
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.27 PM 04:35
 */
public class Java5ThWeekProject9 {
	public static void main(String[] args) {
		int multiplication; // 1, 2...9단 까지 구구단의 앞 단수를 저장하는 변수
		int plusmultiply; // 1, 2...9단 까지 구구단의 뒤 단수를 저장하는 변수
		int result; // 구구단의 앞 뒷 단수 곱셈 결과를 저장하는 변수
		
		for (multiplication = 2; multiplication < 10; multiplication++) {
			// 구구단의 앞 단수를 2부터 9까지 증가시키는 for문
			for (plusmultiply = 1; plusmultiply < 10; plusmultiply++) {
				// 구구단의 뒷 단수를 1부터 9까지 증가시키는 for문
				result = multiplication * plusmultiply;
				// 구구단의 앞 뒷 단수 곱셈 결과를 저장
				System.out.println(multiplication+" * "+plusmultiply+" = "+result);
				// 구구단 결과를 출력함 
			}
			
		}
		
	}

}

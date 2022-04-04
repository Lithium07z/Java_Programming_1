/*
 * 프로그램 작성일자: 2019.03.27
 * 프로그램 설명: 1900년부터 2015년 까지 년도 중 윤년에 해당하는 년도만 출력하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.28 AM 11:41
 */
public class Java5ThWeekProject13 {
	public static void main(String[] args) {
		int yoonYear; // 윤년을 저장하는 변수 
		
		for (yoonYear = 1900; yoonYear <= 2015; yoonYear++) { 
			// yoonYear의 값을 1900년 부터 2015년까지 증가시키는 for문
			if ( (yoonYear % 4 == 0 && yoonYear % 100 != 0) || yoonYear % 400 == 0 ) {
				// 4와 400으로 나눈 나머지가 0이면서 100으로 나눈 나머지가 0이 아니라면 윤년으로 인식
				System.out.println(yoonYear); // 윤년 출력
			}
		}
	}

}

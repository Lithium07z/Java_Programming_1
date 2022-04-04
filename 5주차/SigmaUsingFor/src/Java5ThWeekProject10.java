/*
 * 프로그램 작성일자: 2019.03.27
 * 프로그램 설명: i를 1부터 30까지 증가시키며 (i * i + 1)의 식에 대입하고
 *            결과 값을 모두 더해 출력하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 작성일자: 2019.03.27 PM 04:47
 */
public class Java5ThWeekProject10 {
	public static void main(String[] args) {
	int i; // i 값을 저장할 변수 
	int result = 0; // (i * i + 1)식을 계산하고 저장할 변수
	
		for (i = 1; i <= 30; i++) {
			result += (i * i + 1);
			// i에 1부터 30까지의 값을 1씩 증가시키며 넣고 (i * i + 1)의 식을 계산한 후 result에 저장
		}
		System.out.println("결과 값 : "+result);
		// 결과 값을 출력함 
	}
	
}
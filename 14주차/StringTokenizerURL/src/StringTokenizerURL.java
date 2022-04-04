/**
 * 프로그램 작성일자: 2019.05.29
 * 프로그램 설명: 한림대학교 홈페이지 URL을 StringTokenizer를 이용해 나누어 출력하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.05.29
 */
import java.util.StringTokenizer; // StringTokenizer를 사용함 

public class StringTokenizerURL { // URL을 StringTokenizer를 이용해 나누는 클래스 
	public static void main(String[] args) {
		StringTokenizer url = new StringTokenizer("http://www.hallym.ac.kr", ":// .");
		// ://과 . delim 구분 문자로 http://www.hallym.ac.kr을 나눔 
		while (url.hasMoreTokens()) { // 다음 토큰이 있다면
			System.out.println(url.nextToken()); // 다음 토큰을 출력 
		}	
	}
}

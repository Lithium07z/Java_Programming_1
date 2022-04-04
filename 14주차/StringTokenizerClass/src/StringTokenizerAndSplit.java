import java.util.StringTokenizer; // 스트링토크나이저 사용을 위해 불러옴 

public class StringTokenizerAndSplit {
	public static void main(String[] args) {
		String delims = ","; // 스트링을 나눌 문자를 받음 
		String splitString = " one, two, three, four, five"; // 나눠질 문자열 설정 
		
		System.out.println("StringTokenizer Example: \n"); // 스트링 예시를 출력할 것임을 알림 
		StringTokenizer st = new StringTokenizer(splitString, delims); // 예시 문자열과 나눌 문자를 받는 스트링토크나이저 st를 설정 
		while (st.hasMoreElements()) { // st에 다음 Elements가 있을 때 까지 반복 
			System.out.println("StringTokenizer Output: " + st.nextElement());
			// 문자열을 ,으로 나누고 나뉘어진 토큰들을 출력 
		}
		System.out.println("\n\nSplit Example: \n"); // split으로 문자열을 나눔을 출력 
		String[] tokens = splitString.split(delims); // splitString의 문자열을 delims문자로 나누고 문자열 배열 tokens에 넣음
		int tokenCount = tokens.length; // tokens 배열의 길이 값을 tokenCount에 저장 
		for (int j = 0; j < tokenCount; j++) { // tokenCount의 크기만큼 반복 
			System.out.println("Split Output " + tokens[j]);
			// split으로 나눈 문자열의 토큰들을 출력 
		}
	}
}

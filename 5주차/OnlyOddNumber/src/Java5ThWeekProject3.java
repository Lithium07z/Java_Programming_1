/*
 * 프로그램 작성일자: 2019.03.26
 * 프로그램 설명: 1부터 10까지 숫자 중 for문을 이용해 홀수만 출력하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.26 PM 05:47
 */
public class Java5ThWeekProject3 {
	public static void main(String[] args) {
		int inputNumber; 
		
		for (inputNumber = 1; inputNumber < 10; inputNumber++) {
			// inputNumber에 1을 넣고 계속 1을 더하다가 10과 같아지면 반복문 탈출
			if (inputNumber % 2 == 1) 
			// inputNumber에 1씩 더하는 과정중 2로 나누었을때 나머지가 1이 나오면 출력
			System.out.print(inputNumber+"\t");
			// 숫자 사이의 거리를 주기위해 \t를 사용함 
		}
	}

}

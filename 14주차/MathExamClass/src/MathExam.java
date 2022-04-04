/**
 * 프로그램 작성일자: 2019.05.30
 * 프로그램 설명: Math클래스 예제
 * 프로그램 작성자: 20195138 김준호 
 * 프로그램 최종 수정일자: 2019.05.30 PM 12:39
 */
public class MathExam {
	public static void main(String[] args) {
		int i = 8;
		int j = -5;
		int max;
		
		// Math.log를 이용한 자연로그 값 구하기 
		System.out.println("Natural logarithm value of 2 is :" + Math.log(2));
		// Math.abs를 이용한 절대값 구하기 
		System.out.println("Absolute value of" + j + "is :" + Math.abs(i));
		System.out.println("Absolute value of" + j + "is :" + Math.abs(j));
		// Math.ceil을 이용한 천장값 구하기 
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.ceil(-42.4));
		// Math.floor를 이용한 바닥값 구하기
		System.out.println(Math.floor(30.1));
		// Math.max를 이용한 큰값 구하기
		max = Math.max(20, 40);
		System.out.println("Max value is " + max);
		// Math.pow를 이용한 승수 구하기
		System.out.println(Math.pow(2,2));
		// Math.sqrt를 이용한 루트값 구하기
		System.out.println(Math.sqrt(9));
		// Math.round를 이용한 반올림값 구하기 
		System.out.println(Math.round(20.5f));
		// Math.random을 이용한 랜덤값 구하기 
		System.out.println("Random numbers between 0,0 and 1.0 are");
		for (int k = 0; k < 5; k++) {
			System.out.println("Random Number [" + (k + 1) + "] : " + Math.random());
		}
		for (int l = 0; l < 5; l++) {
			System.out.println("Random Number [" + (l + 1) + "] :" + (int)(Math.random()*100));
		}
	}
}

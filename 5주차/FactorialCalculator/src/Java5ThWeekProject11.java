/*
 * 프로그램 작성일자: 2019.03.27     
 * 프로그램 설명: 사용자로부터 n 값을 입력 받고 n!(펙토리얼)을 구하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 작성일자: 2019.03.27 PM 08:49
 */
import java.util.Scanner;
public class Java5ThWeekProject11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int factorial; // 펙토리얼 계산할 값을 입력받고 저장하는 변수 
		long calculate; // 입력받은 펙토리얼 크기만큼 반복하기 위해 감소하는 변수 
		long calculate2 = 1; // 펙토리얼 계산과정의 값을 저장하는 변수 
		
		System.out.println("펙토리얼 n 값을 입력하시오 : "); // 펙토리얼 값을 입력받음 
		factorial = input.nextInt();
		
		for (calculate = factorial; calculate >= 1; calculate--) {
			// 입력받은 펙토리얼 만큼 반복하기 위해 calculate를 1보다 크거나 같을 때 까지 감소시킴
			calculate2 = calculate2 * calculate;
			// calculate와 calculate2를 곱한 값을  calculate2에 저장하면서
			// 펙토리얼 계산과정의 값들을 모두 더함 

		}
		System.out.println(factorial+"! = "+calculate2);
		// 계산한 펙토리얼 값 출력
	}

}

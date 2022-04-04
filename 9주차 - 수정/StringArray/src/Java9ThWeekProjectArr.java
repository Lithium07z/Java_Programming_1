/**
 * 프로그램 작성일자: 2019.04.25
 * 프로그램 설명: 다섯 개의 문자열을 저장하는 일차원 배열을 생성한 후 문자열 데이터를
 *            입력 받아 저장한 후 내용을 출력하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.25 AM 11:33
 */
import java.util.Scanner; //키보드로 입력받기 위해 불러옴 
public class Java9ThWeekProjectArr {
	public static void main(String[] args) {
		
		int i; // 반복문 작동을 위한 변수 i 선언
		String arr [] = new String[5]; // 5의 크기를 가지는 문자열 배열 선언
		Scanner scan = new Scanner(System.in); // 스캐너 사용을 위해 작성 
		
		for(i = 0; i < arr.length; i++) { // i가 arr 배열의 크기보다 작을 때 까지 반복 
			System.out.print("문자열 입력 : "); // 문자열을 입력받음 
			arr[i] = scan.next(); // 입력받은 문자열을 arr배열의  i위치에 저장함 
			
		}
		for(i = 0; i < arr.length; i++) { // i가 arr 배열의 크기보다 작을 때 까지 반복 
			System.out.println("arr[" + i + "]=" + arr[i]); // 배열 내의 값을 꺼내 출력함 
			
		for(String data : arr) // arr 배열의 값을 하나씩 꺼내 data 문자열에 넣음 
			System.out.println(data); // arr 배열로부터 받은 문자열을 출력함 
		}
		
		
	}

}

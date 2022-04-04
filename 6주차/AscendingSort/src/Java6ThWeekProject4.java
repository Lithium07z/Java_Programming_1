/**
 * 프로그램 작성일자: 2019.04.01
 * 프로그램 설명: 임의의 랜덤배열이 있을 때 값을 오름차순으로 정렬하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.04.01 PM 11:38
 */
import java.util.Arrays; // Arrays 함수를 쓰기 위해 불러옴 
public class Java6ThWeekProject4 {
	public static void main(String[] args) {
		int[] randomArray = { 5, 10, 3, 4, 1, 8, 7, 6, 9, 2};
		// randomArray 배열의 요소 값을 지정해 선언하고 초기화함 
		
		System.out.println("비정렬된 배열"); // 비정렬된 배열을 출력함을 알림 
		for (int irregularly : randomArray) // randomArray의 요소 값들을 꺼내어 irregularly에 넣음
			System.out.print(irregularly+" "); // 비정렬된 배열의 값들이 넣어진 irregularly를 출력함 
		Arrays.sort(randomArray); // randomArray배열을 오름차순으로 정렬함 
		System.out.println("\n정렬된 배열"); // 정렬된 배열을 출력함을 알림 
		for (int lineUp : randomArray) // // randomArray의 요소 값들을 꺼내어 lineUp에 넣음
			System.out.print(lineUp+" "); // 정렬된 배열의 값들이 넣어진 lineUp을 출력함 
	}

}
/**
 * 프로그램 작성일자: 2019.04.25
 * 프로그램 설명: 다차원 배열 3행 4열의 정수형 배열을 임의의 수로 초기화하고 저장된 내용을 출력하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.25 AM 11:33
 *
 */
public class Java9ThWeekProjectArr2 {
	public static void main(String[] args) {
		
		int[][] arr = {{110, 210, 310, 410}, // 2차원 배열 선언 
						{510, 610, 710, 810},
						{100, 110, 120, 130}};
		prn(arr); // prn 메서드에서 사용함을 알림 
	}
	public static void prn(int[][] arr) { // arr 배열을 사용하는 메서드 
		for(int r = 0; r < arr.length; r++) { // r이 arr의 행 보다 작을 때 까지 반복 
			for(int c = 0; c < arr[r].length; c++) { // c가 arr의 열 보다 작을 때 까지 반복 
				System.out.print((c==0)? "\n" : "\t"); // c가 0 이라면 \n를 0이 아니라면 \t를 실행
				System.out.print(r + "행" + c + "열:" + arr[r][c]); 
				// 각각의 행, 열에 저장된 값을 출력함 
			}
		}
	}

}

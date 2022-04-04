/**
 * 프로그램 수정일자: 2019.04.03
 * 프로그램 설명: 임의의 값을 가지는 랜덤 배열에 대해 각 행의 합을 저장하기 위한 배열을 선언하고 
 *            배열의 각 행의 합을 구 하는 프로그램 
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.04.04 AM 11:45
 */
public class Java6ThWeekProject5 {
	public static void main(String[] args) {
		int [][] arr = {{ 4, 2, 1, 2, 3, 4, 5, 6, 7, 8 }, // 2차원 배열을 선언과 동시에 초기화함 
	                    { 1, 2, 4, 3, 5, 2, 6, 7, 8, 9 },
	                    { 3, 2, 4, 5, 2, 3, 4, 5, 3, 1 }};
		int [] colSum = new int[10]; // 세로 행의 합을 저장하는 배열 
		int [] rowSum = new int[3]; // 가로 열의 합을 저장하는 배열 
		int loop; // 가로 열의 합을 구하는 반복문을 위한 변수 
		int loop2; // 가로 열의 합을 구하는 반복문을 위한 변수 
		int loop3; // 세로 행의 합을 구하는 반복문을 위한 변수 
		int loop4; // 세로 행의 합을 구하는 반복문을 위한 변수 
		int loop5; // arr배열과 가로행렬의 합을 출력하는 반복문을 위한 변수 
		int loop6; // arr배열과 가로행렬의 합을 출력하는 반복문을 위한 변수 
		int count = 0; // 가로행렬의 값을 rowSum배열에 누적시키기 위한 변수 
		int count2 = 0; // 세로행렬의 값을 colSum배열에 누적시키기 위한 변수 
		int count3 = 0; // arr배열의 10번째 숫자 이후마다 가로 열의 합을 출력시키기 위한 변수 
		int count4 = 0; // colSum배열을 출력하기 위한 변수 
		
		for (loop = 0; loop < 3; loop++) { // loop가 3보다 작을 때 까지 반복 
			for (loop2 = 0; loop2 < 10; loop2++) { // loop가 10보다 작을 때 까지 반복 
				rowSum[count] += arr[loop][loop2];
				// arr배열의 값을 꺼내어 rowSum배열의 요소에 누적시킴
			}
				count += 1; // count 값을 1 증가시킴 
		}
		for (loop3 = 0; loop3 < 10; loop3++) { // loop가 10보다 작을 때 까지 반복 
			for (loop4 = 0; loop4 < 3; loop4++) { // loop가 3보다 작을 때 까지 반복 
				colSum[count2] += arr[loop4][loop3];
				// arr배열의 값을 꺼내어 colSum배열의 요소에 누적시킴
			}
				count2 += 1; // count2 값을 1 증가시킴
		}
		for (loop5 = 0; loop5 < 3; loop5++) { // loop가 3보다 작을 때 까지 반복 
			for (loop6 = 0; loop6 < 10; loop6++) { // loop가 10보다 작을 때 까지 반복 
			System.out.print(arr[loop5][loop6]+" ");
			count3 += 1; // count3 값을 1 증가시킴 
			switch (count3) {
			case 10: System.out.println(rowSum[0]);
					break; // count3의 값이 10이면 rowSum배열의 0번째 요소를 출력함 
			case 20: System.out.println(rowSum[1]);
			         break; // count3의 값이 20이면 rowSum배열의 1번째 요소를 출력함 
			case 30: System.out.println(rowSum[2]);
			         break; // count3의 값이 30이면 rowSum배열의 2번째 요소를 출력함 
				}
			}
		}
		for (count4 = 0; count4 < 10; count4++) { // count4의 값이 10보다 작을 때 까지 반복
		System.out.print(colSum[count4]+" "); // colSum배열의 count4 값의 인덱스안에 요소 값을 출력
		}
	}
}

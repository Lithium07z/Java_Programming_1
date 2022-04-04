/**
 * 프로그램 작성일자: 2019.04.25
 * 프로그램 설명: 임의의 값을 가지는 2차원 배여을 선언하고 반복문을 이용해 초기화 한 뒤 각각의 행과 열의 합을 출력하는
 *            프로그램
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.25 PM 12:28
 */
public class Java9ThWeekProjectArr4 {
	public static void main(String[] args) {
		int [][] arr = new int [3][10]; // 3행 10열의 크기를 가지는 2차원배열 선언 
		int [] colSum = new int[10]; // 세로 행의 합을 저장하는 배열 
		int [] rowSum = new int[3]; // 가로 열의 합을 저장하는 배열 
		int i; // 가로 열의 합을 구하는 반복문을 위한 변수 
		int j; // 가로 열의 합을 구하는 반복문을 위한 변수 
		int k; // 세로 행의 합을 구하는 반복문을 위한 변수 
		int l; // 세로 행의 합을 구하는 반복문을 위한 변수 
		int m; // arr배열과 가로행렬의 합을 출력하는 반복문을 위한 변수 
		int n; // arr배열과 가로행렬의 합을 출력하는 반복문을 위한 변수 
		int count = 0; // 가로행렬의 값을 rowSum배열에 누적시키기 위한 변수 
		int count2 = 0; // 세로행렬의 값을 colSum배열에 누적시키기 위한 변수 
		int count3 = 0; // arr배열의 10번째 숫자 이후마다 가로 열의 합을 출력시키기 위한 변수 
		int count4 = 0; // colSum배열을 출력하기 위한 변수 
		int temp = 1; // arr[0][0]의 초기값을 1로 저장하기 위한 변수 
		
		for(int q = 0; q < arr.length; q++) { // q가 arr배열의 행의 크기보다 작을 때  까지 반복 
			for(int w = 0; w < arr[q].length; w++) { // w가 arr배열의 열의 크기보다 작을 때 까지 반복
				arr[q][w] = temp; // temp의 값을 arr[q][w]에 넣음 
				temp += 3; // temp를 3 증가시키고 저장 
				if (temp == 31) { // 만약 temp가 31이라면 
					temp = 2; // temp의 값을 2로 저장 
				} else if (temp == 32) { //만약 temp가 32라면
					temp = 3; // temp의 값을 3으로 저장 
				}
			}
		}
		
		for (i = 0; i < 3; i++) { // i가 3보다 작을 때 까지 반복 
			for (j = 0; j < 10; j++) { // j가 10보다 작을 때 까지 반복 
				rowSum[count] += arr[i][j];
				// arr배열의 값을 꺼내어 rowSum배열의 요소에 누적시킴
			}
				count += 1; // count 값을 1 증가시킴 
		}
		for (k = 0; k < 10; k++) { // k가 10보다 작을 때 까지 반복 
			for (l = 0; l < 3; l++) { // l이 3보다 작을 때 까지 반복 
				colSum[count2] += arr[l][k];
				// arr배열의 값을 꺼내어 colSum배열의 요소에 누적시킴
			}
				count2 += 1; // count2 값을 1 증가시킴
		}
		for (m = 0; m < 3; m++) { // m이 3보다 작을 때 까지 반복 
			for (n = 0; n < 10; n++) { // n이 10보다 작을 때 까지 반복 
			System.out.print(arr[m][n]+" ");
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

/**
 * 프로그램 작성일자: 2019.04.01 
 * 프로그램 설명: 랜덤한 10가지 값을 가지는  1차원 배열을 선언하고 초기화하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.04.01 PM 11:03
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
public class Java6ThWeekProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int random [] = { 1, 3, 2, 9, 5 , 6, 7, 8, 4, 10}; // random 배열의 값을 선언하고 초기화 함
		int[] copyArray = new int [10]; // Random 배열을 복사하기 위한 배열, random 배열을 복사해야 하기 떼문에 같은 크기로 선언하고 초기화 함
		int loop; // for문의 반복을 위해 만든 변수 
		int sum = 0; // 배열의 누적합을 저장하기 위한 변수 
		int inputNum; // 찾고자하는 값을 입력받아 저장하기 위한 변수 
		int count = 0; // 배열에 있는 홀수의 갯수를 세고 저장하기 위한 변수 
		int sumOddNum = 0; // 배열에 있는 홀수를 모두 더하고 저장하기 위한 변수 
		
		for(loop = 0; loop < random.length; loop++) { // loop의 값이 Random배열의 크기보다 작을때 까지 반복
		    copyArray[loop] = random[loop]; // Random배열의 값들을 copyArray배열로 복사함
		    sum += random[loop]; // 0 ~ 9 요소의 값을 모두 누적해 sum에 저장함 
		}
		System.out.println("배열 누적합 : "+sum); // 배열의 누적합을 출력 
		
		System.out.print("찾고자하는 값을 입력하세요 : "); // 찾고자하는 값을 입력받음 
		inputNum = input.nextInt();
		
		for(loop = 0; loop < random.length; loop++) { // loop의 값이 Random배열의 크기보다 작을때 까지 반복
			if (random[loop] == inputNum)
				//만약 입력받은 값이 Random배열의 요소들 중 하나와 같다면 
				System.out.println("값 "+inputNum+"의 인덱스는 "+"["+loop+"]"+"입니다.");
				// 입력 받은 값의 배열 내 인덱스 값을 출력함 
		}
		for(loop = 0; loop < random.length; loop++) { // loop의 값이 Random배열의 크기보다 작을때 까지 반복
			if (random[loop] % 2 != 0) { // Random배열의 요소들 중 2로 나누었을 때의 나머지가 0이 아니라면
				count += 1; // count 변수에 1을 더하고 저장한다
				sumOddNum += random[loop]; // Random배열의 요소 값을 sumOddNum에 더해 저장한다
			}
		}
		System.out.println("홀수의 개수 : "+count+"개"); // 배열 내의 홀수 갯수를 출력함 
		System.out.println("홀수의 합 : "+sumOddNum); // 배열 내 홀수의 합을 출력함 
	}

}

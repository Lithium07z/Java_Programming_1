/**
 * 프로그램 작성일자: 2019.05.07
 * 프로그램 설명: 클래스와 메서드를 이용해 구구단을 출력하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.05.09 AM 11:40
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
public class GuguTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Gugu dan2 = new Gugu(); // Gugu 클래스를 dan2라는 이름으로 사용함 
		int dan; // 사용자로부터 단을 입력받아 저장하기 위한 변수 
		System.out.println("단을 입력하세요 : "); // 단을 입력받음 
		dan = input.nextInt();
		dan2.setDan(dan); // dan2의 setDan에서 dan변수를 사용함 
		dan2.printGugu(); // dan2의 printGugu메서드를 사용함 
	}
}

class Gugu {
	private int dan; // 메서드를 통해서만 단 값을 받는 변수
	public void setDan(int dan) { // main으로부터 dan 값을 받음 
		this.dan = dan; // 받은 값을 Gugu 클래스의 dan에게 저장함 
	}
	public void printGugu() { // 구구단을 출력하는 메서드
		for(int i = 1; i <= 9; i++) { // i 가 1부터 9보다 작거나 같을 때 까지 반복 
			System.out.println(dan + " * " + i + " = " + dan*i ); // 구구단 출력 
		}
	}	
}
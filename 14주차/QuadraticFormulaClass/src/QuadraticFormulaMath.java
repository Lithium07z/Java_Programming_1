/**
 * 프로그램 작성일자: 2019.05.29
 * 프로그램 설명: Math클래스를 이용해 근의 공식의 해를 구하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.05.29
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 

public class QuadraticFormulaMath {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 스캐너를 input이라는 이름으로 사용 
		Calculate clc = new Calculate(); // Calculate 클래스를 clc라는 이름으로 사용 
		
		System.out.println("a, b, c값을 입력하세요 : "); // 근의 공식의 a, b, c값을 입력받음
		clc.QuadraticFormula(input.nextDouble(), input.nextDouble(), input.nextDouble());
		// 입력받은 a, b, c 값을 Calculate 클래스의 QuadraticFormula로 보냄
		System.out.println(clc.toString()); // toString을 통해 계산결과를 받아 출력함 
	}
}

class Calculate { // 근의 공식 계산 및 리턴을 위한 클래스 
	private static Double[] save = new Double[2]; // 근의 공식으로 만들어진 두 근을 저장하기 위한 배열
	public static void QuadraticFormula(Double a, Double b, Double c) { // a, b, c를 받아 근의 공식에 대입해 계산하는 메서드 
		save[0] = ((-b + Math.sqrt(b*b - 4*a*c))/(2*a)); // 근의 공식 +의 경우를 배열에 저장 
		save[1] = ((-b - Math.sqrt(b*b - 4*a*c))/(2*a)); // 근의 공식 -의 경우를 배열에 저장 
	}
	public String toString() { // 계산결과를 리턴하기 위한 메서드 
		return "x = " + save[0] + ", " + save[1]; // 계산 결과의 근 2개를 리턴 
	}
}

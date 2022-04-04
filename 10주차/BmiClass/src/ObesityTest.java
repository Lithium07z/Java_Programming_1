/**
 * 프로그램 작성일자: 2019.04.24
 * 프로그램 설명: 사용자로부터 키와 몸무게를 입력받아 표준체중을 계산한 후 비만도를 계산하고
                              비만 정도에 따라 비만여부를 출력하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.29 PM 7:20
 */
import java.io.*;
import java.util.Scanner;
class Obesity{ // 비만도를 계산하는 클래스 
	private double height; // 메서드를 통해서만 키를 받는 변수
	private double weight; // 메서드를 통해서만 몸무게를 받는 변수
	private double bmi; // 메서드를 통해서만 비만도를 받는 변수 
	private double standardWeight; // 메서드를 통해서만 표준체중을 받는 변수 
	
	public double calcBmi(double bmi) {
		this.bmi = (weight - standardWeight) / standardWeight * 100; // bmi를 계산함
		return this.bmi; // bmi 값을 리턴함 
	}
	public String printBmi() { // 값을 출력하기 위한 메서드 
		String p = null; // String p의 값을 null로 초기화
		if (bmi < -20) { // 만약 bmi가 -20보다 낮다면 
			p = "저체중"; // p에 "저체중"을 저장
		} else if (-20 <= bmi & bmi < 20) { // bmi가 -20과 20 사이에 있다면
			p = "정상"; // p에 "정상"을 저장
		} else if (20 <= bmi & bmi  < 30) { // bmi가 20과 30 사이에 있다면
			p = "경도비만"; // p에 "경도비만"을 저장 
		} else if (30 <= bmi & bmi < 50) { // bmi가 30과 50 사이에 있다면 
			p = "중증비만"; // p에 "중증비만"을 저장 
		} else if (bmi > 50) { // bmi가 50 이상이라면 
			p = "고도비만"; // p에 "고도비만"을 저장 
		}
		return p; // p의 값을 리턴함 

	}
	public void setHeight(double height) { // ObesityTest 클래스의 ipheight 변수를 사용하는 메서드
		this.height = height; // ObesityTest 클래스의 ipheight 변수를 Obesity 클래스의 height에 저장
	}
	public void setWeight(double weight) { // ObesityTest 클래스의 ipweight 변수를 사용하는 메서드
		this.weight = weight; // ObesityTest 클래스의 ipweight 변수를 Obesity 클래스의 weight에 저장
	}
	public void calcStandardWeight() { // 표준체중을 계산하는 메서드
		standardWeight = (height - 100) * 0.9; // 표준체중을 계산하고 standardWeight 변수에 저장 
	}
}
class ObesityTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 스캐너 클래스를 사용함 
		double bmi; // bmi를 저장할 변수
		double ipHeight; // ipHeight를 저장할 변수
		double ipWeight; // ipWeight를 저장할 변수 

		System.out.println("키를 입력하세요 : "); // 키를 입력받음
		ipHeight = input.nextDouble();
		System.out.println("몸무게를 입력하세요 : "); // 몸무게를 입력받음 
		ipWeight = input.nextDouble();
		Obesity ob = new Obesity(); // Obesity 클래스를 사용함 
		ob.setHeight(ipHeight); // ipHeight 변수를 setHeight 메서드에서 사용함
		ob.setWeight(ipWeight); // ipWeight 변수를 setWeight 메서드에서 사용함
		ob.calcStandardWeight(); // calcStandardWeight 메서드에 아무런 값도 사용하지 않음
		bmi = ob.calcBmi(ipWeight);
		// ipWeight 변수를 calcBmi 클래스에서 사용하고 결과 값을 bmi에 저장
		System.out.println("비만도는 " + (int)bmi +"(으)로 " + ob.printBmi() + "입니다");
		// 비만도와 비만도에 따른 유형을 출력함 
	}
}

/**
 * ���α׷� �ۼ�����: 2019.04.24
 * ���α׷� ����: ����ڷκ��� Ű�� �����Ը� �Է¹޾� ǥ��ü���� ����� �� �񸸵��� ����ϰ�
                              �� ������ ���� �񸸿��θ� ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.04.29 PM 7:20
 */
import java.io.*;
import java.util.Scanner;
class Obesity{ // �񸸵��� ����ϴ� Ŭ���� 
	private double height; // �޼��带 ���ؼ��� Ű�� �޴� ����
	private double weight; // �޼��带 ���ؼ��� �����Ը� �޴� ����
	private double bmi; // �޼��带 ���ؼ��� �񸸵��� �޴� ���� 
	private double standardWeight; // �޼��带 ���ؼ��� ǥ��ü���� �޴� ���� 
	
	public double calcBmi(double bmi) {
		this.bmi = (weight - standardWeight) / standardWeight * 100; // bmi�� �����
		return this.bmi; // bmi ���� ������ 
	}
	public String printBmi() { // ���� ����ϱ� ���� �޼��� 
		String p = null; // String p�� ���� null�� �ʱ�ȭ
		if (bmi < -20) { // ���� bmi�� -20���� ���ٸ� 
			p = "��ü��"; // p�� "��ü��"�� ����
		} else if (-20 <= bmi & bmi < 20) { // bmi�� -20�� 20 ���̿� �ִٸ�
			p = "����"; // p�� "����"�� ����
		} else if (20 <= bmi & bmi  < 30) { // bmi�� 20�� 30 ���̿� �ִٸ�
			p = "�浵��"; // p�� "�浵��"�� ���� 
		} else if (30 <= bmi & bmi < 50) { // bmi�� 30�� 50 ���̿� �ִٸ� 
			p = "������"; // p�� "������"�� ���� 
		} else if (bmi > 50) { // bmi�� 50 �̻��̶�� 
			p = "����"; // p�� "����"�� ���� 
		}
		return p; // p�� ���� ������ 

	}
	public void setHeight(double height) { // ObesityTest Ŭ������ ipheight ������ ����ϴ� �޼���
		this.height = height; // ObesityTest Ŭ������ ipheight ������ Obesity Ŭ������ height�� ����
	}
	public void setWeight(double weight) { // ObesityTest Ŭ������ ipweight ������ ����ϴ� �޼���
		this.weight = weight; // ObesityTest Ŭ������ ipweight ������ Obesity Ŭ������ weight�� ����
	}
	public void calcStandardWeight() { // ǥ��ü���� ����ϴ� �޼���
		standardWeight = (height - 100) * 0.9; // ǥ��ü���� ����ϰ� standardWeight ������ ���� 
	}
}
class ObesityTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // ��ĳ�� Ŭ������ ����� 
		double bmi; // bmi�� ������ ����
		double ipHeight; // ipHeight�� ������ ����
		double ipWeight; // ipWeight�� ������ ���� 

		System.out.println("Ű�� �Է��ϼ��� : "); // Ű�� �Է¹���
		ipHeight = input.nextDouble();
		System.out.println("�����Ը� �Է��ϼ��� : "); // �����Ը� �Է¹��� 
		ipWeight = input.nextDouble();
		Obesity ob = new Obesity(); // Obesity Ŭ������ ����� 
		ob.setHeight(ipHeight); // ipHeight ������ setHeight �޼��忡�� �����
		ob.setWeight(ipWeight); // ipWeight ������ setWeight �޼��忡�� �����
		ob.calcStandardWeight(); // calcStandardWeight �޼��忡 �ƹ��� ���� ������� ����
		bmi = ob.calcBmi(ipWeight);
		// ipWeight ������ calcBmi Ŭ�������� ����ϰ� ��� ���� bmi�� ����
		System.out.println("�񸸵��� " + (int)bmi +"(��)�� " + ob.printBmi() + "�Դϴ�");
		// �񸸵��� �񸸵��� ���� ������ ����� 
	}
}

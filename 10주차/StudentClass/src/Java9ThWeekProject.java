/**
 * ���α׷� �ۼ�����: 2019.04.24
 * ���α׷� ����: Student Ŭ������ �����ϱ����� main �޼ҵ带 ������ StudentEx Ŭ������ �ۼ��ϰ� 
 *            3���� �л���ü�� �����ϰ� ������ ������ �����ϰ� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.04.29 PM 09:30
 */
import java.io.*;

	class Student{ // �л������� �����ϴ� Ŭ����
		private String student_No; // �޼��带 ���ؼ��� �й��� �޴� ����
		private String student_Name; // �޼��带 ���ؼ��� �л� �̸��� �޴� ����
		private int grade; // �޼��带 ���ؼ��� �г��� �޴� ����
		private String dept; // �޼��带 ���ؼ��� �а��� �޴� ���� 

		public String getStudent_No() {
			return student_No; // �й��� ������ 
		}
		public String getStudent_Name() {
			return student_Name; // �̸��� ������ 
		}
		public int getGrade() {
			return grade; // �г��� ������ 
		}
		public String getDept() {
			return dept; // ������ ������ 
		}
		public void setStudent_No(String student_No) {
			// Java9ThWeekProject Ŭ�������� �й��� �޾� Student Ŭ������ student_No�� �����ϴ� �޼���
			this.student_No = student_No; 
			// Java9ThWeekProject Ŭ�������� ���� �й��� Student Ŭ������ student_No�� ������
		}
		public void setStudent_Name(String student_Name) {
			// Java9ThWeekProject Ŭ�������� �̸��� �޾� Student Ŭ������ student_Name�� �����ϴ� �޼���
			this.student_Name = student_Name;
			// Java9ThWeekProject Ŭ�������� ���� �̸��� Student Ŭ������ student_Name�� ������
		}
		public void setGrade(int grade) {
			// Java9ThWeekProject Ŭ�������� �г��� �޾� Student Ŭ������ grade�� �����ϴ� �޼���
			this.grade = grade;
			// Java9ThWeekProject Ŭ�������� ���� �г��� Student Ŭ������ grade�� ������
		}
		public void setDept(String dept) {
			// Java9ThWeekProject Ŭ�������� �а��� �޾� Student Ŭ������ dept�� �����ϴ� �޼���
			this.dept = dept;
			// Java9ThWeekProject Ŭ�������� ���� �а��� Student Ŭ������ dept�� ������
		}
		
		public String toString(){ // ����� ���� �޼���
			return "�й�: " + student_No + "\n�̸�: " + student_Name + "\n�г�: " + grade + "\n�а�: " + dept;
		} // �й�, �̸�, �г�, �а��� ������ 
	}
		
class Java9ThWeekProject {
		public static void main(String[] args) {
			Student str1 = new Student(); // Student Ŭ������ ����� 
			str1.setStudent_No("20195138"); // setStudent_No �޼��忡 ���� �� 
	        str1.setStudent_Name("����ȣ"); // setStudent_Name �޼��忡  ���� �� 
	        str1.setGrade(1); // setGrade �޼��忡 ���� �� 
	        str1.setDept("����Ʈ�������մ���"); // setDept �޼��忡 ���� �� 
			System.out.println( str1.toString() ); // toString�� ����� 
			
		}
	}
/**
 * ���α׷� �ۼ�����: 2019.04.29
 * ���α׷� ����: 3���� �л���ü�� �����ϰ� ������ ������ �����ϰ� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.04.29 PM 09:49
 */
import java.io.*;

	class Student1{
		private String student_No;
		private String student_Name;
		private int grade;
		private String dept;

		public String student_No() {
			return student_No;
		}
		public String student_Name() {
			return student_Name;
		}
		public int grade() {
			return grade;
		}
		public String dept() {
			return dept;
		}
		public void setStudent_No(String student_No) {
			this.student_No = student_No;
		}
		public void setStudent_Name(String student_Name) {
			this.student_Name = student_Name;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		public String toString(){
			return "�й�: " + student_No + "\n�̸�: " + student_Name + "\n�г�: " + grade + "\n�а�: " + dept;
		}
	}
	class Student2{
		private String student_No;
		private String student_Name;
		private int grade;
		private String dept;

		public String student_No() {
			return student_No;
		}
		public String student_Name() {
			return student_Name;
		}
		public int grade() {
			return grade;
		}
		public String dept() {
			return dept;
		}
		public void setStudent_No(String student_No) {
			this.student_No = student_No;
		}
		public void setStudent_Name(String student_Name) {
			this.student_Name = student_Name;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		public String toString(){
			return "\n�й�: " + student_No + "\n�̸�: " + student_Name + "\n�г�: " + grade + "\n�а�: " + dept;
		}
	}
	class Student3{
		private String student_No;
		private String student_Name;
		private int grade;
		private String dept;

		public String student_No() {
			return student_No;
		}
		public String student_Name() {
			return student_Name;
		}
		public int grade() {
			return grade;
		}
		public String dept() {
			return dept;
		}
		public void setStudent_No(String student_No) {
			this.student_No = student_No;
		}
		public void setStudent_Name(String student_Name) {
			this.student_Name = student_Name;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		public String toString(){
			return "\n�й�: " + student_No + "\n�̸�: " + student_Name + "\n�г�: " + grade + "\n�а�: " + dept;
		}
	}
		
class StudentEx {
		public static void main(String[] args) {
			Student1 str1 = new Student1();
			Student2 str2 = new Student2();
			Student3 str3 = new Student3();
			str1.setStudent_No("20195138");
	        str1.setStudent_Name("����ȣ");
	        str1.setGrade(1);
	        str1.setDept("����Ʈ�������մ���");
	        str2.setStudent_No("�� �� ����");
	        str2.setStudent_Name("��ȫ��");
	        str2.setGrade(1);
	        str2.setDept("����Ʈ�������մ���");
	        str3.setStudent_No("20195264");
	        str3.setStudent_Name("ä����");
	        str3.setGrade(1);
	        str3.setDept("����Ʈ�������մ���");
			System.out.println( str1.toString() );
			System.out.println( str2.toString() );
			System.out.println( str3.toString() );
			
		}
	}

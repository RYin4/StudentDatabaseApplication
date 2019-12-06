package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//ask how many students user wants to add
		System.out.println("Enter number of students you want to enroll");
		Scanner input = new Scanner(System.in);
		int numOfStudents = input.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
		}
		
		for (int n = 0; n < students.length; n++) {
			System.out.println();
			System.out.println(students[n].showInfo());
		}
		

	}

}

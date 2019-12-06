package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	//true for all objects. belongs to class not instance of object
	private static int costOfCourse = 500;
	private static int id = 1000;
	
	//constructor - prompt name and year
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = input.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = input.nextLine();
		
		System.out.print("\n1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = input.nextInt();
		
		setStudentID();
		
//		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
	}
	 
	//generate a student id
	private void setStudentID() {
		this.studentID = gradeYear + "" + id;
		id++;
	}
	
	//enroll in courses
	public void enroll() {
		
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter course to enroll (q to quit): ");
			String course = input.nextLine();
			if (!course.equals("q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);

		System.out.println("\nEnrolled in: " + courses);
		System.out.println("Tuition Balance: $" + tuitionBalance);
	}
	
	//view balance
	public void viewBalance() {
		System.out.println("Your Balance is: $" + tuitionBalance);
	}
	
	//pay tuition
	public void payTuition() {
		System.out.print("Enter your payment amount: $");
		Scanner input = new Scanner(System.in);
		int payment = input.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
	}
	
	
	//show student status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Year: " + gradeYear + 
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
	}
}

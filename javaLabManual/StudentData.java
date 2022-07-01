import java.util.Scanner;

public class StudentData {
	float marks[] = new float[4];
	int rollNo[] = new int[1];
	char name[] = new char[20];
	boolean failed;
	
	StudentData() {
		for(float m:marks) {
			m = 0;
		}
		rollNo[0]=0;
	}
	
	void inputData() {
		System.out.print("Welcome\nEnter your Name : ");
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		name = temp.toCharArray();
		System.out.print("Enter your Roll No : ");
		rollNo[0] = sc.nextInt();
		for (int i = 0; i < (marks.length-1); i++) {
			System.out.print("Mark for Subject "+(i+1)+" : ");
			marks[i] = sc.nextFloat();
		}
		sc.close();
	}
	
	void computeMarks() {
		marks[3]=0;
		failed = false;
		for (int i = 0; i < (marks.length-1); i++) {
			if (marks[i]<50) {
				failed = true;
			}
			marks[3] = marks[3] + marks[i];
		}
	}
	
	void displayDetails() {
//		computeMarks();
		System.out.print("\nStudent Name : ");
		for (char letters : name) {
			System.out.print(letters);
		}
		System.out.println("\nRoll No : "+rollNo[0]);
		System.out.print("Status : ");
		if (failed) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Passed");
		}
		for (int i = 0; i < (marks.length-1); i++) {
			System.out.println("Mark for Subject "+(i+1)+" : "+marks[i]);
		}
		System.out.println("Total Marks : "+marks[3]);
	}
	public static void main(String a[]) {
		StudentData Hakkeem = new StudentData();
		Hakkeem.inputData();
		Hakkeem.displayDetails();
	}
}

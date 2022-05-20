import java.util.Scanner;


public class EvenOrOdd {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}
}

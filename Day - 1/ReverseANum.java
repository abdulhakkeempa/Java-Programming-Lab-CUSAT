import java.util.Scanner;

public class ReverseANum {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String Sample = sc.nextLine();
		for (int i = Sample.length()-1; i>=0; i--) {
			System.out.print(Sample.charAt(i));
		}
	}
}

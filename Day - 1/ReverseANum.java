import java.util.Scanner;


public class ReverseANum {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to be Reversed");
		int num = sc.nextInt();
		int numCopy = num;
		int length = 0;
		while(numCopy>0){
			length++;
			numCopy = numCopy/10;
		}
		System.out.println("Orginal Num : "+num);
		System.out.print("Reversed Num : ");
		for (int i = 0; i < length; i++) {
			System.out.print(num%10);
			num = num/10;
		}
	}
}

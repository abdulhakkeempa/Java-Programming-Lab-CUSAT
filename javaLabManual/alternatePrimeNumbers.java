import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class alternatePrimeNumbers {
	public static void main(String args[]) {
		int num;
		List<Integer> PrimeList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num : ");
		num = sc.nextInt();
		boolean isPrime;
		for (int i = 2; i <= num; i++) {
			isPrime = false;
			for (int j = 2; j <= (i/2); j++) {
				if(i%j==0) {
					isPrime = true;
					break;
				}
			}
			if(isPrime==false) {
				PrimeList.add(i);
			}
			
		}
		System.out.println("Alternate Prime Numbers");
		for (int i = 0; i < PrimeList.size(); i+=2) {
			System.out.println(PrimeList.get(i));
		}
	}
}

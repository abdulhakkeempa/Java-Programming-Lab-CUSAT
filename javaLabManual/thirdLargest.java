import java.util.Scanner;

public class thirdLargest {
	public static void main(String a[]) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		int arr[] = new int[size]; 
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int largest,secondLargest,thirdLargest;
		if(arr[0]>arr[1]) {
			if(arr[0]>arr[2]) {
				largest = arr[0];
				if(arr[1]>arr[2]) {
					secondLargest = arr[1];
					thirdLargest = arr[2];
				}
				else {
					secondLargest = arr[2];
					thirdLargest = arr[1];
				}
			}
			else {
				largest = arr[2];
				secondLargest = arr[0];
				thirdLargest = arr[1];
			}
		}
		else {
			if(arr[1]>arr[2]) {
				largest = arr[1];
				if(arr[0]>arr[2]) {
					secondLargest = arr[0];
					thirdLargest = arr[2];
				}
				else {
					secondLargest = arr[2];
					thirdLargest = arr[0];
				}				
			}
			else {
				largest = arr[2];
				secondLargest = arr[1];
				thirdLargest = arr[0];
			}
		}
		for (int i = 3; i < arr.length; i++) {
			if(arr[i]>largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			}
			else if(arr[i]>thirdLargest) {
				thirdLargest = arr[i];
			}
		}
		System.out.println("Third Largest Element in the array : "+thirdLargest);
	}
}

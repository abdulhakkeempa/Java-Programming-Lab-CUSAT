package javaLabManual;

public class overloadingAreaFunction {
	public static void main(String args[]) {
		int choice = Integer.parseInt(args[0]);
		System.out.println(choice);
		overloadingAreaFunction Object = new overloadingAreaFunction();
		if (choice==1) {
			//rectangle
			Object.computeArea(Float.parseFloat(args[1]),Float.parseFloat(args[2]));
		}
		else if(choice==2) {
			//circle
			Object.computeArea((float)6.5);
		}
		else if(choice==3) {
			//square
			Object.computeArea(5);
		}
		else {
			System.out.println("Error");
		}
	}
	void computeArea(float a,float b) {
		System.out.println("Area of Rectangle : "+(a*b));
	}
	void computeArea(float r) {
		System.out.println("Area of Circle : "+(3.14*r*r));
	}
	void computeArea(int side) {
		System.out.println("Area of Square : "+side*side);
	}
}

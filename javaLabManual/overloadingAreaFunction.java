package javaLabManual;

public class overloadingAreaFunction {
	
	public static void main(String args[]) {
		
		//converting the string choice to integer
		int choice = Integer.parseInt(args[0]);
		
		//object for class
		overloadingAreaFunction areaObj = new overloadingAreaFunction();
		
		if (choice==1) {
			//rectangle
			areaObj.computeArea(Float.parseFloat(args[1]),Float.parseFloat(args[2]));
		}
		else if(choice==2) {
			//circle
			areaObj.computeArea(Float.parseFloat(args[1]));
		}
		else if(choice==3) {
			//square
			areaObj.computeArea(Integer.parseInt(args[1]));
		}
		else {
			System.out.println("Invalid Choice");
		}
	}
	
	//overloaded methods
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

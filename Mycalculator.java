package assignment1.week1;

public class Mycalculator {

	public static void main(String[] args) {
		Calculator object= new Calculator();
		int sum=object.addNum(10, 20, 30);
		int sub=object.subNum(90, 40);
		double mul=object.mulNum(40, 20);
		float div=object.divNum(60, 20);
		
		System.out.println("Sum is" +sum);
		System.out.println("Subtraction is" +sub);
		System.out.println("Multiplication is" +mul);
		System.out.println("Division is" +div);
	}

}

package assignment.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8,num1=0,num2=1;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 1; i <=n; i++) {
			int num3 = num1+num2;
			num1 =num2;
			num2 = num3;
			System.out.println(num3);
	
			
		}
		
	}

}

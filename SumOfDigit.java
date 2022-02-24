package assignment.week1;

public class SumOfDigit {

	public static void main(String[] args) {
		int a=123;
		int sum =0, remainder =0;
		while(a>0)
		{
			remainder = a%10;
			System.out.println(remainder);
			sum = sum+remainder;
			System.out.println(sum);
			a=a/10;
			System.out.println(a);
		}
		System.out.println(sum);
	}

}

package assignment.week1;

public class PrimeNumber {

	public static void main(String[] args) {
		int a =13;
		boolean flag=false;
		for (int i = 2; i < a; i++) {
			if(a%2==0)
			{
				flag = true;
				break;		
			}
		}
			if(flag==false)
			{
				System.out.println(+a +"Is a Primenumber");
			}
			else
			{
				System.out.println(+a +"Is not a Primenumber");
			}
	}
}
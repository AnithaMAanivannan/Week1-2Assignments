package week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		int positiveno;
		int negativenumber = -10;
		if(negativenumber <= 0) {
			positiveno = negativenumber * -1;
			System.out.println("The given negative number is converted into positive number:");
			System.out.println(positiveno);
		}
	}
}

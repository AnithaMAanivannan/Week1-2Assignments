package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int input = 18;
 boolean flag = true ;
 
 for (int i=2;i<input;i++) {
	 if(input % i == 0) {
		 System.out.println("not a prime number");
		 flag = false;
		 break;
	 }
 
 }
 if (flag) {
	 System.out.println("prime number ");
 }
	}
}

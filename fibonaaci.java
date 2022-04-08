package week1.day1;

public class fibonaaci {
	public static void main(String[] args) {
		int i=0; int b=1; int sum;
		
		System.out.println(i);
		
		for (i=0; i<=8; i++) {
			
			sum= i+b; 
			System.out.println(sum);
			i = b;
			b = sum;
			
	}
	}

}

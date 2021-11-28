package week1.day1;

public class FibonacciSeries {


	public static void main(String[] args) {
		
		int i,range = 8;
		int firstNum = 0;
		int secNum = 1;			
		System.out.println(firstNum);
		
		for (i = 1; i <= 8; i++) {
			range = (firstNum+secNum);
			System.out.println(range);
			firstNum = secNum;
			secNum = range;
			
			
		}
			
		}
	  

	

}

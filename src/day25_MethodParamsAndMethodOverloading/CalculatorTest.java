package day25_MethodParamsAndMethodOverloading;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int result1 =	Calculator.addition(10, 30);
		
		System.out.println(result1);//40
		
		int result2 = Calculator.subtraction(result1, 10);//30
		
		System.out.println(result2);
		
		int result3 = Calculator.multipication(result1, result2);
		
		System.out.println(result3);
		
		
		System.out.println(Calculator.multipication(Calculator.addition(10, 30),Calculator.subtraction(result1, 10)));
		
		
	}//end method

}//end class

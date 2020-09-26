package fraction;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		Fraction fraction1 = new Fraction();
		double numerator1;
		double denominator1;
		double numerator2;
		double denominator2;
		boolean error=false, error2=false;
		int numProd, denProd;
		
		
			System.out.println("Please enter the first fraction's numerator:");
			numerator1 = myObj.nextDouble();
			
			//take in input for numerator1 and error check, loop until no error
			while (error==false) {
				error = fraction1.errorCheckInt(numerator1);
				if (error == false) {
					break;
				}else {
					System.out.println("Please enter integers only.");
					System.out.println("Please enter the first fraction's numerator:");
					numerator1 = myObj.nextDouble();
					error=false;
				}
				
			}
			
			
			System.out.println("Please enter the first fraction's denominator:");
			denominator1 = myObj.nextDouble();
			
			//take in input for denominator1 and error check, loop until no error
			while (error==false && error2 ==false) {
				error = fraction1.errorCheckInt(denominator1);
				error2 = fraction1.errorCheckDen(denominator1);
				if (error == false && error2 == false) {
					break;
				}else {
					System.out.println("Please enter integers only and denominator can not equal 0.");
					System.out.println("Please enter the first fraction's denominator:");
					denominator1 = myObj.nextDouble();
					error=false;
					error2=false;
				}
			}
			
			
			
			System.out.println("Please enter the second fraction's numerator:");
			numerator2 = myObj.nextDouble();
			
			//take in input for numerator2 and error check, loop until no error 
			while (error == false) {
				error = fraction1.errorCheckInt(numerator2);
				if (error == false) {
					break;
				}else {
					System.out.println("Please enter integers only.");
					System.out.println("Please enter the second fraction's numerator:");
					numerator2 = myObj.nextDouble();
					error=false;
				}
			}
			

			
			System.out.println("Please enter the second fraction's denominator:");
			denominator2 = myObj.nextDouble();
			
			//take in input for denominator2 and error check, loop until no error
			while (error == false && error2 == false) {
				error = fraction1.errorCheckInt(denominator2);
				error2 = fraction1.errorCheckDen(denominator2);
				if (error == false && error2 == false) {
					break;
				}else {
					System.out.println("Please enter integers only and denominator can not equal 0.");
					System.out.println("Please enter the second fraction's denominator:");
					denominator2 = myObj.nextDouble();
					error=false;
					error2=false;
				}
			}
			
			
			
			fraction1.reduceFraction((int) numerator1, (int) denominator1, (int) numerator2, (int) denominator2);
			
			numProd = fraction1.getNumerator();
			denProd = fraction1.getDenominator();
			
			
			if (denProd != 1) {
				System.out.println(numProd + "/" + denProd);
			}else {
				System.out.println(numProd);
			}
			
			
		
			
		
		
		
	}
}

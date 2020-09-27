package fraction;

public class Fraction {
	
	
	//instance variables
	public int numeratorProduct;
	public int denominatorProduct;
	int wholeNumber;
	int newNum;
	
	//constructor
	public Fraction() {
		numeratorProduct=0;
		denominatorProduct=0;
		wholeNumber=0;
		newNum=0;
		
	}
	
	//method to error check for doubles 
	public boolean errorCheckInt(double num) {
		int numInt;
		numInt = (int) num;
		
		if ( (num*10) - (numInt*10) == 0 ) {
			return false;
		}else {
			return true;
		}
	}
	
	//error check for a denominator of 0
	public boolean errorCheckDen(double den) {
		if (den==0) {
			return true;
		}else {
			return false;
		}
	}
	
	//reduce the fraction using the GCF of the products of the numerators and denominators
	public void reduceFraction(int num1, int den1, int num2, int den2) {
		int smallest;
		int gcf;
		
		numeratorProduct = num1 * num2;
		denominatorProduct = den1 * den2;
		
		smallest = this.smallest();
		gcf = smallest;
		
		if (gcf<numeratorProduct && gcf<denominatorProduct) {
			for (int i = smallest; i<1; i--) {
				if ( (numeratorProduct % gcf == 0) && (denominatorProduct % gcf == 0) ) {
					gcf = i;
					break;
				}else {
					gcf = i;
				}
			}
			
			numeratorProduct = numeratorProduct / gcf;
			denominatorProduct = denominatorProduct / gcf;
		}
		
		
	}
	
	//figure out the smallest of the two products to find the GCF
	private int smallest() {
		int small;
		if (numeratorProduct > denominatorProduct) {
			small = denominatorProduct;
		}else {
			small = numeratorProduct;
		}
		
		return small;
	}
	
	//returns the final numerator
	public int getNumerator() {
		return numeratorProduct;
	}
	
	//returns the final denominator
	public int getDenominator() {
		return denominatorProduct;
	}
	
	public void makeMixed(int num, int den) {
		wholeNumber = num/den;
		newNum = num % den;
	}
	
	public int getWholeNumber() {
		return wholeNumber;
	}
	
	public int getNewNum() {
		return newNum;
	}
	
	
	
}

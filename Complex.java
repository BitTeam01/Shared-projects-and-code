public class Complex{
	private double realPart;
	private double imaginaryPart;
	
	// default constructor
	public Complex(){
		realPart = 0.0;
		imaginaryPart = 0.0;
	}
	// parameterized constructor
	public Complex(double r, double i){
		realPart = r;
		imaginaryPart = i;
	}
	// retrieving real part
	public double getReal(){
		return realPart;
	}
	// retrieving imaginary Part
	public double getImaginary(){
		return imaginaryPart;
	}
	
	// overloading toString() function
	public String toString(){
		String returnString = realPart + " " + String.format("%+.2f" , imaginaryPart) + 'i';
		return returnString;
	}
	// addition method
	public Complex add(Complex someNumber){
		Complex returnComplex = new Complex();
		returnComplex.realPart = realPart + someNumber.realPart;
		returnComplex.imaginaryPart = imaginaryPart + someNumber.imaginaryPart;
		return returnComplex;
	}
	// subtraction method
	public Complex subtract(Complex someNumber){
		Complex returnComplex = new Complex();
		returnComplex.realPart = realPart - someNumber.realPart;
		returnComplex.imaginaryPart = imaginaryPart - someNumber.imaginaryPart;
		return returnComplex;
	}
	// static addition method 
	public static Complex add(Complex a, Complex b){
		Complex returnComplex = new Complex();
		returnComplex.realPart = a.realPart + b.realPart;
		returnComplex.imaginaryPart = a.imaginaryPart + b.imaginaryPart;
		return returnComplex;
	}
	
}
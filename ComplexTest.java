public class ComplexTest{
	public static void main(String[] args){
		Complex c = new Complex(3, 5);
		Complex d = new Complex(-2, -2);
		Complex e = new Complex ();
		
		System.out.println("c = " + c);
		System.out.println("e = " + e);
		System.out.println(c + ".getReal() = " + c.getReal());
		System.out.println(d + ".getImaginary() = " + d.getImaginary() + 'i');
		System.out.println(c + " + " + d + " = " + c.add(d));
		System.out.println(c + " + " + d + " = " + Complex.add(c, d));
		System.out.println(c + " - " + d + " = " + c.subtract(d));
		System.out.println(c + " - " + e + " = " + c.subtract(e));
	
	}
}
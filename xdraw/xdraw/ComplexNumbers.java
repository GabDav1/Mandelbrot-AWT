package xdraw;
import java.lang.Math;

public class ComplexNumbers {
	
	double real;
	double imaginary;
	double ipo;

	public ComplexNumbers(double rl, double im) {
		this.real = rl;
		this.imaginary = im;
		//TODO add gabi set switch in the constructor
	}
	
	//Checks if any complex number diverges when tested in the Mandelbrot function.
	public int isDivergent() {
		double a = this.real;
		double b = this.imaginary;
		double nexta, nextb;
		int i;
		for (i = 0; i < 65025; i++) {
			//System.out.println("real e "+a+" imaginar e "+b);
			ipo = Math.sqrt(Math.abs(a)*Math.abs(a)+Math.abs(b)*Math.abs(b));
			nexta = a*a + (-1)*(b*b)+this.real;
			nextb = a*b+a*b + this.imaginary;
			//Commented code below produces a different image in the GABI set
			//nexta = a*a + (-1)*(b*b)+a;
			//nextb = a*b+a*b + b;
			a= nexta;
			b= nextb;
			if (ipo > 2.0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		for (double i = 0.1; i < 1.0; i+=0.1) {
			for (double j = 0.1; j < 1.0; j+=0.1) {
				ComplexNumbers a = new ComplexNumbers(i,j); 
				if(a.isDivergent()!=-1) {
					System.out.println("real e "+a.real+" imaginar e "+a.imaginary+" DIVERGES\n");
				} else {
					System.out.println("real e "+a.real+" imaginar e "+a.imaginary+" NOT\n");
				}
		//end of nested
		}
		}
		//after for loops	

	}
}

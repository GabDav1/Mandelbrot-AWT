package xdraw;

//import java.awt.Color;

public class Mandelbrot {

	public static void main(String[] args) throws InterruptedException {
		
		int colorb=0,colorg=0;
		
		double diffiP = (0.00025/8.0)*3.0, diffjP = (0.000218/8.0)*3.0, diffiM = (0.00025/8.0)*4.0, diffJM = (0.00025/8.0)*3.5;
		
		double point = 0.001875;
		double starting_imaginary = -1.25 + diffiP;
		double ending_imaginary = -1.24975 - diffiM;
		double starting_real =  0.015215 + diffjP;
		double ending_real = 0.015433 - diffJM;
		
		ComplexNumbers a;
		int zoom_factor = 198*3*8*8;
		
		//TODO LUAM DIFERENTA(DIFIURILE), LE IMPARTIM LA 8 SI N PARTI DIN 8 SE VOR ADAUGA LA PARTEA INFERIOARA SI M PARTI DIN 8 SE VOR ELIMINA DIN PARTEA SUPERIOARA
		//ASTFEL INCAT 8 MINUS M PLUS N SA NE LASE CU O UNITATE, REPET AD INFINITUM
		
		System.out.println("i e  "+ starting_imaginary +" si "+ ending_imaginary);
		System.out.println("j e  "+ starting_real +" si "+ ending_real);
		//System.out.println("diffi e  "+ diffi +" si difj e "+ diffj);
		
		for (double i = starting_imaginary; i < ending_imaginary; i+=point/(zoom_factor*2)) {
			for (double j = starting_real; j <ending_real; j+=point/(zoom_factor*2)) {
				a = new ComplexNumbers(i,j); 
				if(a.isDivergent()==-1) {
					StdDraw.setPenColor(100, 0, 0);
				} else {
					colorb = a.isDivergent()%255;
					colorg = a.isDivergent()/255;
					//colorg = a.isDivergent()/255 < 122 ? a.isDivergent()/255 *2 : a.isDivergent()/255 ;
					if (colorg < 255/4){
						colorg *= 4;
					} else {
						colorg = a.isDivergent()/255 < 127 ? a.isDivergent()/255 *2 : a.isDivergent()/255 ;
					}
					StdDraw.setPenColor(0, colorg, colorb);					
				}
				StdDraw.filledSquare(zoom_factor*(0-starting_imaginary) + i*zoom_factor, zoom_factor*(0-starting_real) + j*zoom_factor, point/(zoom_factor*2));
		//end of nested
		}
		}//end
		
		//Desenarea dimensiunilor graficului pe mijlocul ecranului
/*		while (y<0.875){
			//deci 0.875-0.5 e echivalentul lui 2 in graficul pt mandelbrot
			//si 0.5 - 0.125 e echivalentul lui -2 
			//deci 0.375 repr 2 unitati ==> 0.1875 e o unitate
		StdDraw.filledSquare(x, y, 0.001);
			y+=0.002;
			//System.out.println("x e  "+x+" si y e "+y);
		}
		x=0.5;y=0.5;
		while (x<0.875){
			StdDraw.filledSquare(x, y, 0.001);
				x+=0.002;
				//System.out.println("x e  "+x+" si y e "+y);
		}
		x=0.5;y=0.5;
		while (y>0.125){
			StdDraw.filledSquare(x, y, 0.001);
				y-=0.002;
				//System.out.println("x e  "+x+" si y e "+y);
			}
		x=0.5;y=0.5;
		while (x>0.125){
			StdDraw.filledSquare(x, y, 0.001);
			x-=0.002;
			//System.out.println("x e  "+x+" si y e "+y);
		}*/
		
		//Desenam in grafic
/*		for (x = 0.5; x <1.0; x+=point) {
			//y=0.5+((0.5-x)*(0.5-x)*(0.5-x)+33*point);
			//StdDraw.filledSquare(x, y, point);
			//y=0.5+(x*x+point);
			y=0.5+((0.5-x)*(0.5-x)*(0.5-x)*(-1)+33*point);
			StdDraw.filledSquare(x, y, point);
			//System.out.println("x e  "+x+" si y e "+y);
		}
		//Atentie! Importanta are aici doar sensul parcurgerii
		for (x = 0.5; x >0.0; x-=point) {
			//y=0.5+((0.5-x)*(0.5-x)*(0.5-x)+33*point);
			//StdDraw.filledSquare(x, y, point);
			//y=0.5+(x*x+point);
			y=0.5+((0.5-x)*(0.5-x)*(0.5-x)*(-1)+33*point);
			StdDraw.filledSquare(x, y, point);
			//System.out.println("x e  "+x+" si y e "+y);
		}*/
		
		
/*		for (double i = -2.0; i < -1.0; i+=point) {
			for (double j = 0.0; j < 1.0; j+=point) {
				a = new ComplexNumbers(i,j); 
				if(a.isDivergent()) {
					//do nothing
				} else {
					if (i < 0.0){
						StdDraw.filledSquare(i+2.0, j, point);
					} else {
						StdDraw.filledSquare(i+2.0, j, point);
					}
					
				}
		//end of nested
		}
		}//end
*/		
//		double point = 0.001875;
//		int colorb=0,colorg=0;
//		for (double i = 1.0; i > 0.0; i-=point) {
//			for (double j = 0.0; j < 1.0; j+=point) {
//				ComplexNumbers a = new ComplexNumbers(2.0-i,j); 
//				//face parte din set
//				if(a.isDivergent()==-1) {
//					StdDraw.setPenColor(100, 0, 0);
//				} else {
//					colorb = a.isDivergent()%255;
//					colorg = a.isDivergent()/255;
//					//colorg = a.isDivergent()/255 < 122 ? a.isDivergent()/255 *2 : a.isDivergent()/255 ;
//					if (colorg < 255/4){
//						colorg *= 4;
//					} else {
//						colorg = a.isDivergent()/255 < 127 ? a.isDivergent()/255 *2 : a.isDivergent()/255 ;
//					}
//					StdDraw.setPenColor(0, colorg, colorb);
//				}
//		//end of nested
//				StdDraw.filledSquare(i, j, point);
//		}
//		}
//		//after for loops
}
}
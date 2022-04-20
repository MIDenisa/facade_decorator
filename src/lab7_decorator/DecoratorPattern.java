package lab7_decorator;

import lab7_facade.Cerc;
import lab7_facade.FormaGeometrica;
import lab7_facade.Triunghi;

public class DecoratorPattern {

	public static void main(String[] args) {
		System.out.println("Creating simple shape objects ");
		FormaGeometrica cerc=new Cerc();
		FormaGeometrica triunghi=new Triunghi();
		
		System.out.println("Drawing simple shape objects ");
		cerc.draw();
		System.out.println();
		triunghi.draw();
		System.out.println();
		
		Cerc c=new Cerc();
		FillColorDecorator fc=new FillColorDecorator(c, Culoare.RED);
		FormaGeometrica cerc1=fc;
		cerc1.draw();
		System.out.println();
		
		System.out.println("Creating decorated circle with green color");
		FormaGeometrica cerc2=new FillColorDecorator(new Cerc(), Culoare.GREEN);
		cerc2.draw();
		System.out.println();

		System.out.println("Creating decorated triangle with blue color");
		FormaGeometrica triunghi2=new FillColorDecorator(new Triunghi(), Culoare.BLUE);
		triunghi2.draw();
		System.out.println();

	}

}

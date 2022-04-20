package lab7_decorator;

import lab7_facade.FormaGeometrica;

public class FillColorDecorator extends FormaGeomDecorator{
	protected Culoare color;
	
	public FillColorDecorator(FormaGeometrica decoratedFormaGeometrrica, Culoare color) {
		super();
		this.color=color;
	}
	
	public void darw() {
		decoratedFormaGeometrica.draw();
		System.out.println("Fill Color: "+color);
	}
	
	public void resize() {
		decoratedFormaGeometrica.resize();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}

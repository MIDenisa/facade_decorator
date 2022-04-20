package lab7_decorator;
import lab7_facade.FormaGeometrica;

public abstract class FormaGeomDecorator implements FormaGeometrica {
	protected FormaGeometrica decoratedFormaGeometrica;
	public void FormaGeometricaDecorator(FormaGeometrica decoratedFormaGeometrica)
	{
		this.decoratedFormaGeometrica=decoratedFormaGeometrica;
	}
	
	

}




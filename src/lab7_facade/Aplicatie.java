package lab7_facade;

public class Aplicatie {
	private FormaGeometrica cerc;
	private FormaGeometrica triunghi;
	
	public Aplicatie() {
		cerc=new Cerc();
		triunghi=new Triunghi();
		
	}
	
	public void drawCerc() {
		cerc.draw();
	}
	
	public void drawTriunghi() {
		triunghi.draw();
	}

}

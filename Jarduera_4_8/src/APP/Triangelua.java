package APP;

public class Triangelua extends Figura2D{
	private String[] estiloa;
	
	public String area(float zabalera,float altuera) {
		String alboak=null;
		
		double area=zabalera*altuera;
		
		return alboak;
	}

	public Triangelua(float zabalera, float altuera, String[] estiloa) {
		super(zabalera, altuera);
		this.estiloa = estiloa;
	}

	public Triangelua(float zabalera, float altuera) {
		super(zabalera, altuera);
	}

	public String[] getEstiloa() {
		return estiloa;
	}

	public void setEstiloa(String[] estiloa) {
		this.estiloa = estiloa;
	}
}

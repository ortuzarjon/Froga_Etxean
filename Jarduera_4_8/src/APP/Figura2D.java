package APP;

public class Figura2D {
	private float zabalera;
	private float altuera;
	
	public void dimIkusi() {
		Figura2D figura=new Figura2D();
		System.out.println("Altuera==> "+figura.getAltuera()+"//Zabalera==> "+figura.getZabalera());
	}

	public Figura2D(float zabalera, float altuera) {
		this.zabalera = zabalera;
		this.altuera = altuera;
	}

	public Figura2D() {
	}

	public float getZabalera() {
		return zabalera;
	}

	public void setZabalera(float zabalera) {
		this.zabalera = zabalera;
	}

	public float getAltuera() {
		
		return altuera;
	}

	public void setAltuera(float altuera) {
		this.altuera = altuera;
	}
}

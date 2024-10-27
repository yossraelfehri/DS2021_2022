package EX2;

public class Documentaire extends Film {
	public String sujet;
	public float tarif=2;
	public Documentaire(String titre, String r, String pays, int d, String sujet) {
		super(titre, r, pays, d);
		this.sujet = sujet;
	}
	public String toString () {
		return (super.toString()+" sur "+sujet+".");
	}
	public float totalVenteBillets () {
		return (tarif*getNbP());
	}
	
	
	
}

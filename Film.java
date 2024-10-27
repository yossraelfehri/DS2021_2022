package EX2;
import java.util.Scanner;

public class Film {
	protected String titre;
	protected String realisateur;
	protected String pays;
	protected String duree;
	protected int NbP;
	public void setNbP (int NbP) {
		this.NbP = NbP;
	}
	public int getNbP () {
		return this.NbP;
	}
	public String toString () {
		String ch = titre+" de "+realisateur+" ("+pays+") "+duree+"min ";
		return ch;
	}
	public Film (String titre, String r, String pays, int d) {
		this.titre = titre;
		realisateur = r;
		this.pays = pays;
		duree = r;
	}
	public float totalVenteBillets () {
		Scanner scanner  = new Scanner (System.in);
		System.out.println("Entrer le nombre de places pour les étudiants : ");
		int nbpE = scanner.nextInt();
		while (nbpE > NbP) {
			System.out.println("Entrer le nombre de places pour les étudiants : ");
			nbpE = scanner.nextInt();
		}
		int prixE = 2*nbpE;
		int prixP = (NbP-nbpE)*3;
		return (prixE+prixP);
	}
	
}

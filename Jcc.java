package EX2;

public class Jcc {
	private Film competition[];
	private int annee;
	private int nbfmax = 30;
	private static int nbF = 0;
	private static int id ;
	public Jcc (int taille, int annee) {
		if (taille < nbfmax) {
			competition = new Film[taille];
		}
		this.annee = annee;
	}
	public void ajoutFilm (Film f) {
		if (nbF < competition.length) {
			competition[nbF] = f;
			nbF ++;
		}else {
			System.out.println("La competition est au complet.");
		}
	}
	public void listeFilmsJCC () {
		for (int i=0; i<nbF; i++) {
			System.out.println(competition[i].toString());
		}
	}
	public float totalVenteBilletsJCC () {
		int s=0;
		for (int i=0; i<nbF; i++) {
			s += competition[i].totalVenteBillets();
		}
		return s;
	}
	public static void main (String [] args) {
		Jcc jcc = new Jcc(2,2021);
		Documentaire d = new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile");
		d.setNbP(30);
		Film f = new Film("Insurrcetion","Jilani Saadi","Tunisie",105);
		f.setNbP(45);
		jcc.ajoutFilm(d);
		jcc.ajoutFilm(f);
		jcc.listeFilmsJCC();
		System.out.println("Le montant de ventes de billets pour les JCC : "+jcc.totalVenteBilletsJCC());
	}
	
}

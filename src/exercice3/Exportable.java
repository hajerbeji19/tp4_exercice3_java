package exercice3;

public interface Exportable {
	default double droitsDeDouane(double fraisDouane, double QteExpo) {
		return fraisDouane*QteExpo;
	}
	static void afficherMontant(double montant) {
		System.out.println("montant = "+montant);
	}
	abstract double prixNet(double fraisDouane);
}

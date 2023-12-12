package exercice3;

public class Article implements Exportable {
	private int code;
	private String ref;
	private int qte;
	private double pht;
	private double tva;
	public Article(int code, String ref) {
		this.code=code;
		this.ref=ref;
	}
	public Article(int code, String ref, int qte,double pht,double tva) {
		this(code,ref);
		this.qte=qte;
		this.pht=pht;
		this.tva=tva;
	}
	
	//Les getters :
	public int getCode() {
		return code;
	}
	public String getRef() {
		return ref;
	}
	public int getQte() {
		return qte;
	}
	public double getPht() {
		return pht;
	}
	public double getTva() {
		return tva;
	}
	//fin des getters
	
	//Les setters
	public void setCode(int code) {
		this.code=code;
	}
	public void setRef(String ref) {
		this.ref=ref;
	}
	public void setQte(int qte) {
		this.qte=qte;
	}
	public void setPht(double pht) {
		this.pht=pht;
	}
	public void setTva(double tva) {
		this.tva=tva;
	}
	//fin des setters
	
	@Override
	public String toString() {
		return "Article {code="+code+", ref="+ref+" ,qte="+qte+" ,pht="+pht+" ,tva="+tva+"}";
	}
	
	public double prixTransport() {
		double PTR=pht*2;
		return PTR;
	}
	
	//Implementation des méthode de l'interface:
	public double prixNet(double fraisDouane) {
		double PTR=prixTransport();
		double droitsDouane=droitsDeDouane(fraisDouane,qte);
		double PNet=qte*pht*tva+qte*pht+qte*PTR+droitsDouane;
		return PNet;
	}
	
	
}

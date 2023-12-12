package exercice3;

class ArticleFragile extends Article {
	private String emballage;
	private double prixEmballage;
	public ArticleFragile(int code, String ref, int qte,double pht,double tva, String emballage,double prixEmballage) {
		super(code,ref,qte,pht,tva);
		this.emballage=emballage;
		this.prixEmballage=prixEmballage;
	}
	//setters et getters:
	public String getEmballage() {
		return emballage;
	}
	public double getPrixEmballage() {
		return prixEmballage;
	}
	public void setEmballage(String emballage) {
		this.emballage=emballage;
	}
	public void setPrixEmballage(double prixEmballage) {
		this.prixEmballage=prixEmballage;
	}
	//fin setters et getters
	@Override
	public String toString() {
		return "ArticleFragile{code="+getCode()+", ref="+getRef()+" ,qte="+getQte()+" ,pht="+getPht()+" ,tva="+getTva()
				+"emballage= "+emballage+" et prixEmballage= "+prixEmballage+"}";
	}
	//redéfinition de prixTransport:
	public double prixTransport() {
		return super.prixTransport()*2;
	}
	
	//redéfinition de prixNet:
	 public double prixNet(double fraisDouane) {
		 return super.prixNet(fraisDouane)+prixEmballage*super.getQte();
	 }
}

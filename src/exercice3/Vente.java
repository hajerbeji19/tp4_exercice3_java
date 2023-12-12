package exercice3;
import java.util.Scanner;

public class Vente {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Article obj1=new Article(11,"ref1");
		
		//prend la quantité à partir de ligne de commande
		System.out.println("Donner la quantité d'objet ayant comme reférence "+obj1.getRef());
		int qte1=Integer.parseInt(args[0]);
		obj1.setQte(qte1);
		
		//prend la prix hors taxe à partir de ligne de commande
		System.out.println("Donner la Prix hors taxe PHT d'objet ayant comme reférence "+obj1.getRef());
		double pht1=Double.parseDouble(args[1]);
		obj1.setPht(pht1);
		
		//prend la tva à partir de ligne de commande
		System.out.println("Donner la TVA d'objet ayant comme reférence "+obj1.getRef());
		double tva1=Double.parseDouble(args[2]);
		obj1.setTva(tva1);
		
		//afficher les informations de obj1
		System.out.println(obj1);
		
		double prixTransport=obj1.prixTransport();
		Exportable.afficherMontant(prixTransport);
		
		double fraisDouane1=450;
		double prixNet1=obj1.prixNet(fraisDouane1);
		System.out.println("Le prix net = "+prixNet1);
		
		//Création obj2 de type ArticleFragile
		System.out.println("Donner l'emballage d'objet ayant comme reférence "+obj1.getRef());
		String emballage1=sc.next();
		
		System.out.println("Donner le prix d'emballage d'objet ayant comme reférence "+obj1.getRef());
		double prixEmballage1=sc.nextDouble();
		
		ArticleFragile obj2=new ArticleFragile(11,"ref1",qte1,pht1,tva1,emballage1,prixEmballage1);
		System.out.println(obj2);
		//prixNet de obj2;
		double fraisDouane2=450;
		double prixNet2=obj2.prixNet(fraisDouane2);
		System.out.println("Le prixNet d'objet ayant comme réference "+obj2.getRef()+" est égale "+prixNet2);
		
		sc.close();
	}
}

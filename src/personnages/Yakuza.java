package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan, int reputation) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorque = victime.setFaireExtorquer();
		this.gagnerArgent(argentExtorque);
		this.parler("J’ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
}

package personnages;

public class Ronin extends Humain {

	private int honneur = 1;
	private int force;
	
	public Ronin(String nom, String boissonFavorite, int argent, int force) {
		super(nom, boissonFavorite, argent);
		this.force = force ;
	}
	public void donner(Commercant beneficiaire) {
		int don = this.getArgent() / 10;
		this.parler(beneficiaire.getNom() + ", prends ces " + don + " sous.");
		this.perdreArgent(don);
		beneficiaire.recevoir(don);
	}

}

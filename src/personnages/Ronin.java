package personnages;

public class Ronin extends Humain {

	private int honneur = 1;
	private int force = 2 * honneur;
	
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
	
	public int getHonneur() {
		return this.honneur; 
		}
	
	public void provoquer(Yakuza adversaire) {
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		
		if(this.force >= adversaire.getReputation()) {
			this.honneur++;
			int argent=this.getArgent();
			this.parler("Je t’ai eu petit yakusa !");
			this.gagnerArgent(argent);
			adversaire.perdre();
		}
		else {
			int argent = this.getArgent();
			
			adversaire.gagner(argent);
			
			this.honneur--;
			this.perdreArgent(argent);
			
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		}
	}

}

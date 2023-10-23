package personnages;

public class Humain {
	private String nom ;
	private String boisson ;
	private int argent ;
	
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	protected int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}
	
	
	protected void parler(String texte) {
		System.out.println("(" + this.getNom() + ") - " + texte);
	}
	
	public void direBonjour() {
		System.out.println("(" + this.getNom() + ") -" + "Bonjour ! je m'appelle " + this.getNom() + " et j'aime boire du " + this.getBoisson());
	}
	
	public void boire() {
		System.out.println("(" + this.getNom() + ") -" + " Mmmm, un bon verre de " + this.getBoisson() + " ! Gloups ! " );
	}
	
	protected void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	protected void perdreArgent(int perdre) {
		this.argent -= perdre;
	}
	
	public void acheter(String bien, int prix) {
		if(this.getArgent() >= prix)
			this.parler("J'ai " + this.getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
		else
			this.parler("Je n'ai que " + this.getArgent() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		this.perdreArgent(prix);
	}
}

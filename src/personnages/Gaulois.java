package personnages;

public class Gaulois {
	private String nom; 
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion ;
		if (forcePotion==3) {
			parler("Merci Druide, je sens que ma force est 3 fois décuplée.");
		}
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "«" + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois" + nom + ":";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoi un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force/3)*effetPotion);
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}

	/*@Override*/
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain jules =new Romain("Jules", 10);
		asterix.frapper(jules);
		
		asterix.boirePotion(3);
	}
	

}

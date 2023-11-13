package personnages;

public class Humain {
    private String nom;
    private String boisson;
    private int argent;
    private int nbConnaissance;
    private Humain[] connaissances;

    public Humain(String nom, String boisson, int argent) {
        this.nom = nom;
        this.boisson = boisson;
        this.argent = argent;
        this.nbConnaissance = 0;
        this.connaissances = new Humain[3]; 
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
        System.out.println("(" + this.getNom() + ") -" + " Mmmm, un bon verre de " + this.getBoisson() + " ! Gloups ! ");
    }

    protected void gagnerArgent(int gain) {
        this.argent += gain;
    }

    protected void perdreArgent(int perdre) {
        this.argent -= perdre;
    }

    public void acheter(String bien, int prix) {
        if (this.getArgent() >= prix)
            this.parler("J'ai " + this.getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
        else
            this.parler("Je n'ai que " + this.getArgent() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
        this.perdreArgent(prix);
    }

    public void faireConnaissanceAvec(Humain autreHumain) {
        this.direBonjour();
        autreHumain.repondre(this);
        this.memoriser(autreHumain);   
    }

    private void memoriser(Humain autreHumain) {
    	 if (nbConnaissance < connaissances.length) {
             connaissances[nbConnaissance] = autreHumain;
             nbConnaissance++;}
    	 else {
             // Décaler le tableau vers la gauche
             for (int i = 0; i < connaissances.length - 1; i++) {
                 connaissances[i] = connaissances[i + 1];
             }
             // Ajouter la nouvelle connaissance à la dernière position
             connaissances[connaissances.length - 1] = autreHumain;
         }
    }

    private void repondre(Humain autreHumain) {
        this.direBonjour();
        this.memoriser(autreHumain);
    }

    public void listerConnaissance() {
        System.out.println("(" + this.getNom() + ") -" + " Je connais beaucoup de monde dont :");
        for (int i = 0; i < nbConnaissance; i++) {
            System.out.println("- " + connaissances[i].getNom());
        }
    }
}

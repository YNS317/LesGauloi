package histoire;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

    public static void main(String[] args) {
        // Créez un Gaulois (Astérix) avec une force de 8
        Gaulois asterix = new Gaulois("Astérix", 8);

        // Créez un Romain (Minus) avec une force de 6
        Romain minus = new Romain("Minus", 6);

        // Faites parler Astérix et Minus
        asterix.parler("Bonjour à tous");
        minus.parler("UN GAU... UN GAUGAU...");

        // Astérix frappe Minus trois fois
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
            minus.parler("Aïe");
        }

        // Minus abandonne
        minus.parler("J'abandonne...");
    }
}

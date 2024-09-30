package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;

	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	/*private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}*/
	private String prendreParole() {
        return "Le gaulois " + nom + " : ";
	}
	/*public void frapper(Romain romain) {
		if (romain.getVivant()) {
			System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
			romain.recevoirCoup((force / 3) * effetPotion);
		}
	}*/

	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] nouveauxTrophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; nouveauxTrophees != null && i < nouveauxTrophees.length; i++, nbTrophees++) {
		               this.trophees[nbTrophees] = nouveauxTrophees[i];
		} 
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";

	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + this.effetPotion + " fois décuplée.");
	}
	/*
	 * public static void main(String[] args) { Gaulois asterix = new
	 * Gaulois("Ast�rix", 8); System.out.println(asterix); }
	 */

	/*
	 * public static void main(String[] args) { Gaulois asterix = new
	 * Gaulois("Ast�rix", 8); Druide panoramix = new Druide("Panoramix", 5, 10);
	 * Romain cesar = new Romain("César", 10);
	 * 
	 * panoramix.preparerPotion();
	 * 
	 * asterix.boirePotion(3);
	 * 
	 * asterix.frapper(cesar); }
	 */

}

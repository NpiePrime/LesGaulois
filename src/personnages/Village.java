package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void ajouterHabitant(Gaulois gaulois) {

		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;

	}

	public Gaulois trouverHabitant(int numVillageois) { 

		return villageois[numVillageois];
	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());

		}
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public static void main(String[] args) {

		Village village = new Village("Village des Irréductibles", 30);
//		 Gaulois gaulois = village.trouverHabitant(30);
//		exception 30 est la 31eme case du tableau à 30 cases max
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);

		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		// null car 1 est la 2 eme case du tableau

		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();

	}

}


























package personnages;

public class Village {
	private String nom;
	private Chef chef;
	int nbVillageoisMaximum;
	Gaulois [] villageois = new Gaulois[nbVillageoisMaximum]; //doubt about declaring it there
	int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
	}
	
	public void ajouterHabitant(Gaulois gaulois) { //doubt
		for (int i = 0; i < nbVillageoisMaximum; i++) {
			if (villageois[i] == null) {
				villageois[i] = gaulois;
				nbVillageois += 1;
			}
		}
	}
	public Gaulois trouverHabitant(int numVillageois) { //numVillageois> nbVillageois?
		
		return villageois[numVillageois];
	}
		
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	public static void main(String[] args) {
		
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
// 		exception car tableau vide
		
		
	}

}

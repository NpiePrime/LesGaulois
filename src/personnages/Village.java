package personnages;

public class Village {
	private String nom;
	private Chef chef;
	int nbVillageoisMaximum;
	int [] villageois = new int[nbVillageoisMaximum];
	int nbVillageois = 0;
	
	


	
	public Village(String nom, int nbVillageoisMaximum, int[] villageois) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = villageois;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		
		
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

}

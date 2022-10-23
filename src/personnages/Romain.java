package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isForcePositive();
	}

	public void recevoirCoup(int forceCoup) {
		assert isForcePositive();

		int forceOrigine = force;
		force -= forceCoup;

		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abondonne...");
		}
		assert (force < forceOrigine);
	}

	private boolean isForcePositive() {
		boolean forcePositive = false;
		if (force > 0) {
			forcePositive = true;
		}

		return forcePositive;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";

	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.parler("Bonjour");
		minus.recevoirCoup(3);
		System.out.println(Equipement.BOUCLIER);
	}
}

package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
		assert force > 0;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;

		int forceOrigine = force;
		force -= forceCoup;

		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abondonne...");
		}
		assert (force < forceOrigine);
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";

	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0:
			ajouterEquipement(equipement);
			break;
		case 1:

			if (equipements[0] != equipement) {
				ajouterEquipement(equipement);
			} else {
				System.out.println("Le soldat " + nom + " possède deja un " + equipement + "!");
			}
			break;
		default:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		}

	}

	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
		nbEquipement++;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.parler("Bonjour");
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}

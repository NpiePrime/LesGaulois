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

//	public void recevoirCoup(int forceCoup) {
//		assert force > 0;
//
//		int forceOrigine = force;
//		force -= forceCoup;
//
//		if (force > 0) {
//			parler("A?e");
//		} else {
//			parler("J'abondonne...");
//		}
//		assert (force < forceOrigine);
//	}
	
	
	
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// pr?condition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("A?e");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
			parler("A?e");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
		}
		// post condition la force a diminu?e
		assert force < oldForce;
		return equipementEjecte;
	}

	
	
	
	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
		texte += "\nMais heureusement, grace ? mon ?quipement sa force est diminu? de ";
		for (int i = 0; i < nbEquipement;) {
		if ((equipements[i] != null &&
		equipements[i].equals(Equipement.BOUCLIER)) == true) {
		resistanceEquipement += 8;
		} else {
		System.out.println("Equipement casque");
		resistanceEquipement += 5;
		}
		i++;
		}
		texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'?quipement de " + nom.toString() + "s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
				} else {
				equipementEjecte[nbEquipementEjecte] =
				equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				}
				}
				return equipementEjecte;
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
				System.out.println("Le soldat " + nom + " poss?de deja un " + equipement + "!");
			}
			break;
		default:
			System.out.println("Le soldat " + nom + " est d?j? bien prot?g? !");
			break;
		}

	}

	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		System.out.println("Le soldat " + nom + " s'?quipe avec un " + equipement + ".");
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

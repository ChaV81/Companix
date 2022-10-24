import java.util.Scanner;
import java.util.HashMap; // import the HashMap class

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Salarie> salarie = new HashMap<Integer, Salarie>();
		display_choices();
		boolean i = true;
		while (i) {
			switch (scanner_int()) {

			case 1:
				System.out.println(
						"Saisir le code, nom, prénom, date d’embauche et \r\n" + "nombre d’année de développement : ");

				Concepteur concepteur_props = create_concepteur(scanner_string());
				stocker_salarie(concepteur_props, salarie);
				System.out.println("Le concepteur a bien été ajouté.");

				break;

			case 2:
				System.out.println("Saisir le code du concepteur:");
				delete_concepteur(scanner_int(), salarie);
				System.out.println("Concepteur supprimé");

				break;

			case 3:

				display_concepteur(salarie);
				break;

			case 4:
				System.out.println(
						"Saisir le code, nom, prénom, date d’embauche et \r\n" + "nombre d’année de déplacements :");
				Analyste analyste_props = create_analyste(scanner_string());
				stocker_salarie(analyste_props, salarie);
				System.out.println("L'analyste a bien été ajouté.");
				break;

			case 5:
				System.out.println("Saisir le code de l'analyste :");
				delete_analyste(scanner_int(), salarie);
				System.out.println("Analyste supprimé");
				break;

			case 6:
				display_salarie(salarie);
				break;
				
			case 7:
				System.out.println("Aurevoir");
				i = false;
				break;

			default:
				System.out.println("Veuiller faire un choix valide !");
				i = false;
				break;

			}
			display_choices();
		}
		
	}

	public static void display_choices() {
		System.out.println("1- Ajouter un concepteur" + "\n2- Supprimer un concepteur"
				+ "\n3- Lister les concepteurs existants" + "\n4- Ajouter un analyste" + "\n5- Supprimer un analyste"
				+ "\n6- Lister les salariés existants" + "\n7- Sortir de l'application");
	}

	public static int scanner_int() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

	public static String scanner_string() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

	public static Concepteur create_concepteur(String ajout) {
		String[] parts = ajout.split("-");
		int code = Integer.parseInt(parts[0]);
		String nom = parts[1];
		String prenom = parts[2];
		String date_embauche = parts[3];
		int annee_dev = Integer.parseInt(parts[4]);

		Concepteur new_concepteur = new Concepteur(code, nom, prenom, date_embauche, annee_dev);
		// System.out.println(new_concepteur.getCode());
		return new_concepteur;

	}
	
	public static Analyste create_analyste(String ajout) {
		String[] parts = ajout.split("-");
		int code = Integer.parseInt(parts[0]);
		String nom = parts[1];
		String prenom = parts[2];
		String date_embauche = parts[3];
		int nbr_deplacement = Integer.parseInt(parts[4]);

		Analyste new_analyste = new Analyste(code, nom, prenom, date_embauche, nbr_deplacement);
		// System.out.println(new_concepteur.getCode());
		return new_analyste;

	}

	public static void stocker_salarie(Salarie obj, HashMap liste_salarie) {
		liste_salarie.put(obj.getCode(), obj);
	}

	public static void delete_concepteur(int code_salarie, HashMap liste_salarie) {
		if (liste_salarie.get(code_salarie) instanceof Concepteur) {
			liste_salarie.remove(code_salarie);
			System.out.println("Le concepteur a bien été supprimé !");
		} else {
			System.out.println("Pas d'exécution possible : le code entré n'est pas celui d'un Concepteur");
		}
	}
	
	public static void delete_analyste(int code_salarie, HashMap liste_salarie) {
		if (liste_salarie.get(code_salarie) instanceof Analyste) {
			liste_salarie.remove(code_salarie);
			System.out.println("L'Analyste a bien été supprimé !");
		} else {
			System.out.println("Pas d'exécution possible : le code entré n'est pas celui d'un Analyste");
		}
	}
	
	public static void display_concepteur(HashMap<Integer, Salarie> liste_salarie) {
		System.out.println("Voici la liste des concepteur :");
		for (Integer i : liste_salarie.keySet()) {
			if (liste_salarie.get(i) instanceof Concepteur) {
				System.out.println("id concepteur: " + i + " Dénomination: " + liste_salarie.get(i).getNom()+" "+liste_salarie.get(i).getPrenom());
			}
		}
	}

	public static void display_salarie(HashMap<Integer, Salarie> liste_salarie) {
		System.out.println("Voici la liste des salariés :");
		for (Integer i : liste_salarie.keySet()) {
			if (liste_salarie.get(i) instanceof Concepteur) {
				System.out.println(
						"id salarié: " + i +
						" Fonction: Concepteur" +
						" Dénomination: " + liste_salarie.get(i).getNom()+" "+liste_salarie.get(i).getPrenom());
			}else if (liste_salarie.get(i) instanceof Analyste){
				System.out.println(
						"id salarié: " + i +
						" Fonction: Analyste" +
						" Dénomination: " + liste_salarie.get(i).getNom()+" "+liste_salarie.get(i).getPrenom());
			}
			
		}
	}
}

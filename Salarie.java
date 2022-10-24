
public class Salarie {

	private int code;
	private String nom;
	private String prenom;
	private String date_embauche;

	public Salarie(int code, String nom, String prenom, String date_embauche) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.date_embauche = date_embauche;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDate_embauche() {
		return date_embauche;
	}

	public void setDate_embauche(String date_embauche) {
		this.date_embauche = date_embauche;
	}
	
	
}

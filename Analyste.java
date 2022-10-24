
public class Analyste extends Salarie{
	private int nbr_deplacement;
	
	public Analyste(int code, String nom, String prenom, String date_embauche, int nbr_deplacement) {
		super(code, nom, prenom, date_embauche);
		this.nbr_deplacement =nbr_deplacement;
		// TODO Auto-generated constructor stub
	}

	public int getNbr_deplacement() {
		return nbr_deplacement;
	}

	public void setNbr_deplacement(int nbr_deplacement) {
		this.nbr_deplacement = nbr_deplacement;
	}
	
	
}

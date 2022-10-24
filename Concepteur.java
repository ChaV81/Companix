
public class Concepteur extends Salarie{
	private int nbr_annees_dev;
	
	public Concepteur(int code, String nom, String prenom, String date_embauche, int nbr_annees_dev) {
		super(code, nom, prenom, date_embauche);
		this.nbr_annees_dev = nbr_annees_dev;
		// TODO Auto-generated constructor stub
	}

	public int getNbr_annees_dev() {
		return nbr_annees_dev;
	}

	public void setNbr_annees_dev(int nbr_annees_dev) {
		this.nbr_annees_dev = nbr_annees_dev;
	}
	
	
	
}

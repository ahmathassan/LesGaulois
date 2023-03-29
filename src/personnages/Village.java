package personnages;
import Personnages.Gaulois;


public class Village {
	private Gaulois[] villageois;
	private int nbvillageois = 0;
	private String nom;
	private Chef chef;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
		
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public void  ajouterHabitant(Gaulois gaulois) {
		villageois[nbvillageois] = gaulois;
		nbvillageois ++;
	}
	
	 public Gaulois trouverHabitant(int numvillageois) {
		 return
		 
		 
	 }
	 
	 public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		Gaulois gaulois = village.trouverHabitant(30); 
	}
	 


}

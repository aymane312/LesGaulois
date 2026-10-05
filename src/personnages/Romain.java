package personnages;

public class Romain {
	public Romain(String nom, String force) {
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private String force;
	
	public String getNom() {
		return nom;
	}
	

public void parler(String texte) {
	System.out.println(prendreparole()+"\""+ texte + "\"");
	
}
private String prendreParole() {
	return "Le romain" + nom +":";
	
}}

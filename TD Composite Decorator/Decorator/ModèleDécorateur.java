public class Mod�leD�corateur extends D�corateur {
	Mod�leD�corateur(ComposantGraphiqueV�hicule composant) {
		super(composant);
	}
	protected void afficheInfosTechniques() {
		System.out.println("Informations techniques du mod�le");
	}
	
	public void affiche() {
		super.affiche();
		this.afficheInfosTechniques();
	}
}

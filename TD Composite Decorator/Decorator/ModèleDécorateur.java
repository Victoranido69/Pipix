public class ModèleDécorateur extends Décorateur {
	ModèleDécorateur(ComposantGraphiqueVéhicule composant) {
		super(composant);
	}
	protected void afficheInfosTechniques() {
		System.out.println("Informations techniques du modèle");
	}
	
	public void affiche() {
		super.affiche();
		this.afficheInfosTechniques();
	}
}

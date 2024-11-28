public abstract class Décorateur implements ComposantGraphiqueVéhicule {
	ComposantGraphiqueVéhicule composant;
	
	Décorateur(ComposantGraphiqueVéhicule composant) {
		this.composant = composant;
	}
	
	public void affiche() {
		composant.affiche();
	}
}

public abstract class D�corateur implements ComposantGraphiqueV�hicule {
	ComposantGraphiqueV�hicule composant;
	
	D�corateur(ComposantGraphiqueV�hicule composant) {
		this.composant = composant;
	}
	
	public void affiche() {
		composant.affiche();
	}
}

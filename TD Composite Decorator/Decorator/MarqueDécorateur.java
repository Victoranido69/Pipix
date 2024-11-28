public class MarqueD�corateur extends D�corateur {
	MarqueD�corateur(ComposantGraphiqueV�hicule composant) {
		super(composant);
	}
	
	protected void afficheLogo() {
		System.out.println("Logo de la marque");
	}
	
	public void affiche() {
		super.affiche();
		this.afficheLogo();
	}
}

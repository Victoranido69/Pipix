public class MarqueDécorateur extends Décorateur {
	MarqueDécorateur(ComposantGraphiqueVéhicule composant) {
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

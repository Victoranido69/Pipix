public class VueCatalogue {
	public static void main(String[] args) {
		VueVéhicule vueVéhicule = new VueVéhicule();
		ModèleDécorateur modèleDécorateur = new ModèleDécorateur(vueVéhicule);
		MarqueDécorateur marqueDécorateur = new MarqueDécorateur(modèleDécorateur);
		marqueDécorateur.affiche();
	}
}

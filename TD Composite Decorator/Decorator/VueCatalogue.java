public class VueCatalogue {
	public static void main(String[] args) {
		VueV�hicule vueV�hicule = new VueV�hicule();
		Mod�leD�corateur mod�leD�corateur = new Mod�leD�corateur(vueV�hicule);
		MarqueD�corateur marqueD�corateur = new MarqueD�corateur(mod�leD�corateur);
		marqueD�corateur.affiche();
	}
}

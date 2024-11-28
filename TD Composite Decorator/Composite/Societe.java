public abstract class Societe {
	protected static double coetUnitVehicule = 5.0;
	protected int nbrVehicules;
	
	public void ajouteVehicule() {
		nbrVehicules = nbrVehicules + 1;
	}
	
	public abstract double calculeCoetEntretien();
	
	public abstract boolean ajouteFiliale(Societe filiale);
}

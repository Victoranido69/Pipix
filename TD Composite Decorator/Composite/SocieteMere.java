import java.util.*;
public class SocieteMere extends Societe {
	List<Societe> filiales = new ArrayList<Societe>();
	
	public boolean ajouteFiliale(Societe filiale) {
		return filiales.add(filiale);
	}

	public double calculeCoetEntretien() {
		double coet = 0.0;
		for (Societe filiale : filiales)
			coet = coet+filiale.calculeCoetEntretien();
		return coet+nbrVehicules*coetUnitVehicule;
	}
}

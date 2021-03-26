import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VueGestionTest {

	@Test
	void testSupprimerObjet() {
		ArrayList<Materiel> lesMateriels = new ArrayList<Materiel>();
		lesMateriels = Database.getLesMateriels();
		int tailleAvant = lesMateriels.size();
		Database.supprimerObjet(3);
		lesMateriels = Database.getLesMateriels();
		int tailleApres = lesMateriels.size();
		Assert.assertNotEquals("Suppression non effectué",tailleAvant,tailleApres);
	}

}

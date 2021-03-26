import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VueRechercherObjetTest {

	@Test
	void testRechercherObjet() {
		boolean recherche = Database.rechercherObjet(1);
		Assert.assertTrue("Recherche impossible",recherche);
	}

}

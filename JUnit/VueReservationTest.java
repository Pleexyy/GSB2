import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VueReservationTest {

	@Test
	void testReserverObjet() {
		int etatAvant  = Database.getNbObjetsEmpruntes();
		Database.reserverObjet(3);
		int etatApres  = Database.getNbObjetsEmpruntes();
		Assert.assertNotEquals("Ajout non effectué",etatAvant,etatApres);
	}

}

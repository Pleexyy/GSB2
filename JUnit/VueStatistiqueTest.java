import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VueStatistiqueTest {
	
	@Test
	void testGetnbObjets() {
		Assert.assertEquals("Nombre d'états incorrect",Database.getNbObjets(),2);
	}

	@Test
	void testGetNbObjetsEmpruntes() {
		Assert.assertEquals("Nombre d'états incorrect",Database.getNbObjetsEmpruntes(),1);
	}

}

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VueCatalogueTest {

	@Test
	void getLesMaterielsEmpruntes() {
		ArrayList<Materiel> lesMateriels = new ArrayList<Materiel>();
		lesMateriels = Database.getLesMaterielsEmpruntes();
		Assert.assertEquals("Nombre de mat�riels incorrect",lesMateriels.size(),1);
	}

}

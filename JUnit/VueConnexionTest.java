import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VueConnexionTest {

	@Test
	void testGetRole() {
		Assert.assertEquals("Rôle inexistant","visiteur",Database.getRole("dandre"));
		Assert.assertEquals("Rôle inexistant","responsable",Database.getRole("mludo"));
		Assert.assertEquals("Rôle inexistant","directeur",Database.getRole("dmartin"));
	}

}

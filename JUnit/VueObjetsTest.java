import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VueObjetsTest {

	@Test
	void testGetLesMateriels() {
		ArrayList<Materiel> lesMateriels = new ArrayList<Materiel>();
		lesMateriels = Database.getLesMateriels();
		Assert.assertEquals("Nombre de mat�riels incorrect",lesMateriels.size(),2);
	}
	
	@Test
	void testGetLibelle() {
		ArrayList<String> lesNoms = new ArrayList<String>();
		lesNoms = Database.getLibelle();
		Assert.assertEquals("Tous les libell�s ne sont pas r�cup�r�s",lesNoms.size(),1);
	}
	
	@Test
	void testGetNbLibelle() {
		Assert.assertEquals("Nombre d'�tats incorrect",Database.getNbLibelle(),1);
	}
	
	@Test
	void testGetNbEmpruntsParObjet() {
		ArrayList<MaterielTrie> lesEmprunts = new ArrayList<MaterielTrie>();
		lesEmprunts = Database.getNbEmpruntsParObjet();
		Assert.assertEquals("Nombre d'emprunt par objet incorrect",Database.getNbEmpruntsParObjet().size(),1);
	}
	
	@Test
	void testGetEmpruntsParVisiteurs() {
		ArrayList<EmpruntVisiteur> lesEmprunts = new ArrayList<EmpruntVisiteur>();
		lesEmprunts = Database.getEmpruntsParVisiteur();
		Assert.assertEquals("Nombre d'emprunt par visiteur incorrect",Database.getEmpruntsParVisiteur().size(),1);
	}

}

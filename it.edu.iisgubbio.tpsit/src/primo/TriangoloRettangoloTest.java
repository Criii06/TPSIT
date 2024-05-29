package primo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangoloRettangoloTest {

	TriangoloRettangolo triangolo = new TriangoloRettangolo(3,4);
	
	@Test
	
	void testarea() {
		assertEquals(6, triangolo.calcolaArea(),"Regolar area calcolation");
	}
	
	@Test
	
	void testperimetro() {
		assertEquals(12, triangolo.calcolaPerimetro(),"Regolar perimeter calcolation");
	}

}

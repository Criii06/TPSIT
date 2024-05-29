package biblioteca;

public class Biblioteca {
	Object[] libri = new Object[2];
	
	/**
	 * 
	 * @param libro nome libro
	 * @param disponibile disponibiltà libro
	 */
	
	public void aggiungi(String libro, boolean disponibile) {
		libri[0]=libro;
		libri[1]=disponibile;
	}
	
}

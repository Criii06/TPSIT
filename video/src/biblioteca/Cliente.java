package biblioteca;

import java.util.ArrayList;

public class Cliente extends Biblioteca{
	ArrayList<String> libriInPrestito = new ArrayList<String>();
	

	public int nLibriInPrestito() {
		return libriInPrestito.size();
		
	}

	public void prendiInPrestito(String libro) {
		if((boolean) libri[1]) {
			libriInPrestito.add((String) libri[0]);
		}
	}
}

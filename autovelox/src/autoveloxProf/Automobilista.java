package autoveloxProf;

public class Automobilista {
	String nome;
	String cognome;
	double soldi;
	int veloce;
	
	/**
	 * Questo metodo è il costruttore
	 * @param nome Il nome dell'autista
	 * @param cognome Il cognome dell'autista
	 * @param soldi il denaro disponibile
	 * @param veloce velocità autista
	 * @return Un oggetto della classe automobilista
	 */
	
	public Automobilista(String nome,String cognome,double soldi,int veloce) {
		this.nome=nome;
		this.cognome=cognome;
		this.soldi=soldi;
		this.veloce=veloce;
	}
	/**
	 * Questo metodo verifica se l'automobilista può pagare la multa
	 * @param multa il valore complessivo della multa
	 * @return boolean vero se soldi>=multa
	 */
	boolean pagabile(double multa) {
		if(this.soldi>=multa) {
			return true;
		}else {
			return false;
		}
		
	}
}

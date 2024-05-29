package autoveloxProf;

public class Poliziotto {
	int limiteVelox;
	double multaPerKm;
	
	public void settareLimite(int limite) {
		this.limiteVelox = limite;
	}
	public void settareMulta(double multa) {
		this.multaPerKm=multa;
	}
	public double calcolaMulta(int velocita) {
		if(velocita>this.limiteVelox) {
			return (multaPerKm*(velocita-this.limiteVelox));
		}else {
			return 0;
		}
	}
}
public class Main {
    public static void main(String[] args) {
        // Creazione del vettore
        Object[] array = new Object[2];

        // Assegnamento di una stringa e un booleano al vettore
        array[0] = "Hello, world!"; // Stringa
        array[1] = true; // Booleano

        // Accesso ai valori nel vettore
        String str = (String) array[0];
        boolean boolValue = (boolean) array[1];

        // Stampare i valori
        System.out.println("Stringa: " + str);
        System.out.println("Booleano: " + boolValue);
    }
}


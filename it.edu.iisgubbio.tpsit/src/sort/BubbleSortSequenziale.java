package sort;

public class BubbleSortSequenziale {
	public static void main(String[] args) {
		int vettore[] = new int[1000];
		for (int i = 0; i < 1000; i++) {
			int casuale = (int) (Math.random() * 100);
			vettore[i] = casuale;
		}

		int temp = 0; 

		for (int i = 0; i < vettore.length; i++) {
			for (int j = 1; j < (vettore.length - i); j++) {
				if (vettore[j - 1] > vettore[j]) {
					temp = vettore[j - 1];
					vettore[j - 1] = vettore[j];
					vettore[j] = temp;
				}
			}
		}

,
for (int i = 0; i < vettore.length; i++) {
			System.out.print(vettore[i] + " ");
		}
	}
}

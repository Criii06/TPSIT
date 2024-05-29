package semaforo;

import java.util.concurrent.Semaphore;
public class WorkerTread extends Thread{

	Semaphore sem;
	RisorsaCondivisa ris;

	public WorkerTread(Semaphore sem, RisorsaCondivisa ris, String threadName) {
		super(threadName);
		this.sem=sem;
		this.ris=ris;
	}
	@Override
	public void run() {
		if(this.getName().equals("P")) {
			
			System.out.println("sono il produttore");
			try {
				System.out.println("sono sempre il produttore, aspetto il permesso di scrivere");
				sem.acquire();
				System.out.println("permesso accordato");
				for(int i=0; i<5;i++) {
					ris.contatore++;
					System.out.println(getName()+":"+ris.contatore);
					Thread.sleep(10);
				}
			}
			catch (InterruptedException exc) {
				System.out.println(exc);
			}
			System.out.println("il produttore rilascia il permesso");
			sem.release();
			
		}else {
			
			System.out.println("sono il consumatore");
			try {
				System.out.println("sono sempre il consumatore, aspetto il permesso di leggere");
				sem.acquire();
				System.out.println("permesso accordato");
				for(int i=0; i<5;i++) {
					ris.contatore--;
					System.out.println(getName()+":"+ris.contatore);
					Thread.sleep(10);
				}
			}
			catch (InterruptedException exc) {
				System.out.println(exc);
			}
			System.out.println("il consumatore rilascia il permesso");
			sem.release();
			
		}
	}
}

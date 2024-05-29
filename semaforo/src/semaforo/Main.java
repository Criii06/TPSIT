package semaforo;

import java.util.concurrent.Semaphore;

public class Main {
public static void main(String[] args) throws InterruptedException{
	Semaphore sem = new Semaphore(1);
	RisorsaCondivisa risorsa = new RisorsaCondivisa();
	
	WorkerTread t1 = new WorkerTread(sem, risorsa, "P");
	WorkerTread t2 = new WorkerTread(sem, risorsa, "C");
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println( "valore finale contatore "+risorsa.contatore);
	
}
}

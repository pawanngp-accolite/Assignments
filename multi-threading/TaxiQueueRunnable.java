package MultiPackage;

import java.util.LinkedList;

public class TaxiQueueRunnable implements Runnable {

    private LinkedList<Taxi> taxiQueue;
    private TaxiStand taxiStand;

    public TaxiQueueRunnable(LinkedList<Taxi> q, TaxiStand l){
        taxiQueue = q;
        taxiStand = l;
    }

    @Override
    public void run() {
        System.out.println("Starting taxi Queue Thread...");
        while(true) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException ie) {

            }
            Taxi t = new Taxi(Taxi.taxi_count++);
         
			if (taxiStand.addTaxi(t)&&(!(taxiStand.isFull()))) {
				
				System.out.println("Taxi added");
			} else {
				System.out.println("Adding Taxi to the queue");
				  taxiQueue.add(t);
			
            }
        }
    }
}

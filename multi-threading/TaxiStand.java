package MultiPackage;

import java.util.LinkedList;
import java.util.ListIterator;

public class TaxiStand {
	private int size = 5;

	private LinkedList<Taxi> taxiStand;
	private LinkedList<Taxi> taxiQueue;
	private LinkedList<Passenger> passengerQueue;

	public TaxiStand(int capacity, LinkedList<Taxi> q, LinkedList<Passenger> pq) {
		size = capacity;
		taxiQueue = q;
		int taxi_count = 0;
		passengerQueue = pq;
		taxiStand = new LinkedList<Taxi>();
		for (int i = 0; i < size; i++) {
			taxiStand.add(new Taxi(taxi_count++));
		}
		System.out.println("Creating a TaxiStand with capacity " + size);
	}

	public boolean addTaxi(Taxi c) {

		if (taxiStand.size() < 5) {
			taxiStand.add(c);
			return true;
		}
		taxiQueue.add(c);
		return false;

	}

	public boolean remove(Taxi a) {
		return true;
	}

	public boolean isFull() {
		return (taxiStand.size() < size) ? false : true;
	}

	public boolean isEmpty() {
		return (taxiStand.size() == 0) ? true : false;
	}

	public boolean allocatePassenger(Passenger p) {
		boolean flag = false;
		Passenger p1 = passengerQueue.poll();
		ListIterator<Taxi> itr = taxiStand.listIterator();
		Taxi t = itr.next();
		while (itr.hasNext()) {

			if (t.isFull()) {
				System.out.println("Taxi to:" + t.getDestination() + "is leaving");
				taxiStand.remove(t);
				System.out.println("removed");
				if (taxiQueue.size() > 0)
					taxiStand.add(taxiQueue.removeFirst());

			} else if ((p1 != null) && p1.getDestination() == t.getDestination()) {
				passengerQueue.removeFirst();
				t.allocatePassenger(p1);
				flag = true;
				System.out.println("Queue length now:" + passengerQueue.size());
			} else if (t.allocatePassenger(p)) {
				flag = true;
			}

			if (flag == true)
				break;

		}
		if (flag == false) {
			System.out.println("Adding the passenger to Queue");
			passengerQueue.add(p);
		}
		return flag;

	}

	public void processPassengerQueue() {
		System.out.println("Starting to process passengerQueue with " + passengerQueue.size() + " passengers");

		for (Passenger i : passengerQueue) {
			if (this.allocatePassenger(i))
				;
			{
				passengerQueue.remove(i);
				System.out.println("One of them in queue is procseesed");
			}
		}
		System.out.println("After processing passengerQueue " + passengerQueue.size() + " passengers remain in queue");
	}

	public void printStatus() {
		ListIterator<Taxi> standIterator = taxiStand.listIterator();
		int position = 0;
		while (standIterator.hasNext()) {
			Taxi taxi = standIterator.next();
			position++;
			System.out.println(
					position + ". Taxi to " + taxi.getDestination() + " passengers=" + taxi.getpassengerCount());
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting simulaion...");
		System.out.println("Creating  Taxi Queue");

		LinkedList<Taxi> taxiQueue = new LinkedList<Taxi>();
		System.out.println("Creating Passenger Queue");
		LinkedList<Passenger> passengerQueue = new LinkedList<Passenger>();
		System.out.println("Creating  Taxi Stand");
		TaxiStand lot = new TaxiStand(5, taxiQueue, passengerQueue);

		TaxiQueueRunnable taxicreator = new TaxiQueueRunnable(taxiQueue, lot);
		PassengerQueueRunnable passengerCreator = new PassengerQueueRunnable(passengerQueue, lot);

		Thread taxi_t1 = new Thread(taxicreator);
		Thread pass_t2 = new Thread(passengerCreator);
		taxi_t1.start();
		pass_t2.start();

	}
}

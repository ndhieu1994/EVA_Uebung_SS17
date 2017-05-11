package de.eva.Verklemmung;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Ein weiteres Beispiel fuer einen Monitor, hier ueber ReentrantLock.
 * @author Marcel
 * @author Yves
 */
public class ChopStick {
	private Lock lock = new ReentrantLock(true);
	
	public boolean useWhenPossible(){
		// setze Lock wenn moeglich und gib true zurueck,
		// sonst warte NICHT darauf und gib false zurueck.
		return lock.tryLock();
	}
	
	public void putBackOnTable(){
		// hebe Lock wieder auf
		lock.unlock();
	}
	
}

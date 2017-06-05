package de.eva.RaceCondition;

/**
 * Nebenlaeufige Klasse.
 * Beispiel fuer eine RaceCondition.
 *
 * @author Marcel
 * @author Yves
 */
public class RaceCondition extends Thread {

  // gemeinsam geteiltes Objekt
  private KomplexeKlasse obj_kk;

  public RaceCondition(KomplexeKlasse obj) {
    this.obj_kk = obj;
  }

  @Override
  public void run() {

    // stuff, kann von allen gleichzeitig bearbeitet werden, keiner muss warten

    // ToDo: Möglichkeit 2: Realisiere Lock auf obj_kk nur für die for-Schleife
    // mit synchronized resource call auf obj_kk
    // nur um die forschleife
    synchronized (obj_kk) {
      for (int i = 0; i < 10; i++) {
        this.obj_kk.incNumber();
      }
    }

    // stuff, kann von allen gleichzeitig bearbeitet werden, keiner muss warten
  }
}

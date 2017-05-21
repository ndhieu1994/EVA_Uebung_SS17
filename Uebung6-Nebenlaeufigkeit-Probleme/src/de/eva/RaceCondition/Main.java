package de.eva.RaceCondition;

import java.util.ArrayList;

/**
 * Beispiel fuer eine RaceCondition.
 * Funktioniert nur, wenn das Schluesselwort
 * synchronized aus den anderen Klassen entfernt wird.
 *
 * @author Marcel
 * @author Yves
 */
public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Ablauf:
    // {
    //   Erzeuge 10 Threads, die jeweils 10 mal number vom geteilten Objekt kk aufrufen
    //   Erwartung: number hat am Ende den Wert 100
    // } wiederhole das ganze 100 mal

    for (int i = 0; i < 100; i++) {

      ArrayList<RaceCondition> rcs = new ArrayList<>();
      KomplexeKlasse kk = new KomplexeKlasse();
      // Erzeuge 10 Threads, starte und speichere diese in Liste rcs
      for (int j = 0; j < 10; j++) {
        RaceCondition rc = new RaceCondition(kk);
        rcs.add(rc);
        rc.start();
      }
      // warte darauf, dass alle fertig sind
      for (RaceCondition rc : rcs) {
        rc.join();
      }

      // gib Endergebnis aus
      int value = kk.getNumber();
      if (value != 100) {
        // in der Eclipsekonsole wird der Text rot dargestellt
        System.err.println(value);
      } else {
        //System.out.println(value);
      }
      // Ergebnis:
      // oftmals lief alles gut, jeder Durchlauf zeigt als Ergebnis 100
      // jedoch manchmal auch ein paar wenige, die nicht auf 100 kommen
      // -> RaceConditions nicht immer leicht auffindbar!
      // Loesung: nutze Monitor
    }

  }

}

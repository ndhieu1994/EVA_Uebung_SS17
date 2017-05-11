# EVA Übungsfragen aus der Vorlesung

## Frage 1
Welche der folgenden Aussagen trifft zu?

Java-Quellcode wird...
* **a)** ... interpretiert und von der JVM zur Laufzeit kompiliert.
* **b)** ... ausschließlich kompiliert.
* **c)** ... zu Bytecode kompiliert, welcher von der JVM zur Laufzeit interpretiert wird.
* **d)** ... zu Binärcode kompiliert, welcher von der JVM zur Laufzeit ausgeführt wird.

Antwort: **c**

## Frage 2

Code:
```java
int[] numbers1 = new int[] {23, 56, 68};
int[] numbers2 = new int[5];

numbers2 = numbers1;

System.out.println(numbers2[3]);
```

Was gibt das oben stehende Java-Codebeispiel auf der Konsole aus?

* **a)** Es wird nichts ausgegeben. Stattdessen wird eine NullPointerException geworfen.
* **b)** Ausgabe von null.
* **c)** Ausgabe von 68
* **d)** Es wird nichts ausgegeben. Stattdessen wird eine IndexOutOfBoundsException geworfen.

Antwort: **d**

## Frage 3

Welche Aussage ist korrekt? Race Conditions können...

* **a)** ... ein deterministisches Fehlverhalten erzeugen.
* **b)** ... durch Konstrukte wie beispielsweise eine Semaphor vermieden werden.
* **c)** ... immer leicht identifiziert und daher vernachlässigt werden.
* **d)** ... immer nur bei einzelnen Kontrollflüssen auftreten.

Antwort: **b**

## Frage 4

Welche der nachfolgenden Arten von Anfragen gibt die Kontrolle
unmittelbar an den Client zurück, wobei der Server anschließend den
Client zur Übermittlung des Ergebnisses aufruft?

* **a)** Einweganfragen
* **b)** Asynchrone Anfragen
* **c)** Synchrone Anfragen
* **d)** Verzögerte synchrone Anfragen

Antwort: **b**

## Frage 5

Das User Datagram Protocol (UDP) ist ein Protokoll der ...

* **a)** ... Darstellungssschicht
* **b)** ... Transportschicht
* **c)** ... Vermittlungsschicht
* **d)** ... Leitungsschicht

Antwort: **b**

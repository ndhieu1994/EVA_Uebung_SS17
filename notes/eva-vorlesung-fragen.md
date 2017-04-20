# EVA Übungsfragen aus der Vorlesung

## Frage 1
Welche der folgenden Aussagen trifft zu?

Java-Quellcode wird...
* a) inteperitert und von der JVM zur Laufzeit kompiliert.
* b) ausschlielich kompiliert.
* c) zu Bytecode kompiliert, welcher von der JVM zur Laufzeit interpretiert wird.
* d) zu Binärcode kompiliert, welcher von der JVM zur Laufzeit ausgeführt wird.

Antwort: c

## Frage 2

Code:
```java
int[] numbers1 = new int[] {23, 56, 68};
int[] numbers2 = new int[5];

numbers2 = numbers1;

System.out.println(numbers2[3]);
```

Was gibt das oben stehende Javatcodebeispiel auf der Konsole aus?

* a) Es wird nichts augegeben. Stattdessen wird eine NullPoineterException geworfen.
* b) Ausgabe von null.
* c) Ausgabe von 68
* d) Es wird nichts augegeben. Stattdessen wird eine IndexOutOfBoundsException geworfen.

Antwort: d

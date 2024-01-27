package ec.edu.epn.saew;

public class MemoryStore<T extends Grading> { // El T va a ser tipo de dato Grading, eso dice el extend

    public void add(T a) {
        // Procesamiento
        System.out.println(a.grade());
    }
}
public abstract class Animal { // No puede ser instanciada directamente, solo las clases hijas pueden hacerlo.
                               // Esta clase uno o varios metodos abstractos

    // Atributos
    protected int size;
    protected int extremities;

    // Constructor por defecto
    public Animal() {
        size = 10;
        extremities = 4;
    }

    // Constructor sobrecargado
    public Animal(int defaultSize, int defaultExtremities) {
        this.size = size;
        this.extremities = extremities;
    }

    private void myPrivateOperation() {
        System.out.println("This is a private method");
    }

    // Operaciones o Metodos a nivel de clase
    public void walk() {
        System.out.println("Walking: " + extremities);
        myPrivateOperation();
        int tmpSize = size;
    }

    public void eat() {
        System.out.println("Eating");
    }

    public abstract void run(); // No tiene implementacion, las clases hijas tendran esta implementacion.

}

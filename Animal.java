public class Animal {

    // Atributos
    protected int size;
    protected int extremities;

    // Constructor por defecto
    public Animal() {
        size = 10;
        extremities = 4;
    }

    //Constructor sobrecargado
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
}

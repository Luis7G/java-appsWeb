public class Dog extends Animal {
    public void bark() {
        System.out.println("Barking");
    }

    // this - super
    int tmpSize = super.size;

    // Socreescribir el metodo del padre - Socrrescritura de metodos
    @Override
    public void eat() {
        super.eat();
        System.out.println("I'm a dog and I'm eating");
    }

    // Sobrecarga de metodos o polimorfismo
    public void searchFood(int timeAvailable) {
        System.out.println("Search Food; " + timeAvailable);
    }

    public void searchFood(int timeAvailable, String foodName) {
        System.out.println("Search Food: " + timeAvailable + " foodName: " + foodName);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    //Colocar diferencias entre interfaces y abstractas
}
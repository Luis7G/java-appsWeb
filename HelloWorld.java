import java.util.Date;
import ec.edu.epn.saew.Student;

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        /*
         * Comentario Multlinea
         */
        Animal animal = new Animal(12, 4);
        animal.walk();
        animal.eat();

        Dog dog = new Dog();
        dog.walk();
        dog.bark();
        dog.eat();
        dog.searchFood(1, "Meat");
        Date date = new Date();
        System.out.println("Date: " + date.getTime());

        Student student = new Student("John Doe", "Computer Science");
        student.printInfo();

        // Descargar .jar de joda time Y COLOCAR EN CARPETA LIB.
    }
}
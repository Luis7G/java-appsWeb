import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ec.edu.epn.saew.Exam;
import ec.edu.epn.saew.Grading;
import ec.edu.epn.saew.MemoryStore;
import ec.edu.epn.saew.Student;
import ec.edu.epn.saew.Test;

public class CollectionDemo {
    public static void main(String[] args) {
        // Primitivos
        int a = 1;
        double d = 1234.2;
        float f = 1234.2f;
        long l = 1234;
        char c = 'a';
        boolean b = true; // false
        String s = "Hello World";

        // Datos asociados a objetos
        String s2 = new String("Hello World");

        // Arreglos
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        arr1[0] = 1;
        arr2[1] = 2;

        for (int i : arr1) {
            System.out.println("arr" + i);
        }

        if (arr1 == arr2) {
            System.out.println("Array is equal");
        } else {
            System.out.println("Array is not equal");
        }

        Student student1 = new Student("John Doe", "Computer Science");
        Student student2 = new Student("John Doe", "Computer Science");

        if (student1 == student2) {
            System.out.println("Student is equal");
        } else {
            System.out.println("Student is not equal");
        }

        // With equals
        if (student1.equals(student2)) {
            System.out.println("Student is equal");
        } else {
            System.out.println("Student is not equal");
        }

        List<Student> myList = new LinkedList<Student>();
        // List<Student> myList = new LinkedList<>();
        myList.add(student1);
        myList.add(student2);

        // Polimorfismo
        Grading gradingExam = new Exam();
        // System.out.println("Exam: " + exam.grade());

        Grading gradingTest = new Test();
        // System.out.println("Test: " + test.grade());

        // Grading grading = new Exam();
        // grading.grade();

        /**
         * Login logging = new MQLogger();
         * logging.log("Log de mi aplicacion");
         */

        // MemoryStore<Grading> memoryStore = new MemoryStore<Grading>(); ó
        MemoryStore<Grading> memoryStore = new MemoryStore<>();
        memoryStore.add(gradingExam);
        memoryStore.add(gradingTest);

        // MemoryStore<ArraList<String>> memoryStore = new MemoryStore<>(); //ya no me
        // deja instanciarlo por el metodo de la clase memorystore.

    }
}

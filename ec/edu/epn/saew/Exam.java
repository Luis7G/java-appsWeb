package ec.edu.epn.saew;

public class Exam implements Grading {
    public void performTest() {
        Student student = new Student("John Doe", "Computer Science");
        System.out.println(student.grade);
    }

    @Override
    public int grade() {
        return 3;
    }
}

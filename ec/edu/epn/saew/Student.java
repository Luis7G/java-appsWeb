package ec.edu.epn.saew;

//Domain Driver Development

public class Student {
    private String name;
    private String career;

    int grade;

    public Student(String name, String career) {
        this.name = name;
        this.career = career;
    }

    public void printInfo() {
        System.out.println("Student name: " + name + " Student Career: " + career);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((career == null) ? 0 : career.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (career == null) {
            if (other.career != null)
                return false;
        } else if (!career.equals(other.career))
            return false;
        return true;
    }

}

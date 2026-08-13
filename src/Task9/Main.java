package Task9;

public class Main {
    public static void main(String[] args) {
        University university = new University("ADA");
        University.Faculty faculty = university.new Faculty("IT");
        University.Faculty.Student student = faculty.new Student("Kamran", 92);

        student.printInfo();
    }
}

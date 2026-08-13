package Task9;

public class University {
    String name;

    University(String name) {
        this.name = name;
    }

    class Faculty {
        String facultyName;

        Faculty(String facultyName) {
            this.facultyName = facultyName;
        }

        class Student {
            String name;
            int grade;

            public Student(String name, int grade) {
                this.name = name;
                this.grade = grade;
            }

            void printInfo() {
                System.out.println("University: " + University.this.name);
                System.out.println("Faculty: " + Faculty.this.facultyName);
                System.out.println("Student: " + name);
                System.out.println("Grade: " + grade);
            }
        }
    }
}

package Task7;

public class Main {
 static void main(String[] args) {

            Student student = new Student.Builder()
                    .setName("Ali")
                    .setAge(20)
                    .build() ;


            System.out.println(student.getName()  + " " + student.getAge());

        }


    }


package Task1;

public class Main {
    static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
              System.out.println( "Hello Java ");
            }
        };
        greeting.sayHello();
    }
}

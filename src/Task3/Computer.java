package Task3;

public class Computer {
     class Keyboard{
        void type(){
            System.out.println("Typing...");
        }
    }

    static void main(String[] args) {
        Computer computer = new Computer() ;
      Computer.Keyboard keyboard =  computer.new Keyboard() ;
      keyboard.type();


    }
}

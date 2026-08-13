package Task8;

public class Main {
    static void main(String[] args) {
        Button button = new Button();
        button.setClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked!");
            }
        });
        button.click();
    }

}

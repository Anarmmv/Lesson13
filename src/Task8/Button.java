package Task8;

public class Button {
ClickListener listener ;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }
    void click(){
        listener.onClick();
    }
}

import java.awt.*;

public class AWT2 extends Frame {

    public AWT2() {
        System.out.println("Creating Frame...");

        Button button = new Button("Hello");
        button.setBounds(20, 50, 100, 20);
        add(button);
        setSize(300,300); 
        setTitle("This is our basic AWT example");   
        setLayout(null);   
        setVisible(true); 
    }

    public static void main(String[] args) {
        AWT2 myFrame = new AWT2();
    }
    
}

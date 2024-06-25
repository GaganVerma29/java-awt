import java.awt.*;

public class BasicSumCalculator extends Frame {

    public BasicSumCalculator() {
        Label label1 = new Label("First Number: ");
        Label label2 = new Label("Second Number: ");
        label1.setBounds(20, 50, 140, 20);
        label2.setBounds(20, 90, 140, 20);

        add(label1);
        add(label2);

        TextField textfield1 = new TextField();
        TextField textfield2 = new TextField();
        textfield1.setBounds(180, 50, 100, 20);
        textfield2.setBounds(180, 90, 100, 20);

        add(textfield1);
        add(textfield2);

        Button button1 = new Button("ADD");
        button1.setBounds(20, 130, 100, 20); 
        add(button1);

        Button button2 = new Button("RESET");
        button2.setBounds(20, 170, 100, 20); 
        add(button2);

        TextField textField3 = new TextField();
        textField3.setBounds(180, 130, 100, 20);
        add(textField3);

        setTitle("Basic Sum Calculator");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        BasicSumCalculator cal = new BasicSumCalculator();
    }    
}

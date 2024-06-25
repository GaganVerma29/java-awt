import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicSumCalculator2 extends Frame implements ActionListener {

    TextField textField1, textField2, textField3;
    Button button1, button2;
    public BasicSumCalculator2() {
        Label label1 = new Label("First Number: ");
        Label label2 = new Label("Second Number: ");
        label1.setBounds(20, 50, 140, 20);
        label2.setBounds(20, 90, 140, 20);

        add(label1);
        add(label2);

        textField1 = new TextField();
        textField2 = new TextField();
        textField1.setBounds(180, 50, 100, 20);
        textField2.setBounds(180, 90, 100, 20);

        add(textField1);
        add(textField2);

        button1 = new Button("ADD");
        button1.setBounds(20, 130, 100, 20); 
        add(button1);

        button1.addActionListener(this);

        button2 = new Button("RESET");
        button2.setBounds(20, 170, 100, 20); 
        add(button2);

        button2.addActionListener(this);

        textField3 = new TextField();
        textField3.setBounds(180, 130, 100, 20);
        textField3.setEnabled(false);
        textField3.setEditable(false);
        add(textField3);

        setTitle("Basic Sum Calculator");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        BasicSumCalculator2 cal = new BasicSumCalculator2();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            int value1 = Integer.parseInt(textField1.getText());
            int value2 = Integer.parseInt(textField2.getText());
            int sum = value1 + value2;
            textField3.setText(String.valueOf(sum));
        } else {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
        }
        
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }    
}

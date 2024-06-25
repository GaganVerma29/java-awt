// Prerequisite for BasicSumCalculator2

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListner extends Frame implements ActionListener {

    TextField textField; // int a;
    public EventListner() {

        textField = new TextField("0"); // a = 5;
        textField.setBounds(20, 50, 100, 20);
        textField.setEditable(false);
        textField.setEnabled(false);
        add(textField);

        Button add5Button = new Button("Add 5");
        add5Button.setBounds(20, 90, 100, 20);
        add(add5Button);

        add5Button.addActionListener(this);

        setTitle("Learning Event Listener");
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int value = Integer.parseInt(textField.getText());
        textField.setText(String.valueOf(value + 5));
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        EventListner eL = new EventListner();
    }
    
}

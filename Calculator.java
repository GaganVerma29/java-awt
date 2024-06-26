import java.awt.*;

public class Calculator extends Frame{
    public Calculator(){

        Button button1 = new Button("7");
        button1.setBounds(10, 60, 25, 25); 
        add(button1);

        Button button2 = new Button("8");
        button2.setBounds(45, 60, 25, 25); 
        add(button2);

        Button button3 = new Button("9");
        button3.setBounds(80, 60, 25, 25); 
        add(button3);

        Button button4 = new Button("*");
        button4.setBounds(115, 60, 25, 25); 
        add(button4);

        Button button5 = new Button("4");
        button5.setBounds(10, 95, 25, 25); 
        add(button5);

        Button button6 = new Button("5");
        button6.setBounds(45, 95, 25, 25); 
        add(button6);

        Button button7 = new Button("6");
        button7.setBounds(80, 95, 25, 25); 
        add(button7);

        Button button8 = new Button("-");
        button8.setBounds(115, 95, 25, 25); 
        add(button8);

        Button button9 = new Button("1");
        button9.setBounds(10, 130, 25, 25); 
        add(button9);

        Button button10 = new Button("2");
        button10.setBounds(45, 130, 25, 25); 
        add(button10);

        Button button11 = new Button("3");
        button11.setBounds(80, 130, 25, 25); 
        add(button11);

        Button button12 = new Button("+");
        button12.setBounds(115, 130, 25, 25); 
        add(button12);

        Button button13 = new Button("00");
        button13.setBounds(10, 165, 25, 25); 
        add(button13);

        Button button14 = new Button("0");
        button14.setBounds(45, 165, 25, 25); 
        add(button14);

        Button button15 = new Button(".");
        button15.setBounds(80, 165, 25, 25); 
        add(button15);

        Button button16 = new Button("=");
        button16.setBounds(115, 165, 25, 25); 
        add(button16);

        TextField textField1 =  new TextField();
        textField1.setBounds(10,30,130,20);
        add(textField1);

        setTitle("Calculator");
        setSize(150, 200);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
    }
}

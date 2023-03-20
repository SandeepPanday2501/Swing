import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello World");

        // button add
        JButton button = new JButton("Click me!");
        button.setBounds(100,100,100,50);
        frame.add(button);

        JLabel label = new JLabel("Hello!");
        label.setBounds(50,50,100,50);
        frame.add(label);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
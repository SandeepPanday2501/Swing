import javax.swing.*;
import java.awt.*;

public class Title {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello darkness my old friend");
        frame.setSize(400,400); //frame size fix!
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.getContentPane().setBackground(Color.black);



        //button
        JButton button = new JButton("Click me!");
        button.setBounds(100,100,100,50);
        frame.add(button);

        frame.setResizable(false); //no resize!
        frame.setLayout(null);
        frame.setVisible(true); //frame visible!
    }

}

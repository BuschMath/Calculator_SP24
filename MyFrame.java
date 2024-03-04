import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Calculator");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(2, 1, 5, 5));
        JTextComponent textComponent = new JTextField("0");
        panel.add(textComponent);
        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        MyButton button1 = new MyButton("1");
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textComponent.setText("1");
            }
        
        });
        
        buttonPanel.add(button1);
        MyButton button2 = new MyButton("2");
        buttonPanel.add(button2);
        MyButton button3 = new MyButton("3");
        buttonPanel.add(button3);
        MyButton button4 = new MyButton("4");
        buttonPanel.add(button4);
        MyButton button5 = new MyButton("5");
        buttonPanel.add(button5);
        MyButton button6 = new MyButton("6");
        buttonPanel.add(button6);
        MyButton button7 = new MyButton("7");
        buttonPanel.add(button7);
        MyButton button8 = new MyButton("8");
        buttonPanel.add(button8);
        MyButton button9 = new MyButton("9");
        buttonPanel.add(button9);
        MyButton button0 = new MyButton("0");
        buttonPanel.add(button0);

        panel.add(buttonPanel);
        add(panel);
    }
}


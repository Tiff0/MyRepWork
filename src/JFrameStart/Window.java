package JFrameStart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.*;

public class Window implements ActionListener{
    JButton button;

    public static void main(String[] args){
        Window gui = new Window();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me");

        button.addActionListener(this);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        button.setSize(200,200);
        button.setForeground(Color.white);
        button.setBackground(Color.DARK_GRAY);
        frame.getContentPane().add(button);
        frame.setSize(600,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        button.setBackground(Color.CYAN);

        button.setText("I've been checked!");
    }
}
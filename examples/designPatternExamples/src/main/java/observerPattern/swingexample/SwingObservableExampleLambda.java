package main.java.observerPattern.swingexample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObservableExampleLambda {
    JFrame frame;

    public static void main (String[] args) {
        SwingObservableExampleLambda swingObservableExample = new SwingObservableExampleLambda();
        swingObservableExample.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(e -> System.out.println("Don' t do it!"));
        button.addActionListener(e -> System.out.println("Do it!"));

        //set frame properties
    }
}

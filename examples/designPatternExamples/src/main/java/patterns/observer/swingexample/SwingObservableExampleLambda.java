package main.java.patterns.observer.swingexample;

import javax.swing.*;

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

package com.composite.components;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new MainComponent());
        setVisible(true);
        setBounds(200, 200, 600, 400);
    }

}

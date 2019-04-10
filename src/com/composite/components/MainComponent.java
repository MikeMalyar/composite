package com.composite.components;

import com.composite.graphic.CompositeGraphic;
import com.composite.graphic.EllipseGraphic;
import com.composite.graphic.RectangleGraphic;

import javax.swing.*;
import java.awt.*;

public class MainComponent extends JComponent {

    private CompositeGraphic graphic;

    public MainComponent() {
        CompositeGraphic black = new CompositeGraphic();
        CompositeGraphic blue = new CompositeGraphic();

        EllipseGraphic ellipse1 = new EllipseGraphic(100, 50, 100, 70, Color.BLACK);
        EllipseGraphic ellipse2 = new EllipseGraphic(300, 250, 100, 70, Color.BLUE);

        RectangleGraphic rectangle1 = new RectangleGraphic(200, 200, 50, 100, Color.BLACK);
        RectangleGraphic rectangle2 = new RectangleGraphic(400, 250, 100, 50, Color.BLUE);

        black.add(ellipse1);
        black.add(rectangle1);

        blue.add(ellipse2);
        blue.add(rectangle2);

        graphic = new CompositeGraphic();
        graphic.add(black);
        graphic.add(blue);
    }

    @Override
    public void paintComponent(Graphics g) {
        graphic.paint(g);
    }

}

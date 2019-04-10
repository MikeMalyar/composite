package com.composite.graphic;

import java.awt.*;

public class RectangleGraphic implements ComponentGraphic {

    private int x, y;
    private int width, height;
    private Color color;

    public RectangleGraphic(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graph = (Graphics2D)g;

        graph.setPaint(color);
        graph.fillRect(x, y, width, height);
    }
}

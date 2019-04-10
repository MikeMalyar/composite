package com.composite.graphic;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements ComponentGraphic {

    private List<ComponentGraphic> mChildComponentGraphics = new ArrayList<>();

    public void paint(Graphics g) {
        for (ComponentGraphic componentGraphic : mChildComponentGraphics) {
            componentGraphic.paint(g);
        }
    }

    public void add(ComponentGraphic componentGraphic) {
        mChildComponentGraphics.add(componentGraphic);
    }

    public void remove(ComponentGraphic componentGraphic) {
        mChildComponentGraphics.remove(componentGraphic);
    }

}


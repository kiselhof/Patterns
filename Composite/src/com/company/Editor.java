package com.company;

import java.util.ArrayList;

public class Editor {
    private CompoundGraphic all;

    //work with single objects
    public void load(){
        all = new CompoundGraphic();
        all.add(new Dot(1,2));
        all.add(new Circle(5,0,5));
    }

    //grouping chosen elements in one compound
    public void groupSelected(ArrayList<GraphicUI> components){
        CompoundGraphic group = new CompoundGraphic();
        group.add((GraphicUI) components);
        all.remove((GraphicUI) components);
        all.add(group);
        all.get_ccordinats();
    }
}

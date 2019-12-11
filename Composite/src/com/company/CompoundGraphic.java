package com.company;

import java.util.ArrayList;

public class CompoundGraphic implements GraphicUI {
    private ArrayList<GraphicUI> _children;

    public CompoundGraphic(){
        _children = new ArrayList<>();
    }

    public void add(GraphicUI child){
        _children.add(child);
    }

    public void remove(GraphicUI child){
        _children.remove(child);
    }

    public void move(int x, int y){
        for (int i =0; i<_children.size(); i++){
            _children.get(i).move(x,y);
        }
    }

    public void get_ccordinats(){
        for (int i =0; i<_children.size(); i++){
            _children.get(i).get_ccordinats();
        }
    }

    public ArrayList<GraphicUI> get_children(){ return  _children;}

}

package com.company;

public class Dot implements GraphicUI{
    private int _x;
    private int _y;

    public Dot(int x, int y){
        this._x = x;
        this._y = y;
    }
    public void move(int x, int y){
        this._x += x;
        this._y += y;
    }

    public void get_ccordinats(){
        System.out.println("("+ _x + "," + _y + ")");
    }
    public int get_x(){return this._x;  }
    public int get_y(){return this._y;  }
}

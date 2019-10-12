package com.company;

public class BrickWallCreator extends WallCreator {
    WallCreator WallCreator;

    public BrickWallCreator(){}

    @Override
    public WallCreator get_wall() {
        return WallCreator;
    }

    @Override
    public void set_wall(WallCreator wall) {
        this.WallCreator = wall;
    }

    @Override
    public void BuildWallWithDoor() {
        System.out.println("Brick wall with door");
    }

    @Override
    public void BuildWall() {
        System.out.println("Brick wall");
    }

    @Override
    public void BuildWallWithWindow() {
        System.out.println("Brick wall with window");
    }
}

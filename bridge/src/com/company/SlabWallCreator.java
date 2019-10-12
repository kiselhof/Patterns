package com.company;

public class SlabWallCreator extends WallCreator {
    WallCreator WallCreator;

    public SlabWallCreator(){}

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
        System.out.println("Slab wall with door");
    }

    @Override
    public void BuildWall() {
        System.out.println("Slab wall");
    }

    @Override
    public void BuildWallWithWindow() {
        System.out.println("Slab wall with window");
    }
}

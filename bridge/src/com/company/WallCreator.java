package com.company;

public abstract class WallCreator implements IwallCreator{
    public abstract void BuildWallWithDoor();
    public  abstract void BuildWall();
    public  abstract void BuildWallWithWindow();
    @Override
    public  abstract WallCreator get_wall();
    @Override
    public  abstract void set_wall(WallCreator wall);
}

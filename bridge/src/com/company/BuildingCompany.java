package com.company;

public class BuildingCompany implements IBuildingCompany{
    IwallCreator _WallCreator;

    @Override
    public void BuildFoundation() {
        System.out.println("Foundation is built");
    }

    @Override
    public void BuildRoom() {
        _WallCreator.BuildWallWithDoor();
        _WallCreator.BuildWall();
        _WallCreator.BuildWallWithWindow();
        _WallCreator.BuildWall();
        System.out.println("Room finished"+ "\n");

    }

    @Override
    public void BuildRoof() {
        System.out.println("Roof is done");
    }

    @Override
    public void set_WallCreator(WallCreator wallCreator) {
        this._WallCreator = wallCreator;
    }
}

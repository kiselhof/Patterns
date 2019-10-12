package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BrickWallCreator brickWallCreator = new BrickWallCreator();
        SlabWallCreator slabWallCreator = new SlabWallCreator();

        BuildingCompany buildingCompany = new BuildingCompany();
        buildingCompany.BuildFoundation();

        buildingCompany.set_WallCreator(slabWallCreator);
        buildingCompany.BuildRoom();

        buildingCompany.set_WallCreator(brickWallCreator);
        buildingCompany.BuildRoom();
        buildingCompany.BuildRoom();

        buildingCompany.BuildRoof();
    }
}

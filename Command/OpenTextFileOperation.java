package com.company;


public class OpenTextFileOperation implements TextFileOperationUI {
    private TextFile textFile;

    @Override
    public String execute() {
        return textFile.open();
    }
}

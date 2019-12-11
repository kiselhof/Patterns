package com.company;

import java.util.Properties;

public class SaveTextFileOperation implements TextFileOperationUI {
    private TextFile textFile;
    @Override
    public String execute() {
        return textFile.save();
    }
}

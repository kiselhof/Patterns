package com.company;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
    private final List<TextFileOperationUI> textFileOperations
            = new ArrayList<>();

    public String executeOperation(TextFileOperationUI textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}

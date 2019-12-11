package com.company;

public class Main {

    public static void main(String[] args) {
/*
As the TextFileOperationUI interface is a functional interface,
we can pass command objects in the form of lambda expressions
to the invoker, without having to create the
TextFileOperationUI instances
 */
        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt");
        textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt");
    }
}

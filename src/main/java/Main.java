package main.java;

import main.java.Entity.Array;
import main.java.FileReader.FileReader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String path;
        if (!Arrays.asList(args).isEmpty()) {
            path = Arrays.asList(args).get(0);
        } else {
            path = "";
        }
        FileReader fileReader = new FileReader();
        List<Integer> arguments = fileReader.getArgs(path);
        Array array = new Array();
        if (!arguments.isEmpty()) {
            array.getIssue(arguments);
        }
    }
}

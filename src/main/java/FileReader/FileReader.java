package main.java.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public List<Integer> getArgs(String path) throws IOException {
        List<Integer> arguments = new ArrayList<>();
        try {
            java.io.FileReader fr = new java.io.FileReader(path);
            Scanner scan2 = new Scanner(fr);
            while (scan2.hasNext()) {
                arguments.add(scan2.nextInt());
            }
            fr.close();
        } catch (IOException e) {

        }
        return arguments;
    }
}

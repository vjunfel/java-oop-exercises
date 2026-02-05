package com.myapp.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MyFileBuffer {
    private static final String[] names = {"John", "Mark", "James"};

    public void printBuffer() {
        System.out.println("Result located in output.txt and list.csv");

        writeToFile("output.txt", true);
//        writeToFile("D:\\Accenture\\projects\\ProjectUno\\src\\com\\myapp\\buffer\\list.csv", false);
    }

    private void writeToFile(String path, boolean includeHeaders) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {

            if (includeHeaders) {
                writer.write("This is the Header.");
                writer.newLine();
            }

            writer.write("This line is part of the body.");
            writer.newLine();

            for (String name : names) {
                writer.write(includeHeaders ? "Name: " + name : name);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

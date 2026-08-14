package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        // Points at demo1.txt sitting right next to this file in the repo.
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Lenovo\\Documents\\programing\\Practice\\Basic-java-Practice-repo\\src\\org\\tnsif\\acc\\c2tc\\scannerclass_bufferreader\\demo1.txt"));

        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }
        br.close();
    }
}

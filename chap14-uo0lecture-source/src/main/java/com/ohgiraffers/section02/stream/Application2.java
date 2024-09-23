package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        // FileReader

        // FileInputStream 과는 다르게 byte 단위가 아닌 character 단위로 읽어온다.

        FileReader fr = null;

        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

            int value;

            while ((value = fr.read()) != -1){
                System.out.println("value = " + (char)value);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

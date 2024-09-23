package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {

        FileWriter fw = null;

        try {
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testFileWriter.txt");

            fw.write(97);
            fw.write(10);
            fw.write('A');
            fw.write(10);
            fw.write(new char[] {'a','b','c'});
            fw.write(10);
            fw.write("힘들어어");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null){
                try {
                    // close를 하면 flush가 되는데 flush는 남은 잔류데이터를 내보내는 것이다.
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

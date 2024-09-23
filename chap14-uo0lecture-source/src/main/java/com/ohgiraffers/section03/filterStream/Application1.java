package com.ohgiraffers.section03.filterStream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        //BufferWriter 과 BufferReader

        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterStream/testBuffered.txt"));

            bw.write("안녕하세요\n반가워요\n이제 bye~");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterStream/testBuffered.txt"));
            
            String temp;

            // 한줄단위로 읽는다.
            while ((temp = br.readLine()) != null){
                System.out.println("temp = " + temp);
            }
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

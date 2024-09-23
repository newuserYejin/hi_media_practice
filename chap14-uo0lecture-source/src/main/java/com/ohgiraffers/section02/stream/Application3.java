package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {

        // byte 단위 처리
        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutPutStream.txt");

            fout.write(97);

            // 10에 해당하는 문자는 줄바꿈이다.
            byte[] barr = new byte[] {10,98,99,100,101,10,103};

            fout.write(barr);

            // 배열의 인덱스 위치 1부터 길이 3만큼 추가
            fout.write(barr,1,3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fout.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
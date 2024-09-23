package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        
        // 입출력 스트림

        // InputStream

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
            
            int value;
            
            while ((value = fin.read()) != -1){
                System.out.println("value = " + value);
                System.out.println("(char)value = " + (char)value);
            }
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            
            // finally 는 try/catch 와 상관없이 실행시키는 구역

            // 파일을 작업 후 닫아주지 않으면 장기간 실행 프로그램으로 리소스 누수가 발생한다.
            try {
                fin.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

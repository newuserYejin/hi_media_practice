package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        // File

        // 파일 처리 수행 클래스

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess = " + createSuccess);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("file.length() = " + file.length());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());

        boolean isDelete =file.delete();
        System.out.println("isDelete = " + isDelete);
    }

}

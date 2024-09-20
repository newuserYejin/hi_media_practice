package com.ohgiraffers.section01.list;
import java.util.ArrayList;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {

        ArrayList bookList = new ArrayList();

        bookList.add(new BookDTO(bookList.size()+1,"잭과 콩나무","누군가",10000));
        bookList.add(new BookDTO(bookList.size()+1,"잭과 콩나물","누구",12000));
        bookList.add(new BookDTO(bookList.size()+1,"잭과 공나무","누구겠지",9000));
        bookList.add(new BookDTO(bookList.size()+1,"잭과 콩두부","누구지?",7000));
        for (int i = 0; i<bookList.size();i++){
            System.out.println((i+1)+"번째의 데이터 : "+bookList.get(i));
        }

        for (Object b : bookList){
            System.out.println(b);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("책 제목을 입력해주세요: ");
        String name = sc.nextLine();

        System.out.print("작가 입력해주세요: ");
        String author = sc.nextLine();

        System.out.print("가격을 입력해주세요: ");
        int price = sc.nextInt();

        bookList.add(1,new BookDTO(bookList.size()+1,name,author,price));

        for (Object b : bookList){
            System.out.println(b.toString());
        }
    }
}
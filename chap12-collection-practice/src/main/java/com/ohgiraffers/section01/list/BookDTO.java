package com.ohgiraffers.section01.list;

public class BookDTO {

    private int bookNo;
    private String name;
    private String author;
    private int price;
    
    public BookDTO(){};

    // 매개변수 있는 생성자
    public BookDTO(int bookNo, String name, String author, int price) {
        this.bookNo = bookNo;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bookNo=" + bookNo +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

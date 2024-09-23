package com.ohgiraffers.practice;

import java.util.*;

public class BookManager {

    private ArrayList<BookDTO> booklist = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    // 기본 생성자
    public BookManager(){};

    public void addBook(BookDTO book){
        this.booklist.add(book);
    }

    // 해당 번호의 도서 삭제
    public void deleteBook(int index){
        boolean exist = false;

        //향상된 for문으로 작성 시 중간에 값이 삭제되면서 booklist의 구조가 변경되어 error가 발생한다.
        // 따라서 Iterator 를 사용하는 것이 안전한 삭제 방법이다.
        Iterator<BookDTO> iter = booklist.iterator();

        while (iter.hasNext()){
            if (iter.next().getbNo() == index){
                iter.remove();
                System.out.println("헤당도서가 삭제 되었습니다.");
                exist = true;
            }
        }

        if (!exist){
            System.out.println("해당 번호를 가지고 있는 도서가 없어서 삭제하지 못했습니다.");
        }
    }

    // tilte일치하는 도서의 정보 출력
    public void searchBook(String btitle){
        boolean found = false;

        if (booklist.isEmpty()) {
            System.out.println("도서 목록이 비어 있어 검색 할 수 없습니다.");
        } else {
            for (BookDTO book : booklist) {
                if (book.getTitle().equals(btitle)) {
                    System.out.println("해당 도서 정보 = " + book.toString());
                    found = true;
                    break;
                }
            }

            if (!found){
                System.out.println("조회한 도서가 목록에 없습니다.");
            }
        }
    }

    // 도서의 전체 목록 출력
    public void displayAll(){
        if (booklist.isEmpty()){
            System.out.println("조회결과가 없습니다.");
        } else{
            System.out.println("\n==========================");

            for (BookDTO book : booklist){
                System.out.println(book.toString());
            }

            System.out.println("==========================");
        }
    }

    public boolean checkNo(int num){
        boolean useOk = true;

        for (BookDTO book : booklist){
            if (book.getbNo() == num){
                useOk = false;
            }
        }

        return useOk;
    }

//     정렬
    public List<BookDTO> sortedBookList(int type){

        switch (type){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }

    }

    public void printBookList(List<BookDTO> printList){

    }

}

package com.ohgiraffers.practice;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BookMenu {

    Random random = new Random();
    private int count;

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu(){}

    public void mainMenu(){
        while (true){
            try{
                System.out.println("\n*** 도서 관리 프로그램 ***");
                System.out.println("1. 새 도서 추가");
                System.out.println("2. 도서정보 정렬 후 출력");
                System.out.println("3. 도서 삭제");
                System.out.println("4. 도서 검색출력");
                System.out.println("5. 전체 출력");
                System.out.println("6. 끝내기");
    
                System.out.print("\n메뉴 번호 선택 : ");
                int num = sc.nextInt();
                System.out.println();
                sc.nextLine();
    
                switch (num){
                    case 1:
                        BookDTO newBook = inputBook();
                        bm.addBook(newBook);
    
                        System.out.println("도서가 추가되었습니다.");
                        bm.displayAll();
                        break;
    
                    case 2:
                        bm.printBookList(selectSortedBook());
                        break;
    
                    case 3:
                        int bookNo = inputBookNo();
                        bm.deleteBook(bookNo);
    
                        bm.displayAll();

                        break;
    
                    case 4:
                        String title = inputBookTitle();
                        bm.searchBook(title);
    
                        break;
    
                    case 5:
                        bm.displayAll();
                        break;
    
                    case 6:
                        System.out.println("이용해주셔서 감사합니다.");
                        return;
                        
                    default:
                        System.out.println("주어진 기능 중에 골라주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("원하시는 메뉴를 숫자로 입력해주세요");
                sc.nextLine();
            }
        }
    }

    public BookDTO inputBook(){
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        int category = -1;
        while (true) {
            try {
                System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
                category = sc.nextInt();
                if (!(category >= 1 && category <= 4)){
                    System.out.println("1~4 까지의 숫자로 입력해주셔야 합니다.");
                    continue;
                }

                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("도서 장르는 숫자로 입력해주셔야 합니다.");
                sc.nextLine();
            }
        }

        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        while (true){
            count = random.nextInt(1000);

            if (bm.checkNo(count)){
                return new BookDTO(count,category,title,author);
            }
        }
    }

    public int inputBookNo(){
        System.out.print("삭제할 도서의 bNo 번호 : ");
        return sc.nextInt();
    }

    public String inputBookTitle(){
        System.out.print("도서 제목 : ");
        return sc.nextLine();
    }

    // 정렬
    public List<BookDTO> selectSortedBook(){
        System.out.println("1. 도서번호(ISBN)으로 오름차순정렬");
        System.out.println("2. 도서번호(ISBN)으로 내림차순정렬");
        System.out.println("3. 책 제목으로 오름차순 정렬");
        System.out.println("4. 책 제목으로 내림차순 정렬");

        System.out.print("\n원하시는 정렬 방법을 선택해주세요: ");
        int type = sc.nextInt();

        System.out.println("");

        return bm.sortedBookList(type);
    }

}

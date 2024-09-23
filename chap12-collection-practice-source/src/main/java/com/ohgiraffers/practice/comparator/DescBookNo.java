package com.ohgiraffers.practice.comparator;

import com.ohgiraffers.practice.BookDTO;

import java.util.Comparator;

public class DescBookNo implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        
        // 내림차순 정렬
        return Integer.compare(o2.getbNo(),o1.getbNo());
    }
}

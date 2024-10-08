package com.ohgiraffers.practice.comparator;

import com.ohgiraffers.practice.BookDTO;

import java.util.Comparator;

public class DescBookTItle implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}

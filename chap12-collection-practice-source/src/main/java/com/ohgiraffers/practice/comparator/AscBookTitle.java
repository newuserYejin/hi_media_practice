package com.ohgiraffers.practice.comparator;

import com.ohgiraffers.practice.BookDTO;

import java.util.Comparator;

public class AscBookTitle implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

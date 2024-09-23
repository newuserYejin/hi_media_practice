package com.ohgiraffers.practice.comparator;

import com.ohgiraffers.practice.BookDTO;
import java.util.Comparator;

public class AscBookNo implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return Integer.compare(o1.getbNo(),o2.getbNo());
    }
}

package com.ohgiraffers.section01.exception.calculratorException;

public class DivideNotZeroException extends Exception{

    public DivideNotZeroException() {
        super("0에 대해서는 나눗셈 연산이 불가합니다.");
    }

}

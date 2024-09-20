package com.ohgiraffers.section01.exception.calculratorException;

public class MultipleNotZeroException extends Exception{

    public MultipleNotZeroException(){
        super("0을 곱할경우 무조건 0입니다.다른 수를 입력해주세요.");
    }

}

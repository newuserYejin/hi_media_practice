package com.ohgiraffers.section01.exception.calculratorException;

public class AnotherOperatorException extends Exception{

    public AnotherOperatorException(){
        super("+, -, *, / 중의 연산자가 아닙니다.");
    }

}

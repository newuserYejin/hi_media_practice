package com.ohgiraffers.section01.exception;

import com.ohgiraffers.section01.exception.calculratorException.AnotherOperatorException;
import com.ohgiraffers.section01.exception.calculratorException.DivideNotZeroException;
import com.ohgiraffers.section01.exception.calculratorException.MultipleNotZeroException;

public class Calculrator {

    public void startCalculator(int num1,int num2,String str) throws MultipleNotZeroException, DivideNotZeroException, AnotherOperatorException {

        if (str.equals("*")){
            if (num1 == 0 || num2 == 0){
                throw new MultipleNotZeroException();
            }
        }

        if (str.equals("/")){
            if (num1 == 0 || num2 == 0){
                throw new DivideNotZeroException();
            }
        }

        String s="+-/*";

        if (!s.contains(str)){
            throw new AnotherOperatorException();
        }

        switch (str){
            case "+":
                System.out.println(num1 + str + num2 + "= " + (num1+num2));
                break;
            case "-":
                System.out.println(num1 + str + num2 + "= " + (num1-num2));
                break;
            case "*":
                System.out.println(num1 + str + num2 + "= " + (num1*num2));
                break;
            case "/":
                System.out.println(num1 + str + num2 + "= " + (num1/num2));
                break;
            default:
                System.out.println("계산을 종료합니다.");
        }

    }

}

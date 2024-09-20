package com.ohgiraffers.section01.exception;

import com.ohgiraffers.section01.exception.calculratorException.AnotherOperatorException;
import com.ohgiraffers.section01.exception.calculratorException.DivideNotZeroException;
import com.ohgiraffers.section01.exception.calculratorException.MultipleNotZeroException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력해주세요:");
//        String num1 = sc.nextLine();
        int num1 = sc.nextInt();

        System.out.print("두번째 정수를 입력해주세요:");
        int num2 = sc.nextInt();

        sc.nextLine();
        System.out.print("원하는 연산기호를 1개만 입력해주세요(맨 앞 1개만 인식합니다.):");

        // 여러가지 연산기호가 입력됐을 때를 생각해서 가장 앞만 가져온다.
        String str = sc.nextLine().trim().charAt(0) + "";

        Calculrator cal = new Calculrator();

        try {
            cal.startCalculator(num1,num2,str);
        } catch (MultipleNotZeroException e) {
            throw new RuntimeException(e);
        } catch (DivideNotZeroException e) {
            throw new RuntimeException(e);
        } catch (AnotherOperatorException e) {
            throw new RuntimeException(e);
        }

    }
}

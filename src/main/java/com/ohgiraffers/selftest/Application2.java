package com.ohgiraffers.selftest;

public class Application2 {
    public static void main(String[] args) {
        /* 문자형 변수를 하나 선언 후 'a'를 대입한 후
         * 유니코드를 이용해서 문자 'k'가 출력되도록 하세요
         * (문자 직접 입력 금지)
         * */
        char ch1 ='a';
        int ia = ch1;
        int ik = ia + 10;

        char ch2 = (char) ik;

        System.out.println(ch2);


    }
}

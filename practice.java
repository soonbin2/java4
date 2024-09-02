package com.ohgiraffers.section05.typecasting;

public class practice {
    public static void main(String[] args) {
        //문제 1. int를 byte로 강제 형변환 했을시 데이터가 손상 안되게 코딩하라.
        int inum = 90;
        byte bnum = (byte) inum;
        System.out.println(bnum);

        //문제 2. int를 byte로 강제 형변환 했을시 데이터가 손상되게 하라.
        int inum2 = 200;
        byte bnum2 = (byte) inum2;
        System.out.println(bnum2);

        //문제 3. 논리형은 형변환 규칙에서 제외된다. O X
        //O

        //문제 4. 문자형 a를 int 정수형으로 자동변환 했을시 나오는 출력 값은?
        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber = " + charNumber);
        // 97
    }
}

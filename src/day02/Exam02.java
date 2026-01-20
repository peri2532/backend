package day02;

public class Exam02 {
    public static void main(String[] args) {
        //[1] 타입 = 자료형 = 분류 = 자료들을 분류 / 나누는 방법, 다형성 특징(다양한 형/모양 갖는다).
        //(1)자동(묵시적: 개발자가 따로 할게 없음) 타입 변환 , 손실없음
        //byte->short ->int -> long -> float -> double (작은상자 -> 큰상자)
        byte byteValue = 10; //10 자료를 byte 타입으로 분류 했음                    //자료는 10이지만
        short shortValue = byteValue;   //short 타입 -> byte 타입 변환            //껍데기(타입/형식)바꾸기
        int intValue = shortValue;  //int 타입 -> short 타입 변환                //껍데기(타입/형식)바꾸기
        long longValue = intValue;  //long 타입 -> int 타입 변환                 //껍데기(타입/형식)바꾸기
        float floatValue = longValue; //float 타입 -> long 타입 변환             //껍데기(타입/형식)바꾸기
        double doubleValue = floatValue; // float 타입 -> double 타입 변환       //껍데기(타입/형식)바꾸기

        //(2) 연산준 (자동) 타입 변환
        // byte + byte= int, byte + short = byte , int + int = int, int 이하피연산자들은 연산 하면 int로 결과
        //long . float . double 들은 피연산자 중에 더 큰 타입으로 결과.
        byte b1 = 10; byte b2 =20; short s1 = 30; int i1 = 40; long l1 = 50L; float f1 = 3.14F; double d1 =41.25;
        int result1 = b1 + b2;
        int result2 = b1 + s1;
        int result3 =i1 +i1;
        Long result4 = i1 +l1;
        float result5 = i1 + f1;
        double result6 = i1 + d1;

        //(3) 강제 타입 변환/캐스팅 (명시적: 개발자가 변환할 타입 작성), 손실있음
        //double -> float ->long-> int -> short -> byte (큰 상자 -> 작은 상자)
        double dvalue = 3.14;
        float fvalue = (float)dvalue; //(새로운타입)기존값
        long lvalue = (long)fvalue;
        int ivalue = (int)lvalue;
        short svalue = (short)ivalue;
        byte bvalue = (byte)svalue;     // bvalue 에는 3자료가 들어있다. 손실 발생.


    }
}
